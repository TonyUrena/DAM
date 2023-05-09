#Ejemplo de operadores lógicos
# comprobamos que se ha introducido un parámetro 
if  [ $# -ne 1 ]
then
   echo "Faltan parámetros"
   exit 1
fi

# comprobamos filtrando con expresión regular
#  que el parámetro introducido sea un número

PAR=`echo $1|grep ^[0-9]*[0-9]$`
# echo "Parametro filtrado $PAR"

if [ ! -z $PAR ]  # Si la variable cadena no vacía
then
  echo "Numero"
else
  echo "Letras"
  exit 2
fi
#exit 0 #para comprobar solo el parámetro

# EJEMPLOS DE OPERADOR LOGICO Y AND  -a &&
#if test  $1 -ge 10 -a   $1 -le 20
#if [ $1 -ge 10 ] -a [ $1 -le 6 ] #no funciona
#if [ $1 -ge 10 -a $1 -le 20 ]
#if [[ $1 -ge 10 -a $1 -le 20 ]] no funciona
#if [[ $1 -ge 10   &&  $1 -le 20 ]]
#if [[ $1 > 9 && $1 < 21 ]] #funciona pero la comparación es alfanumérica
#if [[ $1 >= 10 && $1 <= 20 ]] #no funciona
#if [ $1 -gt 10 -a $1 -lt 20 ] #excluimos los números indicados del intervalo
#if [ $1 -ge 10 ]  &&  [ $1 -le 20 ]
#if [ $1 -ge 10   &&  $1 -le 20 ]  #no funciona
if (($1>=10 && $1<=20))  #constructor doble parentesis
then
  echo "Entre 10 y 20"
fi
#exit

#EJEMPLOS DE OPERADOR LOGICO O OR -o ||
#if test $1 -eq 5  -o  $1 -eq 6
#if [ $1 -eq 5  -o  $1 -eq 6 ]
#if [ $1 -eq 5 ]  ||  [ $1 -eq 6 ]
#if [ $1 -eq 5   ||  $1 -eq 6 ]  #no funciona
#if [[ $1 -eq 5   ||  $1 -eq 6 ]]
#if [[ $1 = 5  ||  $1 == 6 ]]
#if (($1==5)) || (($1==6))
if (($1==5 || $1==6))
then
  echo "Es 5 o 6"
fi

#OPERADOR LOGICO no NOT ! 
# Con operador [ ] solo se usa en comparación de cadenas 
# También en comprobación de archivos con -f -d -r etc
#if [[ $1 != 10 ]] 
if (($1 != 10))
then
    echo "Distinto de 10"
fi
