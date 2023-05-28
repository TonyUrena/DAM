CREATE TABLE Usuarios (
  id INT PRIMARY KEY,
  nombre VARCHAR(50),
  edad INT
);

CREATE TABLE Pedidos (
  id INT PRIMARY KEY,
  usuario_id INT,
  producto VARCHAR(50),
  cantidad INT,
  FOREIGN KEY (usuario_id) REFERENCES Usuarios(id)
);

INSERT INTO Usuarios (id, nombre, edad) VALUES
  (1, 'Juan', 25),
  (2, 'María', 30),
  (3, 'Carlos', 28),
  (4, 'FRANCISCO FRANCO BAHAMONDE', 28);

INSERT INTO Pedidos (id, usuario_id, producto, cantidad) VALUES
  (1, 1, 'Producto A', 2),
  (2, 1, 'Producto B', 3),
  (3, 2, 'Producto C', 1),
  (4, 3, 'Producto A', 5);

1. Mostrar todos los usuarios y sus pedidos correspondientes:

SELECT * 
FROM Usuarios
JOIN Pedidos ON Usuarios.id = Pedidos.usuario_id;

2. Mostrar los usuarios que hayan realizado al menos un pedido:
SELECT Usuarios.nombre
FROM Usuarios
JOIN Pedidos ON Usuarios.id = Pedidos.usuario_id
GROUP BY Usuarios.id;

3. Mostrar los usuarios y la cantidad total de productos que han pedido:
SELECT Usuarios.nombre, SUM(Pedidos.cantidad) AS "Cantidad Total"
FROM Usuarios
JOIN Pedidos ON Usuarios.id = Pedidos.usuario_id
GROUP BY Usuarios.id;

4. Mostrar los usuarios y la cantidad promedio de productos que han pedido:
SELECT Usuarios.nombre, AVG(Pedidos.cantidad) AS "Media de pedidos"
FROM Usuarios
JOIN Pedidos ON Usuarios.id = Pedidos.usuario_id
GROUP BY Usuarios.id;

5. Mostrar los usuarios y la cantidad de pedidos que han realizado:
SELECT Usuarios.nombre, COUNT(Pedidos.Id) AS "cantidad de pedidos"
FROM Usuarios
JOIN Pedidos ON Usuarios.id = Pedidos.usuario_id
GROUP BY Usuarios.id;

6. Mostrar los usuarios que han realizado pedidos del producto "Producto A":
SELECT Usuarios.nombre
FROM Usuarios
JOIN Pedidos ON Usuarios.id = Pedidos.usuario_id
WHERE producto = 'Producto A';

7. Mostrar los usuarios que no han realizado ningún pedido:
/* LEFT JOIN MUESTRA LOS RESULTADOS DE LA UNION AUNQUE NO HAYAN RESULTADOS COINCIDENTES DEL ON */
SELECT Usuarios.nombre
FROM Usuarios
LEFT JOIN Pedidos ON Usuarios.id = Pedidos.usuario_id
WHERE Pedidos.id IS NULL;