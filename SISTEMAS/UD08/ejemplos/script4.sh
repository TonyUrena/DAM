#!/bin/bash

echo " El script ejecutado es $0"
echo " El primer valor introducido es $1"
echo " El segundo será $2"
echo " El tercero $3"

echo " En total tengo $# argumentos"
echo " En forma de string: $*"
echo " En forma de lista: $@"

echo "Añada un argumento más:"
read x

read -p " Y otro argumento más: " y

echo " Lista final de argumentos es: $@ $x $y"
