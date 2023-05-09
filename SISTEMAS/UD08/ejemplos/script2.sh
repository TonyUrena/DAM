#!/bin/bash
nombre="Alex"
num=8
#result=$(ps -ef | grep bash | grep -v grep)
result2=`ps -ef | grep bash | grep -v grep`
((num ++))
((num+=2))
echo $nombre
echo $num
#echo $result
echo $result2


