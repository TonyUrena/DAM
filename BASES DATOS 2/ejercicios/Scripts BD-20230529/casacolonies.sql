CREATE DATABASE IF NOT EXISTS casacolonies;
 
CREATE TABLE IF NOT EXISTS casacolonies.comarques
   ( codi_com TINYINT PRIMARY KEY,
     nom_comarca CHAR(20) NOT NULL,
     superficie DECIMAL(8,2),
     num_hab INT
   ) engine=InnoDB;
 
CREATE TABLE IF NOT EXISTS casacolonies.casacolonies
   ( codi_casa TINYINT PRIMARY KEY,
     nom_casa VARCHAR(30) NOT NULL,
     capacitat SMALLINT(4) NOT NULL,
     codi_com TINYINT,
     FOREIGN KEY (codi_com) REFERENCES casacolonies.comarques (codi_com) ON DELETE SET NULL ON UPDATE CASCADE
   ) engine=InnoDB;
 
 
CREATE TABLE IF NOT EXISTS casacolonies.nens
   ( codi_nen INT PRIMARY KEY,
     nom VARCHAR(30) NOT NULL,
     cognom VARCHAR(30) NOT NULL,
     adreça VARCHAR(30),  
     telefon CHAR(9),
     codi_com TINYINT,
     codi_casa TINYINT,
     FOREIGN KEY (codi_com) REFERENCES casacolonies.comarques (codi_com) ON DELETE SET NULL ON UPDATE CASCADE,
     FOREIGN KEY (codi_casa) REFERENCES casacolonies.casacolonies (codi_casa) ON DELETE SET NULL ON UPDATE CASCADE
   ) engine=InnoDB;
 
 
CREATE TABLE IF NOT EXISTS casacolonies.activitats
   ( codi_act TINYINT PRIMARY KEY,
     nom_activitat VARCHAR(30)
   ) engine=InnoDB;
 
 
CREATE TABLE IF NOT EXISTS casacolonies.ofertes
   ( codi_casa TINYINT,
     codi_act TINYINT,
     nivell TINYINT(1),
     PRIMARY KEY (codi_casa,codi_act),
     FOREIGN KEY (codi_casa) REFERENCES casacolonies.casacolonies (codi_casa) ON DELETE CASCADE ON UPDATE CASCADE,
     FOREIGN KEY (codi_act) REFERENCES casacolonies.activitats (codi_act) ON DELETE CASCADE ON UPDATE CASCADE
   ) engine=InnoDB;
 
 
INSERT INTO casacolonies.comarques VALUES (1, 'Emporda', 3200.00, 120000);
INSERT INTO casacolonies.comarques VALUES (2, 'Bergueda', 1150.00, 140000);
INSERT INTO casacolonies.comarques VALUES (3, 'Penedes', 10060.00, 160000);
INSERT INTO casacolonies.casacolonies VALUES (1, 'Can Parera', 50, 1);
INSERT INTO casacolonies.casacolonies VALUES (2, 'Can Sole', 120, 1);
INSERT INTO casacolonies.casacolonies VALUES (3, 'Mas Vilarrasa', 70, 2);
INSERT INTO casacolonies.casacolonies VALUES (4, 'Can Bartomeu', 50, 2);
INSERT INTO casacolonies.casacolonies VALUES (5, 'El Verdaguer', 60, 3);
INSERT INTO casacolonies.nens VALUES (1, 'Alex', 'Villanueva', 'Sardenya 123', '931234567', 1, 1);
INSERT INTO casacolonies.nens VALUES (2, 'Alex', 'Scotti', 'Sicilia 4', '937654321', 2, 2);
INSERT INTO casacolonies.nens VALUES (3, 'Abel', 'Garcia', 'Baleares 23', '931122333', 3, 2);
INSERT INTO casacolonies.nens VALUES (4, 'Aaron', 'Medina', 'Sant Salvador 12', '932233444', 2, 2);
INSERT INTO casacolonies.nens VALUES (5, 'Aida', 'Saperas', 'Diagonal 789', '933344555', 2, 2);
INSERT INTO casacolonies.nens VALUES (6, 'Elena', 'Conde', 'Bailen 32', '935566777', 2, 2);
INSERT INTO casacolonies.nens VALUES (7, 'Yaiza', 'Hidalgo', 'Providencia 123', '936677888', 2, 2);
INSERT INTO casacolonies.nens VALUES (8, 'Jaciara', 'Rosario', 'Comercio 34', '938899111', 3, 1);
INSERT INTO casacolonies.nens VALUES (9, 'Ona', 'Aiguade', 'Tallers 45', '931231233', 3, 3);
INSERT INTO casacolonies.nens VALUES (10, 'Gabriel', 'Garcia', 'Sant Joan 32', '934564566', 3, 3);
INSERT INTO casacolonies.nens VALUES (11, 'Jana', 'Badell', 'Girona 78', '931111111', 1, 1);
INSERT INTO casacolonies.nens VALUES (12, 'Pau', 'Castells', 'Arago 455', '932222222', 1, 1);
INSERT INTO casacolonies.nens VALUES (13, 'Pol', 'Catalan', 'Valencia 32', '933333333', 3, 1);
INSERT INTO casacolonies.nens VALUES (14, 'Samuel', 'Villanueva', 'Pi i Margall 2', '934444444', 3, 2);
INSERT INTO casacolonies.activitats VALUES (1, 'Natacio');
INSERT INTO casacolonies.activitats VALUES (2, 'Escalada');
INSERT INTO casacolonies.activitats VALUES (3, 'Trecking');
INSERT INTO casacolonies.activitats VALUES (4, 'Hipica');
INSERT INTO casacolonies.ofertes VALUES (1,1,5);
INSERT INTO casacolonies.ofertes VALUES (1,2,5);
INSERT INTO casacolonies.ofertes VALUES (2,3,3);
INSERT INTO casacolonies.ofertes VALUES (2,4,3);
INSERT INTO casacolonies.ofertes VALUES (3,1,4);
INSERT INTO casacolonies.ofertes VALUES (3,2,4);
INSERT INTO casacolonies.ofertes VALUES (3,3,4);
INSERT INTO casacolonies.ofertes VALUES (4,2,5);
INSERT INTO casacolonies.ofertes VALUES (4,3,5);
INSERT INTO casacolonies.ofertes VALUES (5,4,2);
INSERT INTO casacolonies.ofertes VALUES (5,2,3);
INSERT INTO casacolonies.ofertes VALUES (5,3,2);
