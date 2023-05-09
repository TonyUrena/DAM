# uso de if comparando numeros

#if test $1 -eq 10
#if test $1 -eq 10 ;then
#if [ $1 -eq 10 ]  #lo mismo con abreviatura de test
#if [[ $1 -eq 10 ]] #otra forma  más versátil, previene errores lógicos , 
# funcionan operadores && || < > que no funcionan con []
# if [ $1 < 10 ]  #no funciona
#if [[ $1 > 10 ]] #funciona con < > = No funciona  >=

#NUM=$1 #Usamos variable para comprobar excepción al uso de $ en (())
#doble paréntesis permite evaluaciones simples con sintaxis de leng. c
#if ((NUM==10)) # funciona > < == >= <=
#then
#  echo "$1 ES un Diez"
#else
#  echo "$1 no es un diez"
#fi



# Ejemplo de if  valorando el resultado de la ejecución de una orden
#Se valora el valor de retorno de la orden. 0 ejecución correcta = true 1=false
#para probar  esto hay que  enviar  un archivo como parámetro

#if cat $1 >/dev/null  2>/dev/null
#if `cat $1 >/dev/null  2>/dev/null` # se puede usar con `` y sin ellos
#then
#   echo "El archivo existe y cat devuelve $?"
#else 
#   echo "El archivo no existe y cat devuelve $?"
#fi

# Otro ejemplo de uso de if con otro comando
#if cmp $1 $2 >/dev/null
#then
#  echo "iguales"
#else
# echo "No"
#fi


VAR=$1  #Si no se asigna valor a variable es false, es decir si esta variable no existe
# Si se asigna valor es true. Por tanto si se envía 2º parámetro es true y si no false
#if test $VAR 
#if [ $VAR ]
#if [[ $VAR ]]
if ((VAR)) #Evalúa según lenguaje C entonces 0 es false distinto de 0 es true
then
   echo "Es true"
else
  echo "Es false"
fi
