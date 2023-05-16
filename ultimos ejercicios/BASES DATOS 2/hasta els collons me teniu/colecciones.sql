CREATE DATABASE colecciones;

USE colecciones;

------------------ CREATE ------------------------

CREATE TABLE articulos(
    id_articulo varchar(20) UNIQUE,
    nombre varchar(200),
    fecha_lanzamiento date,
    fecha_compra date DEFAULT '1970-01-01',
    valoracion int,
    rareza int DEFAULT 1,
    cantidad int DEFAULT 1,
    PRIMARY KEY (id_articulo)
);

CREATE TABLE plataformas(
    id_plataforma varchar(20) UNIQUE,
    tipo ENUM('Consola', 'Ordenador'),
    fabricante varchar(50),
    PRIMARY KEY (id_plataforma),
    FOREIGN KEY (id_plataforma) REFERENCES articulos(id_articulo)
);

CREATE TABLE videojuegos(
    id_videojuego varchar(20) UNIQUE,
    id_plataforma varchar(50),
    productor varchar (200),
    programador varchar (200),
    diseñador varchar (200),
    formato ENUM('CD', 'Cartucho', 'Diskette', 'DVD', 'Cinta'),
    packaging ENUM('Big Box', 'Small Box', 'Plataforma', 'Sin Caja', 'Jewel'),
    PRIMARY KEY (id_videojuego),
    FOREIGN KEY (id_videojuego) REFERENCES articulos(id_articulo),
    FOREIGN KEY (id_plataforma) REFERENCES plataformas(id_plataforma)
);

CREATE TABLE software(
    id_software varchar(20) UNIQUE,
    id_plataforma varchar(20),
    compañia varchar(200),
    formato ENUM('CD', 'Cartucho', 'Diskette', 'DVD', 'Cinta'),
    packaging ENUM('Big Box', 'Small Box', 'Plataforma', 'Sin Caja', 'Jewel'),
    PRIMARY KEY (id_software),
    FOREIGN KEY (id_software) REFERENCES articulos(id_articulo),
    FOREIGN KEY (id_plataforma) REFERENCES plataformas(id_plataforma)

);

CREATE TABLE juegos_de_mesa(
    id_juego_mesa varchar(20) UNIQUE,
    PRIMARY KEY (id_juego_mesa),
    FOREIGN KEY (id_juego_mesa) REFERENCES articulos(id_articulo)
);

CREATE TABLE warhammer(
    id_warhammer varchar(20) UNIQUE,
    ejercito varchar(50),
    unidad varchar(50),
    pintado ENUM('si', 'no') DEFAULT 'no',
    montado ENUM('si', 'no') DEFAULT 'no'
);

CREATE TABLE libros(
    id_libro varchar(20) UNIQUE,
    autor varchar(200),
    paginas int,
    PRIMARY KEY (id_libro),
    FOREIGN KEY (id_libro) REFERENCES articulos(id_articulo)
);

CREATE TABLE lego(
    id_lego varchar(20) UNIQUE,
    piezas int,
    PRIMARY KEY (id_lego),
    FOREIGN KEY (id_lego) REFERENCES articulos(id_articulo)
);

CREATE TABLE sylvanian(
    id_sylvanian varchar(20) UNIQUE,
    PRIMARY KEY (id_sylvanian), 
    FOREIGN KEY (id_sylvanian) REFERENCES articulos(id_articulo)
);


------------------ INSERT ------------------------

------------------ PLATAFORMAS ------------------------

INSERT INTO articulos VALUES(
    'PLA0000',
    'PC',
    '1980-1-1',
    DEFAULT,
    5,
    DEFAULT,
    DEFAULT
);

INSERT INTO plataformas VALUES(
    'PLA0000',
    'Ordenador',
    NULL
);

INSERT INTO articulos VALUES(
    'PLA0001',
    'Sega Mega Drive (Genesis)',
    '1989-10-10',
    '1995-05-05',
    5,
    DEFAULT,
    DEFAULT
);

INSERT INTO plataformas VALUES(
    'PLA0001',
    'Consola',
    'SEGA'
);

INSERT INTO articulos VALUES(
    'PLA0002',
    'Nintendo Entertainment System (Famicom)',
    '1983-07-15',
    '2017-05-02',
    5,
    DEFAULT,
    DEFAULT
);

INSERT INTO plataformas VALUES(
    'PLA0002',
    'Consola',
    'Nintendo'
);



------------------ VIDEOJUEGOS ------------------------

INSERT INTO articulos VALUES(
    'VID0000',
    'Half Life',
    '1998-11-19',
    DEFAULT,
    5,
    DEFAULT,
    DEFAULT
);

INSERT INTO videojuegos VALUES(
    'VID0000',
    'PLA0000',
    'Valve',
    'Valve',
    'Valve',
    'CD',
    'Big Box'
);

INSERT INTO articulos VALUES(
    'VID0001',
    'Half Life - Opposing Force',
    '1999-11-19',
    DEFAULT,
    3,
    DEFAULT,
    DEFAULT
);

INSERT INTO videojuegos VALUES(
    'VID0001',
    'PLA0000',
    'Valve',
    'Gearbox',
    'Gearbox',
    'CD',
    'Big Box'
);

INSERT INTO articulos VALUES(
    'VID0002',
    'Sonic The Hedgehog',
    '1991-06-23',
    '1995-05-05',
    4,
    DEFAULT,
    DEFAULT
);

INSERT INTO videojuegos VALUES(
    'VID0002',
    'PLA0001',
    'SEGA',
    'SEGA',
    'SEGA',
    'Cartucho',
    'Plataforma'
);

INSERT INTO  articulos VALUES(
    'VID0003',
    'Dynamite Headdy',
    '1995-10-1',
    '1996-5-6',
    5,
    3,
    DEFAULT
);

INSERT INTO videojuegos VALUES(
    'VID0003',
    'PLA0001',
    'SEGA',
    'Treasure',
    'Treasure',
    'Cartucho',
    'Plataforma'
);

INSERT INTO articulos VALUES(
    'VID0004',
    'Super Mario Bros. 3',
    '1988-10-23',
    '2017-05-02',
    5,
    DEFAULT,
    DEFAULT
);

INSERT INTO videojuegos VALUES(
    'VID0004',
    'PLA0002',
    'Nintendo',
    'Nintendo',
    'Sigeru Miyamoto',
    'Cartucho',
    'Sin Caja'
);

INSERT INTO articulos VALUES(
    'VID0005',
    'Super Mario Bros. - Tetris - Nintendo World Cup',
    '1988-10-23',
    '2017-05-02',
    3,
    DEFAULT,
    DEFAULT
);

INSERT INTO videojuegos VALUES(
    'VID0005',
    'PLA0002',
    'Nintendo',
    'Nintendo',
    'Sigeru Miyamoto',
    'Cartucho',
    'Sin Caja'
);


--------------------------CONSULTAS--------------------
Muestra todos los datos de todos los videjuegos

SELECT * 
FROM videojuegos
JOIN articulos ON videojuegos.id_videojuego = articulos.id_articulo;


Muestra el nombre de todos los videojuegos en formato Cartucho

SELECT nombre
FROM videojuegos
JOIN articulos ON videojuegos.id_videojuego = articulos.id_articulo
WHERE formato = 'Cartucho';

Muestra el nombre y la plataforma de todos los videojuegos

SELECT av.nombre, ap.nombre
from (plataformas p JOIN articulos ap ON p.id_plataforma = ap.id_articulo)
join (videojuegos v JOIN articulos av ON v.id_videojuego = av.id_articulo) ON v.id_plataforma = p.id_plataforma;

/* 
Hacemos primero dos joins (los que estan entre parentesis) para relacionar 
los id de plataforma y videojuego con sus respectivos id de articulo.
una vez estan relacionados hacemos un join entre estas dos tablas resultantes,
usando otra vez el ON para relacionar el id_plataforma de videojuegos y plataforma

El tema es que join saca el resultado SOLO de los elementos que coinciden.
Con ON le damos la condición para esa coincidencia.

El select recoge los datos de av y ap pues son los alias (unicos) de cada tabla 
resultante de cada uno de los joins
*/

Muestra el nombre y la plataforma de los videojuegos lanzados despues de 1990

SELECT av.nombre, ap.nombre, av.fecha_lanzamiento
from (plataformas p JOIN articulos ap ON p.id_plataforma = ap.id_articulo)
join (videojuegos v JOIN articulos av ON v.id_videojuego = av.id_articulo) ON v.id_plataforma = p.id_plataforma
where av.fecha_lanzamiento > '1990-12-31';
/*
    pedimos la fecha de lanzamiento de una tabla concreta, pues al hacer el join tenemos tanto
    las fechas de lanzamiento de las plataformas como las de los videojuegos
*/
