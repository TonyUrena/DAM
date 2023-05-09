#!/bin/bash
#Ejemplo de sentencia select usada para presentar un menú de selección

select OPCION in "opcion1"\
                "opcion2"\
                "opcion3"\
    		"Salir"
do
  case $REPLY in
     1) echo "Realizo las acciones correspondientes a la opción: $OPCION";;
     2) echo "Realizo las acciones correspondientes a la opción: $OPCION";;
     3) echo "Realizo las acciones correspondientes a la opción: $OPCION";;
     4) break;;
     *) echo "Error en opción"
  esac
done
