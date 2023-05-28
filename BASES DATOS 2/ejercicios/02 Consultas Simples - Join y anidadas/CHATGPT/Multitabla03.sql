-- Tabla de Desarrolladoras
CREATE TABLE Desarrolladoras (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    pais VARCHAR(100)
);

-- Tabla de Plataformas
CREATE TABLE Plataformas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla de Juegos
CREATE TABLE Juegos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    desarrolladora_id INT,
    plataforma_id INT,
    lanzamiento DATE,
    FOREIGN KEY (desarrolladora_id) REFERENCES Desarrolladoras(id),
    FOREIGN KEY (plataforma_id) REFERENCES Plataformas(id)
);


-- Tabla de Valoración
CREATE TABLE Valoracion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    juego_id INT,
    puntuacion INT,
    comentario VARCHAR(255),
    FOREIGN KEY (juego_id) REFERENCES Juegos(id)
);

-- Llenar la tabla Desarrolladoras
INSERT INTO Desarrolladoras (nombre, pais) VALUES
    ('Nintendo', 'Japón'),
    ('Rockstar Games', 'Estados Unidos'),
    ('Electronic Arts', 'Estados Unidos'),
    ('Ubisoft', 'Francia'),
    ('CD Projekt Red', 'Polonia'),
    ('Naughty Dog', 'Estados Unidos');

-- Llenar la tabla Plataformas
INSERT INTO Plataformas (nombre) VALUES
    ('PlayStation 5'),
    ('Xbox Series X'),
    ('Nintendo Switch'),
    ('PC'),
    ('PlayStation 4'),
    ('Xbox One'),
    ('Virtual Boy');

-- Llenar la tabla Juegos
INSERT INTO Juegos (nombre, desarrolladora_id, plataforma_id, lanzamiento) VALUES
    ('The Legend of Zelda: Breath of the Wild', 1, 3, '2017-03-03'),
    ('Grand Theft Auto V', 2, 1, '2013-09-17'),
    ('FIFA 21', 3, 4, '2020-10-09'),
    ('Assassin''s Creed Valhalla', 4, 2, '2020-11-10'),
    ('Cyberpunk 2077', 5, 4, '2020-12-10'),
    ('The Last of Us Part II', 6, 1, '2020-06-19'),
    ('Super Mario Odyssey', 1, 3, '2017-10-27'),
    ('Red Dead Redemption 2', 2, 1, '2018-10-26'),
    ('FIFA 20', 3, 4, '2019-09-27'),
    ('Assassin''s Creed Odyssey', 4, 2, '2018-10-05'),
    ('The Witcher 3: Wild Hunt', 5, 4, '2015-05-19'),
    ('Uncharted 4: A Thief''s End', 6, 1, '2016-05-10'),
    ('Animal Crossing: New Horizons', 1, 3, '2020-03-20'),
    ('Gears 5', 2, 2, '2019-09-10'),
    ('Madden NFL 21', 3, 4, '2020-08-28');

-- Llenar la tabla Valoracion
INSERT INTO Valoracion (juego_id, puntuacion, comentario) VALUES
    (1, 9, 'Excelente juego, muy recomendado.'),
    (2, 8, 'Gran experiencia de juego, aunque tiene algunos problemas técnicos.'),
    (3, 7, 'Buen juego, pero no aporta muchas novedades respecto a la versión anterior.'),
    (4, 9, 'Me encanta este juego, la historia y la ambientación son geniales.'),
    (5, 6, 'Buena idea, pero la ejecución no fue la mejor.'),
    (6, 10, 'Obra maestra, una experiencia emocionalmente intensa.'),
    (7, 9, 'Divertido y lleno de sorpresas, un juego que nunca aburre.'),
    (8, 8, 'Una aventura épica con personajes memorables.'),
    (9, 7, 'Cumple con las expectativas, pero no destaca demasiado.'),
    (10, 9, 'Una joya de RPG, amplio y detallado mundo por explorar.');


-- Obtener el nombre del juego, nombre de la desarrolladora y nombre de la plataforma para todos los juegos:
    SELECT Juegos.nombre, Desarrolladoras.nombre, Plataformas.nombre
    FROM Juegos
    JOIN Desarrolladoras ON Juegos.desarrolladora_id = Desarrolladoras.id
    JOIN Plataformas ON Juegos.plataforma_id = Plataformas.id;

-- Obtener el nombre del juego y su puntuación promedio para todos los juegos que tienen valoraciones:
    /* COn right join nos aseguramos que sólo aparecen los elementos que SI tienen una coincidencia en el ON */
    SELECT Juegos.nombre, AVG(Valoracion.puntuacion)
    FROM Juegos
    RIGHT JOIN Valoracion ON Juegos.id = Valoracion.juego_id
    GROUP BY Juegos.nombre;

-- Obtener el nombre del juego, nombre de la desarrolladora y nombre de la plataforma para todos los juegos que fueron lanzados después de 2019:
    SELECT Juegos.nombre AS "Juego", Desarrolladoras.nombre AS "Desarrolladora", Plataformas.nombre AS "Plataforma", Juegos.lanzamiento
    FROM Juegos
    JOIN Desarrolladoras ON Juegos.desarrolladora_id = Desarrolladoras.id
    JOIN Plataformas ON Juegos.plataforma_id = Plataformas.id
    WHERE Juegos.lanzamiento > '2019-12-31';

-- Obtener el nombre del juego, nombre de la desarrolladora y nombre de la plataforma para todos los juegos desarrollados por la compañía "Ubisoft":
    SELECT Juegos.nombre AS "Juego", Desarrolladoras.nombre AS "Desarrolladora", Plataformas.nombre AS "Plataforma"
    FROM Juegos
    JOIN Desarrolladoras ON Juegos.desarrolladora_id = Desarrolladoras.id
    JOIN Plataformas ON Juegos.plataforma_id = Plataformas.id
    WHERE Desarrolladoras.nombre = "Ubisoft";
            
-- Obtener el nombre del juego, nombre de la desarrolladora y nombre de la plataforma para todos los juegos con una puntuación superior a 8:
    SELECT Juegos.nombre AS "Juego", Desarrolladoras.nombre AS "Desarrolladora", Plataformas.nombre AS "Plataformas", Valoracion.puntuacion
    FROM Juegos
    JOIN Desarrolladoras ON Juegos.desarrolladora_id = Desarrolladoras.id
    JOIN Plataformas ON Juegos.plataforma_id = Plataformas.id
    JOIN Valoracion ON Valoracion.juego_id = Juegos.id
    WHERE Valoracion.puntuacion > 8;

-- Obtener el nombre de la desarrolladora de los juegos que tienen una valoración promedio mayor a 8:
    SELECT Desarrolladoras.nombre AS "Desarrolladora" 
    FROM Desarrolladoras
    WHERE Desarrolladoras.id IN(
        SELECT Juegos.desarrolladora_id
        FROM Juegos
        JOIN Valoracion ON Juegos.id = Valoracion.juego_id
        GROUP BY Juegos.id
        HAVING AVG(Valoracion.puntuacion) > 8
    );

-- Obtener el nombre de los juegos que han sido lanzados en la misma plataforma que el juego "The Legend of Zelda: Breath of the Wild":
    SELECT Juegos.nombre
    FROM Juegos
    WHERE Juegos.plataforma_id = (
        SELECT Juegos.plataforma_id
        FROM Juegos
        WHERE Juegos.nombre= 'The Legend of Zelda: Breath of the Wild'
    );


-- Obtener el nombre de los juegos desarrollados por la misma compañía que desarrolló el juego "Grand Theft Auto V":
    SELECT Juegos.nombre
    FROM Juegos
    WHERE Juegos.desarrolladora_id = (
        SELECT Juegos.desarrolladora_id
        FROM Juegos
        WHERE Juegos.nombre = "Grand Theft Auto V"
    );

-- Obtener el nombre de los juegos que no tienen ninguna valoración registrada:
    SELECT Juegos.nombre
    FROM Juegos
    WHERE Juegos.id NOT IN (
        SELECT Valoracion.juego_id
        FROM Valoracion
    );

-- Obtener el nombre de los juegos que han sido lanzados después del juego "The Witcher 3: Wild Hunt":
    SELECT Juegos.nombre
    FROM Juegos
    WHERE Juegos.lanzamiento > (
        SELECT Juegos.lanzamiento
        FROM Juegos
        WHERE Juegos.nombre = "The Witcher 3: Wild Hunt"
    );

-- Obtener el nombre de la desarrolladora que ha lanzado el juego con la puntuación máxima:
    SELECT Desarrolladoras.nombre
    FROM Desarrolladoras
    WHERE Desarrolladoras.id = (
        SELECT Juegos.desarrolladora_id
        FROM Juegos
        JOIN Valoracion ON Juegos.id = Valoracion.juego_id
        WHERE Valoracion.puntuacion = (
            SELECT MAX(puntuacion)
            FROM Valoracion
        )
    );

-- Obtener el nombre de los juegos que tienen una valoración promedio mayor a la valoración promedio de todos los juegos:

SELECT Juegos.nombre
FROM Juegos
JOIN Valoracion ON Valoracion.juego_id = Juegos.id
WHERE Valoracion.puntuacion >(
    SELECT AVG(Valoracion.puntuacion)
    FROM Valoracion
);

-- Obtener el nombre de los juegos que han sido desarrollados por una compañía con nacionalidad distinta a "Estados Unidos":

SELECT Juegos.nombre
FROM Juegos
JOIN Desarrolladoras ON Juegos.desarrolladora_id = Desarrolladoras.id
WHERE Desarrolladoras.pais != "Estados Unidos";

-- Obtener el nombre de las desarrolladoras que tienen al menos un juego en la plataforma "Nintendo Switch":
SELECT nombre
FROM Desarrolladoras
WHERE id IN 
(
    -- Devuelve el id de desarrolladora cada campo en juegos donde el id de plataforma sea igual a switch
    SELECT desarrolladora_id 
    FROM Juegos 
    WHERE plataforma_id = 
    (
        -- Devuelve el id de la plataforma switch
        SELECT id 
        FROM Plataformas 
        WHERE nombre = 'Nintendo Switch'
        )
    );

-- Obtener los juegos que tienen una puntuación superior a la puntuación promedio de todos los juegos:

    SELECT Juegos.nombre
    FROM Juegos
    JOIN Valoracion ON Valoracion.juego_id = Juegos.id
    WHERE Valoracion.puntuacion >
    (
        SELECT AVG(Valoracion.puntuacion)
        FROM Valoracion
    );


-- Obtener los juegos que fueron lanzados por la misma desarrolladora que el juego "The Legend of Zelda: Breath of the Wild":

    SELECT nombre
    FROM Juegos
    WHERE desarrolladora_id = 
    (
        SELECT desarrolladora_id
        FROM Juegos
        WHERE nombre = "The Legend of Zelda: Breath of the Wild"
    );

-- Obtener el nombre de las plataformas que no tienen juegos asociados:
    
    SELECT nombre
    FROM Plataformas
    WHERE id NOT IN 
    (
        SELECT plataforma_id
        FROM Juegos
    );
