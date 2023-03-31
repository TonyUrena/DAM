/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCurso method, of class Alumno.
     */
    
    /**
     * Test of esMayorDeEdad method, of class Alumno.
     */
    @Test
    public void testEsMayorDeEdad() {
        System.out.println("esMayorDeEdad");
        Alumno instance = new Alumno("PersonaTest1", "12345678Z", LocalDate.parse("2000-01-01"));
        boolean expResult = true;
        boolean result = instance.esMayorDeEdad();
        assertEquals(expResult, result);
    
        instance = new Alumno("PersonaTest2", "12345678Z", LocalDate.parse("2010-01-01"));
         expResult = false;
         result = instance.esMayorDeEdad();
        assertEquals(expResult, result);
    }
    
}
