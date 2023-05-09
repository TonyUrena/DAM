#La función no tiene tipo ni devuelve valor solo devuelve valor como con exit en script

#Estas variables son globales
A=200
B=100

function suma(){
#local let T=0 #forma correcta declaramos variable local a la función

#No hacer porque si declaramos variable local y realizamos suma es de tipo string
local let T=$A+$B

#let T=$A+$B  #declaramos  variable global a la función
echo "Suma vista en función = $T"

return 7  #es como exit en un script, pero en una función el valor  se le asigna a $?
}

#una función se puede compactar notese el ; final obligatorio
function resta() { echo; echo "Resta = `expr $A - $B`";}

suma
echo $?
echo "Suma vista en principal = $T"

resta

