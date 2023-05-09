# Ejemplo usando distintos valores para lista
#for I  in a b c d e f
#for I  in 1 2 3 4 5 6 
#for I in {1..19}
#for I in `seq 0 2  100`
#for I in `seq 20 -1 0`
#for I in {a..z}
#for I  in pepe luis jose ana "luis jose"
#for  I in $* #usando parametros como lista para el for
#for I in `cat nombres` 
#for I in `ls -l` 
#for I in * #Lo mismo que el ejemplo anterior pero con ls
#for I in [id]*  #Asume lista de archivos del directorio actual que empiecen por i o m
#do
#  echo $I 
#done
#exit 0





#MIVAR=`ls -1`
#for I in $MIVAR
#do
#  echo "********************* "$I 
#  echo "El contenido del archivo " $I
#  echo "****************************"
#  cat $I
#  echo "Pulsa intro para Ver siguiente" 
#  read
#done

