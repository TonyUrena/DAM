#A=100
#B=200
function suma(){
#Estos son parámetros  que se envían con  la funcion
let T=$1+$2
echo "Suma de $1 y $2= $T"
}

function resta(){
let T=$1-$2
echo "Resta de $1 y $2 = $T"
}

#estos son parametros de linea de órdenes
let A=$1+100
let B=$2+100
suma $A $B #Ver que si no se envían parametros hay error 
resta 9 8 
