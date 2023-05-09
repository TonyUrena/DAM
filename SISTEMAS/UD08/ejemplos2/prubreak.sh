#usamos ciclos diferentes para probar funcionamiento de break y continue
I=0
#for I in `seq 1 10`
#until [ $I -eq 10 ]
while [ $I -lt 10 ]
do 
   ((I++))
   if [ $I -eq 5 ]
   then
 #    break #corta todas las iteraciones
    continue #corta la iteracion 5 y sigue con la siguiente
   fi
   echo $I
done
