/* AVISO LO QUE SIGUE ES UNA PUTA MIERDA SIN SENTIDO:
CREA UNA BASE DE DATOS PERO NO ES FUNCIONAL,  LOS
EJERCICIOS DE JUANJO ESTAN MAL CORREGIDOS, PUNTO.*/

CREATE TABLE empleados
(numemp INTEGER,
nombre CHAR(30),
edad INTEGER,
oficina INTEGER,
titulo CHAR(20),
contrato DATE,
jefe INTEGER,
cuota INTEGER,
ventas INTEGER,
PRIMARY KEY (numemp));

CREATE TABLE oficinas
(oficina INTEGER,
ciudad CHAR(20),
region CHAR(20),
dir INTEGER,
objetivo INTEGER,
ventas INTEGER,
PRIMARY KEY (oficina));

CREATE TABLE clientes
(numclie INTEGER,
nombre CHAR(30),
repclie INTEGER,
limitecredito INTEGER,
PRIMARY KEY (numclie));

CREATE TABLE productos
(idfab CHAR(3),
idproducto CHAR(5),
descripcion CHAR(20),
precio INTEGER,
existencias INTEGER,
PRIMARY KEY (idfab, idproducto));

CREATE TABLE pedidos
(codigo INTEGER,
numpedido INTEGER,
fechapedido DATE,
clie INTEGER,
rep INTEGER,
fab CHAR(3),
producto CHAR(5),
cant INTEGER,
importe INTEGER,
PRIMARY KEY (codigo));

ALTER TABLE empleados
ADD CONSTRAINT oficina FOREIGN KEY (oficina)
REFERENCES oficinas (oficina),
ADD CONSTRAINT jefe FOREIGN KEY (jefe)
REFERENCES empleados (numemp);

ALTER TABLE oficinas
ADD CONSTRAINT dir FOREIGN KEY (dir)
REFERENCES empleados (numemp);

ALTER TABLE clientes
ADD CONSTRAINT repclie FOREIGN KEY (repclie)
REFERENCES empleados (numemp);

ALTER TABLE pedidos
ADD CONSTRAINT clie FOREIGN KEY (clie)
REFERENCES clientes (numclie),
ADD CONSTRAINT rep FOREIGN KEY (rep)
REFERENCES empleados (numemp),
ADD CONSTRAINT fab FOREIGN KEY (fab)
REFERENCES productos (idfab),
ADD CONSTRAINT producto FOREIGN KEY (producto)
REFERENCES productos (idproducto);

INSERT INTO pedidos VALUES (1, 110036, '1997-01-02', 2107, 110, 'aci', '4100z', 9, 22500);

INSERT INTO clientes VALUES (2101, 'Luis García Anton', 106, 65000);

INSERT INTO oficinas VALUES (101, 'Antonio Viguer', 45, 12, 'representante', '1986-10-20', 104, 300000, 305000);

INSERT INTO oficinas VALUES (11, 'Valencia', 'este', 106, 570000, 693000);

INSERT INTO productos VALUES ('aci', '41001', 'arandela', 58, 277);