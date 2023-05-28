CREATE TABLE Clientes (
  id_cliente INT PRIMARY KEY,
  nombre VARCHAR(50),
  direccion VARCHAR(100),
  telefono VARCHAR(15)
);

CREATE TABLE Productos (
  id_producto INT PRIMARY KEY,
  nombre VARCHAR(50),
  precio DECIMAL(10, 2),
  stock INT
);

CREATE TABLE Pedidos (
  id_pedido INT PRIMARY KEY,
  id_cliente INT,
  fecha_pedido DATE,
  total DECIMAL(10, 2),
  FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente)
);

CREATE TABLE Detalles_Pedido (
  id_detalle INT PRIMARY KEY,
  id_pedido INT,
  id_producto INT,
  cantidad INT,
  subtotal DECIMAL(10, 2),
  FOREIGN KEY (id_pedido) REFERENCES Pedidos(id_pedido),
  FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)
);

INSERT INTO Clientes (id_cliente, nombre, direccion, telefono)
VALUES
(1, 'John Doe', '123 Main St, City', '555-1234'),
(2, 'Jane Smith', '456 Elm St, Town', '555-5678'),
(3, 'Michael Johnson', '789 Oak St, Village', '555-9012');

INSERT INTO Productos (id_producto, nombre, precio, stock)
VALUES
(1, 'Camiseta', 19.99, 50),
(2, 'Pantalón', 39.99, 30),
(3, 'Zapatos', 59.99, 20),
(4, 'Bolso', 29.99, 10);

INSERT INTO Pedidos (id_pedido, id_cliente, fecha_pedido, total)
VALUES
(1, 1, '2023-05-20', 79.97),
(2, 2, '2023-05-21', 109.98),
(3, 3, '2023-05-22', 59.99);

INSERT INTO Detalles_Pedido (id_detalle, id_pedido, id_producto, cantidad, subtotal)
VALUES
(1, 1, 1, 2, 39.98),
(2, 1, 3, 1, 59.99),
(3, 2, 2, 1, 39.99),
(4, 2, 4, 2, 59.98),
(5, 3, 1, 1, 19.99),
(6, 3, 2, 1, 39.99);

Ejemplo 1: Obtener el nombre del cliente y la fecha de cada pedido realizado:
SELECT Clientes.nombre, Pedidos.fecha_pedido
FROM Clientes
JOIN Pedidos ON Clientes.id_cliente = Pedidos.id_cliente;

Ejemplo 2: Obtener los detalles (nombre del producto, cantidad y subtotal) de un pedido específico:
SELECT Productos.nombre, Detalles_Pedido.cantidad, Detalles_Pedido.subtotal
FROM Productos
JOIN Detalles_Pedido ON Productos.id_producto = Detalles_Pedido.id_producto
WHERE Detalles_Pedido.id_pedido = 1;

Ejemplo 3: Obtener el nombre y el total gastado por cada cliente:
SELECT Clientes.nombre, SUM(Pedidos.total)
FROM Clientes
JOIN Pedidos ON Clientes.id_cliente = Pedidos.id_cliente
GROUP BY Clientes.nombre;

