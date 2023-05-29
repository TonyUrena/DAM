-- 1 Creeu un procediment amb el que actualitzeu tots els valors del camp POSTAL_CODE de la taula LOCATIONS. El valor del nou camp serà el mateix que el codi postal de la ciutat de Oxford.

DELIMITER //
CREATE PROCEDURE ActualizaCodigo()
BEGIN
    DECLARE codigoPostal VARCHAR(12);
    
    -- Obtener el código postal de la ciudad de Oxford
    SELECT POSTAL_CODE INTO codigoPostal FROM LOCATIONS WHERE CITY = 'Oxford';
    
    -- Actualizar todos los registros con el código postal de Oxford
    UPDATE LOCATIONS SET POSTAL_CODE = codigoPostal;
END //

CALl ActualizaCodigo();//

-- 2 Creeu un procediment que us retorni el nom de tots els empleats de un departament. El codi del departament el passareu al procediment com paràmetre d’entrada.

DELIMITER //
CREATE PROCEDURE DevuelveNombreEmpleados(in depID float)
BEGIN
    SELECT FIRST_NAME FROM EMPLOYEES WHERE DEPARTMENT_ID = depID;
END //

CALL DevuelveNombreEmpleados(110);//

-- 3 Creeu un procediment que us conte el nombre d’empleats que hi ha en el departament que li passareu com paràmetre. Si el nombre d’empleats es major que 3 us mostrarà un missatge que us dirà TOO MUCH si és menor us apareixerà un missatge dient NOT TOO MUCH.
DELIMITER //
CREATE PROCEDURE CuentaEmpleadosDepartamento(in depID float)
BEGIN
    DECLARE cantidadEmpleados INTEGER;
    SELECT COUNT(EMPLOYEE_ID) INTO cantidadEmpleados
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = depID;
    IF cantidadEmpleados > 3 THEN
        SELECT "TOO MUCH" AS "How much?";
    ELSE
        SELECT "NOT TOO MUCH" AS "How much?";
    END IF;
END //

CALL CuentaEmpleadosDepartamento(110);//

-- 4 Creeu un procediment que us permeti inserir dades en la taula COUNTRIES.

DELIMITER //
CREATE PROCEDURE InsertaDatosEnCountries(
    IN COUNTRY_ID CHAR(2),
    IN COUNTRY_NAME VARCHAR(40),
    IN REGION_ID FLOAT)
BEGIN
    INSERT INTO COUNTRIES VALUES(COUNTRY_ID, COUNTRY_NAME, REGION_ID);
END //

-- 5 Creeu un procediment que us permeti afegir un camp a la taula JOBS amb la data i hora actual.

DELIMITER //
CREATE PROCEDURE AnadeCampoJobsHoraActual()
BEGIN
    ALTER TABLE JOBS add fechaCreacion TIMESTAMP;
END //

-- 6 Creeu un procediment que a partir de la mitja dels sous de tots els empleats calculi el 15% de la mateixa i actualitzi els sous inferiors a la mitja aquesta quantitat.

DELIMITER //
CREATE PROCEDURE Calcula15PorcientoYactualiza()
BEGIN
    DECLARE porciento float;
    SELECT AVG(SALARY) * 1.15 INTO porciento
    FROM EMPLOYEES;
    
    UPDATE EMPLOYEES SET SALARY = porciento
    WHERE EMPLOYEES.SALARY < porciento;
END //