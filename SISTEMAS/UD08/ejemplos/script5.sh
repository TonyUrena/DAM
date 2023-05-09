#!/bin/bash

#vamos a ver que hemos pasado por parámetros
echo "El nombre del archivo es $0"
echo "El número de parámetros es  $#"
echo "El parámetro 1 es $1"
echo "El parámetro 2 es $2"
echo "El parámetro 10 es ${10}"
echo "La secuencia introducida es $* y también $@"

echo "$@"
shift
echo "$@"
shift
echo "$@"
shift
echo "$@"

ls -l $1; ls -l $2

echo $?
skfjlksf
echo $?

#echo {a..z}

#read -p "Introduce un valor para e que sea 1 o distinto de 1 :" e

#if test $e -eq 1

#if [ $e -eq 1 ]

#then
#	echo " e vale 1"
#else
#	echo " e es distinto de 1"
#fi


