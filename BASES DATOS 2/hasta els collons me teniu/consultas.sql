
-- ------------------------CONSULTAS------------------ --
/*
Muestra todos los datos de todos los videjuegos
*/

SELECT * 
FROM videojuegos
JOIN articulos ON videojuegos.id_videojuego = articulos.id_articulo;

/*
Muestra el nombre de todos los videojuegos en formato Cartucho
*/

SELECT nombre
FROM videojuegos
JOIN articulos ON videojuegos.id_videojuego = articulos.id_articulo
WHERE formato = 'Cartucho';

/*
Muestra el nombre y la plataforma de todos los videojuegos
*/

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

/*
Muestra el nombre y la plataforma de los videojuegos lanzados despues de 1990
*//*
    pedimos la fecha de lanzamiento de una tabla concreta, pues al hacer el join tenemos tanto
    las fechas de lanzamiento de las plataformas como las de los videojuegos
*/


SELECT av.nombre, ap.nombre, av.fecha_lanzamiento
from (plataformas p JOIN articulos ap ON p.id_plataforma = ap.id_articulo)
join (videojuegos v JOIN articulos av ON v.id_videojuego = av.id_articulo) ON v.id_plataforma = p.id_plataforma
where av.fecha_lanzamiento > '1990-12-31';
