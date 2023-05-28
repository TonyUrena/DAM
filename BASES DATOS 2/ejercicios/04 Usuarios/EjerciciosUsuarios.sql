1. Crea un usuario antonio , que pueda acceder desde cualquier ordenador externo y tenga permisos globales sobre la base de datos world.

    Ejecuta el siguiente comando para crear un nuevo usuario llamado "antonio" y asignarle una contraseña. Asegúrate de reemplazar 'password' con la contraseña deseada para el usuario.

        CREATE USER 'antonio'@'%' IDENTIFIED BY 'password';

    Este comando crea un usuario llamado 'antonio' y le permite conectarse desde cualquier dirección IP externa ('%').

    A continuación, debes otorgar los permisos globales al usuario 'antonio' para acceder a la base de datos 'world'. Ejecuta el siguiente comando:

        GRANT ALL PRIVILEGES ON world.* TO 'antonio'@'%';

    Este comando otorga todos los privilegios al usuario 'antonio' sobre la base de datos 'world'.

    Por último, asegúrate de aplicar los cambios ejecutando el siguiente comando:

        FLUSH PRIVILEGES;

    Esto asegurará que los cambios de permisos se reflejen inmediatamente.

2. Documenta como te conectas con ese usuario desde alguna utilidad (gráfica o no) a la base de datos y muestra sus permisos.

    Utiliza el siguiente comando para iniciar sesión con el usuario 'antonio':

        mysql -u antonio -p

    Te solicitará que ingreses la contraseña para el usuario 'antonio'. Escribe la contraseña correspondiente y presiona Enter.

    Una vez que hayas iniciado sesión, puedes ejecutar el siguiente comando para mostrar los permisos del usuario 'antonio' en la base de datos 'world':

        SHOW GRANTS FOR 'antonio'@'%';

    Este comando mostrará los permisos específicos que se han otorgado al usuario 'antonio' en la base de datos 'world'. Puedes ver qué tipo de privilegios se han concedido y a qué objetos (tablas, vistas, procedimientos almacenados, etc.).

3. Modifica con un comando SQL los permisos del usuario anterior para que éste además de los permisos que ya tiene, también pueda establecer permisos de otros usuarios sobre la base de datos world.

    Utiliza el siguiente comando para modificar los permisos del usuario 'antonio' y permitirle establecer permisos de otros usuarios sobre la base de datos 'world':

        GRANT GRANT OPTION ON world.* TO 'antonio'@'%';

    Este comando otorga al usuario 'antonio' el permiso especial "GRANT OPTION", que le permite conceder o revocar permisos de otros usuarios sobre la base de datos 'world'. También asegúrate de que el usuario 'antonio' ya tenga los permisos necesarios sobre la base de datos 'world'.

    Finalmente, asegúrate de aplicar los cambios ejecutando el siguiente comando:

        FLUSH PRIVILEGES;

    Esto asegurará que los cambios de permisos se reflejen inmediatamente.

4. Crea un nuevo usuario pepito solo con permisos de lectura sobre la tabla City de la base de datos world, que se puede conectar con cualquier ordenador de la red de la escuela suponiendo que la red de la escuela sea 192.168.100.0. Modifica los permisos para que solo pueda conectarse desde la maquina 192.168.100.2

    Crea un nuevo usuario llamado 'pepito' y asigna una contraseña utilizando el siguiente comando:

        CREATE USER 'pepito'@'192.168.100.%' IDENTIFIED BY 'password';

    Este comando crea un usuario llamado 'pepito' que puede conectarse desde cualquier dirección IP en la red de la escuela (192.168.100.0) y le asigna una contraseña. Asegúrate de reemplazar 'password' con la contraseña deseada para el usuario.

    Otorga permisos de solo lectura sobre la tabla 'City' de la base de datos 'world' al usuario 'pepito' utilizando el siguiente comando:

        GRANT SELECT ON world.City TO 'pepito'@'192.168.100.%';

    Este comando otorga permisos de lectura (SELECT) sobre la tabla 'City' de la base de datos 'world' al usuario 'pepito' y le permite conectarse desde cualquier dirección IP de la red de la escuela (192.168.100.0).

    Ahora, debes restringir la conexión del usuario 'pepito' solo a la máquina 192.168.100.2. Ejecuta el siguiente comando para modificar los permisos:

        REVOKE ALL PRIVILEGES ON *.* FROM 'pepito'@'192.168.100.%';
        GRANT SELECT ON world.City TO 'pepito'@'192.168.100.2';

    El primer comando revoca todos los privilegios del usuario 'pepito' en cualquier dirección IP de la red de la escuela. Luego, el segundo comando otorga permisos de solo lectura sobre la tabla 'City' de la base de datos 'world' al usuario 'pepito' pero solo desde la máquina 192.168.100.2.

    Asegúrate de aplicar los cambios ejecutando el siguiente comando:

        FLUSH PRIVILEGES;

6. Con el usuario antonio otorga permisos a pepito para poder realizar insert, update y delete sobre la tabla City, y realizar selects sobre el resto de las tablas de la base de datos world. Comprobad que no le podéis otorgar permisos sobre otras bases de datos.

    Abre una conexión a tu servidor MySQL desde la línea de comandos o una herramienta de administración, como MySQL Workbench, utilizando el usuario 'antonio':

        mysql -u antonio -p

    Ingresa la contraseña correspondiente al usuario 'antonio' cuando se solicite y presiona Enter.

    Ejecuta los siguientes comandos SQL para otorgar los permisos necesarios a 'pepito':

        GRANT INSERT, UPDATE, DELETE ON world.City TO 'pepito'@'%';
        GRANT SELECT ON world.* TO 'pepito'@'%';

    El primer comando otorga a 'pepito' permisos de inserción (INSERT), actualización (UPDATE) y eliminación (DELETE) sobre la tabla 'City' en la base de datos 'world'. El segundo comando otorga a 'pepito' permisos de selección (SELECT) sobre todas las tablas en la base de datos 'world'.

    Asegúrate de aplicar los cambios ejecutando el siguiente comando:

        FLUSH PRIVILEGES;

8. Cambia la contraseña de pepito. ¿Cómo comprobarías que la has cambiado?

    A continuación, utiliza el siguiente comando para cambiar la contraseña del usuario 'pepito'. Asegúrate de reemplazar 'nuevacontraseña' por la nueva contraseña deseada para el usuario:

        ALTER USER 'pepito'@'%' IDENTIFIED BY 'nuevacontraseña';

    Este comando cambia la contraseña del usuario 'pepito' a la nueva contraseña especificada.

    Verifica que la contraseña se haya cambiado correctamente intentando iniciar sesión con el usuario 'pepito' y la nueva contraseña. Puedes hacerlo ejecutando el siguiente comando:

        mysql -u pepito -p

        Ingresa la nueva contraseña cuando se solicite y presiona Enter.

    Si puedes iniciar sesión correctamente sin errores, significa que la contraseña del usuario 'pepito' se ha cambiado correctamente.

9. Borra el usuario pepito. ¿Cómo comprobarías que lo has borrado?

    Ejecuta el siguiente comando para iniciar sesión:

        mysql -u root -p

    Ingresa la contraseña correspondiente al usuario 'root' cuando se solicite y presiona Enter.

    A continuación, utiliza el siguiente comando para eliminar el usuario 'pepito':

        DROP USER 'pepito'@'%';

    Este comando eliminará completamente el usuario 'pepito' y todos sus permisos.

    Para confirmar que el usuario 'pepito' ha sido eliminado, puedes ejecutar el siguiente comando para ver una lista de usuarios existentes:

        SELECT user, host FROM mysql.user;

    Este comando mostrará una lista de todos los usuarios registrados en el servidor MySQL. Si no encuentras 'pepito' en la lista, significa que el usuario ha sido eliminado correctamente.

10. Crea un usuario llamado bdadmin que con contraseña ‘1234’ que se conecte desde el ordenador
local y que tenga todos los privilegios para trabajar sobre cualquier base de datos existente.

    A continuación, utiliza el siguiente comando para crear el usuario 'bdadmin' y asignarle la contraseña '1234':

        CREATE USER 'bdadmin'@'localhost' IDENTIFIED BY '1234';

    Este comando crea un nuevo usuario llamado 'bdadmin' con la contraseña '1234'. El usuario solo podrá conectarse desde el ordenador local.

    Luego, otorga todos los privilegios al usuario 'bdadmin' utilizando el siguiente comando:

        GRANT ALL PRIVILEGES ON *.* TO 'bdadmin'@'localhost' WITH GRANT OPTION;

    Este comando otorga al usuario 'bdadmin' todos los privilegios sobre todas las bases de datos existentes en el servidor MySQL. El parámetro 'WITH GRANT OPTION' le permite al usuario 'bdadmin' otorgar privilegios a otros usuarios.

    Asegúrate de aplicar los cambios ejecutando el siguiente comando:

        FLUSH PRIVILEGES;

11.Consulta las respectivas tablas donde se almacenan los datos de usuarios y sus permisos

    Tabla 'user': Esta tabla almacena la información básica de los usuarios, como el nombre de usuario, la contraseña encriptada y otros detalles relacionados. Puedes consultar los usuarios existentes y sus atributos utilizando la siguiente consulta:

        SELECT * FROM mysql.user;

    Esta consulta mostrará una lista de todos los usuarios registrados en el servidor MySQL, junto con sus atributos correspondientes.

    Tabla 'db': Esta tabla contiene información sobre los permisos de los usuarios en las bases de datos individuales. Puedes consultar los permisos de los usuarios en cada base de datos utilizando la siguiente consulta:

        SELECT * FROM mysql.db;

    Esta consulta mostrará los permisos de los usuarios en cada base de datos, incluyendo el nombre de usuario, el nombre de la base de datos y los privilegios asignados.

    Tabla 'tables_priv': Esta tabla almacena los permisos específicos de las tablas para cada usuario. Puedes consultar los permisos de los usuarios sobre tablas específicas utilizando la siguiente consulta:

        SELECT * FROM mysql.tables_priv;

    Esta consulta mostrará los permisos de los usuarios en tablas individuales, incluyendo el nombre de usuario, el nombre de la tabla y los privilegios asignados.

12. Modifica a través de las tablas directamente alguno de los permisos de usuario y comprueba que
ha tenido efecto.

    UPDATE mysql.db
    SET Insert_priv = 'N'
    WHERE User = 'bdadmin';

    Utiliza la siguiente sintaxis para modificar los permisos directamente en la tabla. Asegúrate de reemplazar 'usuario' y 'host' con los valores correspondientes:

        UPDATE mysql.tabla_de_permisos
        SET privilegios = 'nuevos_privilegios'
        WHERE user = 'usuario' AND host = 'host';

    En este comando, 'tabla_de_permisos' se refiere a la tabla específica en la que deseas realizar modificaciones (por ejemplo, 'db', 'tables_priv', etc.), 'nuevos_privilegios' representa los nuevos privilegios que deseas asignar al usuario, 'usuario' es el nombre de usuario al que deseas modificar los permisos y 'host' es el host o dirección IP desde la cual se conecta el usuario.

    Por ejemplo, si deseas modificar los privilegios de un usuario llamado 'pepito' en la tabla 'db', puedes ejecutar el siguiente comando:

        UPDATE mysql.db
        SET privilegios = 'nuevos_privilegios'
        WHERE user = 'pepito' AND host = 'localhost';

    Verifica que los cambios hayan tenido efecto ejecutando consultas para verificar los nuevos permisos del usuario.

13. Crea un nuevo usuario llamado andres sin permisos directamente a través de las tablas. Modifica la contraseña de usuario de tal forma que no aparezca encriptada. Intenta conectarte con el usuario andres. ¿Que ocurre? Vuelve a modificarla para que aparezca de una forma más segura. Intenta conectarte de nuevo con andres ¿Que ocurre?

    INSERT INTO mysql.user (Host, User, Password)
    VALUES ('localhost', 'andres', PASSWORD('password'));


14. Sin utilizar directamente las tablas de usuarios y permisos, otorga los permisos de selección e inserción al usuario andres en todas las bases de datos.

    GRANT SELECT, INSERT ON *.* TO 'andres'@'localhost';

15. Revoca el permiso de inserción del usuario andres en toda la base de datos, también sin utilizar las tablas de usuarios y permisos.

    REVOKE INSERT ON *.* FROM 'andres'@'localhost';

16 Crea un usuario llamado restric utilizando la sentencia GRANT que solamente tenga permitidas dos conexiones simultaneas a la base de datos, comprueba que esto se cumple.

    CREATE USER 'restric'@'localhost' WITH MAX_USER_CONNECTIONS 2;

17 Comprueba que sucede si creamos un usuario llamado libre, sin contraseña de entrada e intentamos entrar con el. ¿Que permisos tiene? ¿Crees que es seguro tener este tipo de usuarios en el SGBD? ¿Porqué? ¿Como eliminarías automáticamente del sistema a todos los usuarios sin contraseña?

        CREATE USER 'libre'@'localhost' IDENTIFIED BY '';

    Cuando se crea un usuario sin contraseña en MySQL, generalmente se le otorgan permisos limitados o nulos, lo que significa que el usuario 'libre' probablemente no tendrá ningún privilegio o solo tendrá permisos mínimos en el sistema. Sin embargo, las políticas de seguridad pueden variar según la configuración específica del servidor.

    Para eliminar automáticamente todos los usuarios sin contraseña del sistema, se pueden seguir estos pasos:

    Utiliza el siguiente comando para listar todos los usuarios sin contraseña:

        SELECT user, host FROM mysql.user WHERE password = '';

    Esto mostrará una lista de todos los usuarios que tienen una contraseña vacía.

    Verifica cuidadosamente los usuarios sin contraseña y asegúrate de que deseas eliminarlos. Asegúrate de no eliminar usuarios legítimos que necesiten autenticarse sin contraseña por alguna razón específica.

    Utiliza el siguiente comando para eliminar automáticamente los usuarios sin contraseña:

        DELETE FROM mysql.user WHERE password = '';

    Este comando eliminará todos los registros de usuarios que tienen una contraseña vacía.

    Asegúrate de aplicar los cambios ejecutando el siguiente comando:

        FLUSH PRIVILEGES;

18 Borra directamente al usuario andres de la tabla user. Prueba a conectarte de nuevo con el usuario andres. ¿Que sucede? Comenta todas las posibles soluciones.



19 Elimina todos los usuarios que no tengan permisos globales en todas las bases de datos con unasola sentencia.

    DROP USER IF EXISTS
    (SELECT DISTINCT User FROM mysql.user
    WHERE User NOT IN
        (SELECT DISTINCT User FROM mysql.db)
    );

20 Cambia la contraseña de root de alguna de las maneras explicadas a clase.

    ALTER USER 'root'@'localhost' IDENTIFIED BY 'nueva_contraseña';