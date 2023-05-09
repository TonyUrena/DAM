#!/bin/bash
fichero=$1
palabras=`cat $fichero`
for palabra in $palabras 
do
	echo $palabra
done
