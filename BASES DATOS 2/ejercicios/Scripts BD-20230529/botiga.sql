create database botiga; 

use botiga; 

create table producte ( 
   codprod integer primary key auto_increment, 
   nomprod varchar(30) unique not null, 
   preu decimal(10,2) default 0.0) engine=InnoDB; 


insert into producte (nomprod,preu) values 
('Disc extern 1TB',100.00), 
('Disc extern 2TB',120.00), 
('Unitat DVD',130.00), 
('Altaveus',60.00), 
('Mouse',15.00), 
('Tablet I',150.00), 
('Tablet II', 450.00), 
('Portàtil Gama Baixa',220.00), 
('Portàtil Gama Mitjana',500.00), 
('Portàtil Gama Alta',900.00), 
('Ordinador Sobretaula I',260.00), 
('Ordinador Sobretaula II',520.00), 
('Impressora',290.00), 
('Impressora Làser',750.00), 
('Impressora 3D',2500.00), 
('Pantalla Gran',1000.00), 
('Mòbil 1',120.00), 
('Mòbil II',130.00), 
('Mòbil III',150.00), 
('Mòbil IV',170.00); 

create table factura ( 
num_f integer primary key, 
data_f date, 
total decimal(10,2)) engine=InnoDB; 

insert into factura (num_f, data_f) values 
    (1, '2015-05-03'), 
    (2, '2015-05-03'), 
    (3, '2015-05-03'), 
    (4, '2015-05-03');

create table linia_factura ( 
num_f integer, 
codprod integer, 
quant integer, 
preu decimal(10,2), 
subtot decimal(10,2), 
primary key (num_f, codprod), 
foreign key (num_f) references factura(num_f), 
foreign key (codprod) references producte(codprod)) engine=InnoDB;
