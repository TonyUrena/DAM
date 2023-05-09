#!/bin/bash


#suma

let "n=5+5"
echo "Si n es igual a 5+5 entonces n=$n"

#resta
let "n=n-3"
echo "Si restamos 3 a n tenemos $n"

#multiplicación
let "n=n*3"
echo "Si a n lo multiplicamos por 3 tenemos $n"

#division

let "n=n/3"
echo "Si ahora dividimos n entre 3 tenemos $n"

#exponenciación
let "n=n**3"
echo "Y si lo elevamos a 3 el resultado final es $n"

let "n+=5"
echo "Si le sumamos 5, tenemos $n"

let "n*=2"
echo "Multiplicamos por 2 y obtenemos $n"
