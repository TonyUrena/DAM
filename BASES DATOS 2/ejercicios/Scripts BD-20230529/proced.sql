CREATE DATABASE proced;
USE proced;

CREATE TABLE alumne
(codi INT PRIMARY KEY AUTO_INCREMENT,
nom VARCHAR(20) NOT NULL,
cognom VARCHAR(20) NOT NULL,
data_naixement DATE,
edat INT
);

INSERT INTO alumne VALUES (NULL,'Guillem','Homet','1992/12/20',NULL);
INSERT INTO alumne VALUES (NULL,'Marta','Ros','1993/01/21',NULL);
INSERT INTO alumne VALUES (NULL,'Miquel','Rodríguez','1990/10/11',NULL);

CREATE TABLE professor
(codi INT PRIMARY KEY AUTO_INCREMENT,
nom VARCHAR(20) NOT NULL,
cognom VARCHAR(20) NOT NULL,
data_naixement DATE,
edat INT
);

INSERT INTO professor VALUES (NULL,'Núria','Ribas','1985/10/06',NULL);
INSERT INTO professor VALUES (NULL,'Carles','Pujol','1978/06/14',NULL);
