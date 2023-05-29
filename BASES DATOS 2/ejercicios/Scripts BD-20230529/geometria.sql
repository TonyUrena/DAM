create database geometria;
use geometria;
create table punt (
x integer,
y integer,
primary key (x,y));
insert into punt (x,y) values (1,1), (1,2), (1,4), (1,7),(1,11),(3,11);
