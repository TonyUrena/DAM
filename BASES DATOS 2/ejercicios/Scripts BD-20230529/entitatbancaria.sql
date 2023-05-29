CREATE DATABASE IF NOT EXISTS entitatbancaria;

CREATE TABLE IF NOT EXISTS entitatbancaria.centralsindical 
   ( codi_central  TINYINT PRIMARY KEY,
     nom_central VARCHAR(40) NOT NULL UNIQUE,
     quota DECIMAL(8,2)
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.categoria
   ( codi_categ TINYINT PRIMARY KEY,
     nom_categ VARCHAR(30) NOT NULL UNIQUE,
     sou_base DECIMAL(8,2) NOT NULL,
     hora_extra DECIMAL(8,2)
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.ciutat
   ( codi_ciutat TINYINT PRIMARY KEY,
     nom_ciutat VARCHAR(30) NOT NULL,
     nombre_hab INT
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.empleat
   ( codi_emp TINYINT PRIMARY KEY, 
     dni CHAR(12) UNIQUE NOT NULL,
     nss CHAR(20) UNIQUE NOT NULL,
     nom VARCHAR(20) NOT NULL,
     cognom VARCHAR(20) NOT NULL,
     codi_ciutat TINYINT,
     codi_central TINYINT,
     codi_categ TINYINT,
     FOREIGN KEY (codi_ciutat) REFERENCES ciutat (codi_ciutat) ON DELETE SET NULL ON UPDATE CASCADE,
     FOREIGN KEY (codi_central) REFERENCES centralsindical (codi_central) ON DELETE SET NULL ON UPDATE CASCADE,
     FOREIGN KEY (codi_categ) REFERENCES categoria (codi_categ) ON DELETE SET NULL ON UPDATE CASCADE
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.agencia
   ( codi_ag TINYINT PRIMARY KEY,
     nom_ag VARCHAR(30) NOT NULL,
     adreca VARCHAR(30),
     telefon CHAR(9),
     codi_ciutat TINYINT,
     FOREIGN KEY (codi_ciutat) REFERENCES ciutat (codi_ciutat) ON DELETE SET NULL ON UPDATE CASCADE
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.titol
   ( codi_titol TINYINT PRIMARY KEY,
     nom_titol CHAR(30) NOT NULL
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.trasllat
   ( codi_emp TINYINT,
     codi_ag TINYINT,
     data_ini DATE,
     data_fi DATE,
     PRIMARY KEY (codi_emp,data_ini), 
     FOREIGN KEY (codi_ag) REFERENCES agencia (codi_ag)  ON DELETE SET NULL ON UPDATE CASCADE,
     FOREIGN KEY (codi_emp) REFERENCES empleat (codi_emp)  ON DELETE NO ACTION ON UPDATE CASCADE
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.titulacions
   (  codi_emp TINYINT,
      codi_titol TINYINT, 
      data_obt DATE,
      PRIMARY KEY (codi_emp, codi_titol),
      FOREIGN KEY (codi_emp) REFERENCES empleat (codi_emp) ON DELETE NO ACTION ON UPDATE CASCADE,
      FOREIGN KEY (codi_titol) REFERENCES titol (codi_titol) ON DELETE NO ACTION ON UPDATE CASCADE
    ) engine=InnoDB;

USE entitatbancaria;

INSERT INTO centralsindical VALUES (1, 'Comissions Obreres (CCOO)', 12.65);

INSERT INTO centralsindical VALUES (2, 'UniÓ General de Treballadors (UGT)', 13);

INSERT INTO centralsindical VALUES (3, 'Confederació General del Treball', 16.40);

INSERT INTO categoria VALUES (1, 'Director', 2000, 50);

INSERT INTO categoria VALUES (2, 'Sosdirector', 1700, 30);

INSERT INTO categoria VALUES (3, 'Caixer', 1100, 12);

INSERT INTO ciutat VALUES ( 1, 'Barcelona', 1500000);

INSERT INTO ciutat VALUES ( 2, 'Tarragona', 600000);

INSERT INTO ciutat VALUES ( 3, 'Lleida',700000 );

INSERT INTO ciutat VALUES ( 4, 'Girona', 800000);

INSERT INTO empleat VALUES ( 1, '12345678A', 'MOCA12345678',  'Francisco', 'Aranda', 1, NULL,1 );

INSERT INTO empleat VALUES ( 2, '23456789B', 'ABCD87654321',  'David', 'Garcia', 1,  2, 2);

INSERT INTO empleat VALUES (3 , '34567899C', 'ASDF11223344',  'Issac', 'Aymerich ',  1,  2, 3);

INSERT INTO empleat VALUES (4 , '45678111D', 'ZXCV11223344',  'David', 'Almodovar', 1 ,  NULL, 3);

INSERT INTO empleat VALUES ( 5, '11111111E', 'QWER22334455',  'Hector', 'Escriche', 2 ,  NULL, 1);

INSERT INTO empleat VALUES (6 , '22223333F', 'QAZW12345678',  'David', 'Balasch', 2 ,  1, 2);

INSERT INTO empleat VALUES ( 7, '44444444G', 'POIU12345678',  'Daniel', 'Calvo', 2 ,  2, 3);

INSERT INTO empleat VALUES (8 , '55555555H', 'MNBV12341234',  'Marc', 'Cama', 3,  NULL,  1);

INSERT INTO empleat VALUES ( 9, '12312345I', 'LKJH12345678',  'Marc', 'Casas', 3 ,  3,  3);

INSERT INTO empleat VALUES ( 10, '98765432J', 'EDCR88776655',  'Yerai', 'Corrochano',  4,  NULL, 1);

INSERT INTO empleat VALUES ( 11, '98769876K', 'ERFV88776655',  'Jonathan', 'Rodriguez',  4,  3, 3);

INSERT INTO agencia VALUES (1, 'Pi i Margall', 'C/ Pi i Margall 23', '932848888', 1);

INSERT INTO agencia VALUES (2, 'Fluvia', 'C/ Fluvia 123', '931112233', 1);

INSERT INTO agencia VALUES (3, 'Balmes', 'C/ Balmes 145', '977112233', 2);

INSERT INTO agencia VALUES (4, 'La Garriga', 'C/ La Garriga 12', '971223344', 3);

INSERT INTO agencia VALUES (5, 'Banyoles', 'C/ Banoyoles 67', '972998877', 4);

INSERT INTO titol VALUES (1, 'Llicenciat en Economiques');

INSERT INTO titol VALUES (2, 'Llicenciat en Empresarials');

INSERT INTO titol VALUES (3, 'Batxillerat');

INSERT INTO titol VALUES (4, 'Administratiu');

INSERT INTO titol VALUES (5, 'Master ESADE');

INSERT INTO trasllat VALUES (1,1,'1991-01-01','1992-01-01');

INSERT INTO trasllat VALUES (1,3,'1992-01-01','1993-01-01');

INSERT INTO trasllat VALUES (1,2,'1993-01-01',NULL);

INSERT INTO trasllat VALUES (2,1,'1991-01-01','1995-01-01');

INSERT INTO trasllat VALUES (2,3,'1997-01-01',NULL);

INSERT INTO trasllat VALUES (3,2,'1991-01-01',NULL);

INSERT INTO trasllat VALUES (4,3,'1992-01-01',NULL);

INSERT INTO trasllat VALUES (5,3,'1993-01-01',NULL);

INSERT INTO trasllat VALUES (6,4,'1991-01-01','1997-01-01');

INSERT INTO trasllat VALUES (6,2,'1998-01-01',NULL);

INSERT INTO trasllat VALUES (7,1,'1991-01-01',NULL);

INSERT INTO trasllat VALUES (8,2,'1991-01-01','1999-01-01');

INSERT INTO trasllat VALUES (8,3,'1999-01-01',NULL);

INSERT INTO trasllat VALUES (9,1,'1991-01-01','1992-01-01');

INSERT INTO trasllat VALUES (9,3,'1993-01-01','1997-01-01');

INSERT INTO trasllat VALUES (9,2,'1998-01-01',NULL);

INSERT INTO trasllat VALUES (9,4,'1997-01-01','1998-01-01');

INSERT INTO trasllat VALUES (10,1,'1991-01-01','1994-01-01');

INSERT INTO trasllat VALUES (10,2,'1994-01-01','1995-01-01');

INSERT INTO trasllat VALUES (10,3,'1995-01-01','1996-01-01');

INSERT INTO trasllat VALUES (10,4,'1996-01-01',NULL);

INSERT INTO trasllat VALUES (11,1,'1991-01-01','1994-01-01');

INSERT INTO trasllat VALUES (11,3,'1994-01-01','1997-01-01');

INSERT INTO trasllat VALUES (11,2,'1997-01-01','1999-01-01');

INSERT INTO trasllat VALUES (11,4,'1999-01-01',NULL);

INSERT INTO titulacions VALUES (1,1,'1992-07-01');

INSERT INTO titulacions VALUES (1,2,'1997-07-01');

INSERT INTO titulacions VALUES (2,3,'2005-07-01');

INSERT INTO titulacions VALUES (3,3,'1991-07-01');

INSERT INTO titulacions VALUES (4,4,'1988-07-01');

INSERT INTO titulacions VALUES (5,1,'1980-07-01');

INSERT INTO titulacions VALUES (5,2,'1985-07-01');

INSERT INTO titulacions VALUES (5,5,'1991-07-01');

INSERT INTO titulacions VALUES (6,4,'1993-07-01');

INSERT INTO titulacions VALUES (7,4,'1991-07-01');

INSERT INTO titulacions VALUES (8,1,'1972-07-01');

INSERT INTO titulacions VALUES (8,2,'1977-07-01');

INSERT INTO titulacions VALUES (8,5,'1982-07-01');

INSERT INTO titulacions VALUES (9,2,'1980-07-01');

INSERT INTO titulacions VALUES (10,1,'1994-07-01');

INSERT INTO titulacions VALUES (10,5,'1990-07-01');






