create database academia; 

use academia; 

create table persones ( 
dni char(9) primary key, 
nom varchar(20), 
cognom varchar(20), 
sexe char check (sexe='M' or sexe='H'), 
datanaix date, 
adreca varchar(40), 
telefon char(9), 
email varchar(30), 
dataalta date 
) engine InnoDB; 

create table cursos ( 
codicurs integer primary key, 
nomcurs varchar(20), 
durada integer, 
descripcio varchar(50) 
) engine InnoDB; 

create table realitzaciocurs ( 
codicurs integer, 
anyo integer, 
numordre integer, 
coordinador char(9), 
primary key (codicurs, anyo, numordre), 
foreign key (codicurs) references cursos (codicurs) on delete no action on update cascade, 
foreign key (coordinador) references persones (dni) on delete no action on update cascade 
) engine InnoDB; 

create table profescurs ( 
codicurs integer, 
anyo integer, 
numordre integer, 
professor char(9), 
primary key (codicurs, anyo, numordre,professor), 
foreign key (codicurs, anyo, numordre) references realitzaciocurs(codicurs, anyo, numordre) on delete no action on update cascade, 
foreign key (professor) references persones (dni) on delete no action on update cascade 
) engine InnoDB; 

create table alumnescurs ( 
codicurs integer, 
anyo integer, 
numordre integer, 
alumne char(9), 
certificat boolean, 
assistencia integer, 
nota float, 
primary key (codicurs, anyo, numordre, alumne), 
foreign key (codicurs, anyo, numordre) references realitzaciocurs(codicurs, anyo, numordre) on delete no action on update cascade, 
foreign key (alumne) references persones (dni) on delete no action on update cascade 
) engine InnoDB; 

insert into persones values ('11111111A', 'Nuria','García', 'M', '1968-02-26', 'C/ Sardenya Barcelona','931111111', 'nuria@gmail','2006-09-01'); 
insert into persones values ('11111111B', 'Javier','Sánchez', 'H', '1967-02-26', 'C/ Sardenya Barcelona','931111112', 'javier@gmail','2006-09-01'); 
insert into persones values ('11111111C', 'Ana','Latorre', 'M', '1990-02-26', 'C/ Sardenya Tarragona','931111113', 'ana@gmail','2006-09-01'); 
insert into persones values ('11111111D', 'José Luís','Catalán', 'H', '1992-02-26', 'C/ Sardenya Barcelona','931111114', 'jose@gmail','2006-09-01'); 
insert into persones values ('11111111E', 'Jordi','Rey', 'H', '1994-02-26', 'C/ Sardenya Barcelona','931111115', 'jordi@gmail','2006-09-01'); 


insert into cursos values (100, 'Xarxes locals', 200, 'Xarxes locals'); 
insert into cursos values (101, 'Bases de dades', 240, 'Bases de dades'); 


insert into realitzaciocurs values (100, 2010, 1, '11111111A'); 
insert into realitzaciocurs values (100, 2010, 2, '11111111A'); 
insert into realitzaciocurs values (101, 2010, 1, '11111111A'); 
insert into realitzaciocurs values (101, 2010, 2, '11111111A'); 

insert into profescurs values (100,2010,1,'11111111B'); 
insert into profescurs values (100,2010,2,'11111111B'); 
insert into profescurs values (101,2010,1,'11111111C'); 
insert into profescurs values (101,2010,2,'11111111C'); 

insert into alumnescurs values (100,2010,1,'11111111C',true, 70, 6); 
insert into alumnescurs values (100,2010,1,'11111111D',true, 82, 8); 
insert into alumnescurs values (100,2010,1,'11111111E',true, 90, 9); 
insert into alumnescurs values (101,2010,1,'11111111C',true, 83, 6); 
insert into alumnescurs values (101,2010,1,'11111111D',true, 85, 8); 
insert into alumnescurs values (101,2010,1,'11111111E',true, 97, 9); 