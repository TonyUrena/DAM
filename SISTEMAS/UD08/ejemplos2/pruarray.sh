#definición de arrays


#MIARRAY=(Pepe Luis Jose Ana) #asignando todos elementos

#De uno en uno
MIARRAY[0]="Pepe"
MIARRAY[1]="Luis"
MIARRAY[2]="Jose"
MIARRAY[3]="Ana"

echo "El  primer elemento del array,  MIRRAY es: ${MIARRAY[0]}"
echo "Todos los elementos son: ${MIARRAY[*]}"
echo "El numero de elementos son: ${#MIARRAY[*]}"
# Cambio el primero
MIARRAY[0]="Juan"
echo "Todos los elementos son: ${MIARRAY[*]}"

#uno a uno

NUM=${#MIARRAY[*]}
echo "Numero elementos : $NUM"
NUM=`expr ${#MIARRAY[*]} - 1`

for I in `seq 0 $NUM`
do
  echo  ${MIARRAY[$I]}
done

#Arrays con datos de un achivo

#MIARRAY2=(`cat ficnom`)
ls  -l|tr " " "_">temp1

MIARRAY2=(`cat temp1`)

NUM=${#MIARRAY2[*]}
echo "Numero elementos Sacados del archivo: $NUM"
NUM=`expr ${#MIARRAY2[*]} - 1`
for I in `seq 0 $NUM`
do
  echo  ${MIARRAY2[$I]}
done
rm temp1

