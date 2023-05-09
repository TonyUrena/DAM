#!/bin/bash
#pruebas en Bash

MENSAJE="Hola Mundo"
echo $MENSAJE 

NOMBRE="Alex"

echo ${NOMBRE}_1981.txt

#atributos script

ATRIBUTOS=$(ls -l $0)

echo $ATRIBUTOS

#num1=1
#num2=4
#((num3=num1+num2))
#let "num4=num2-num1"
#echo "si a $num1 le sumamos $num2 tenemos $num3"
#echo " si a $num2 le restamos $num1 tenemos $num4"

lista=(uno dos tres)
lista[3]=cuatro
lista[4]=cinco
echo "los elementos de la lista son ${lista[*]}"
echo "En total cuenta con ${#lista[*]} elementos"
echo "El primero de ellos es ${lista[0]}"
echo "y tiene ${#lista[0]} caracteres"


