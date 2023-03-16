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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of comprobarDNI method, of class Persona.
     */
    @Test
    public void testComprobarDNI() {
        System.out.println("comprobarDNI");
        Persona instance = new Persona("PersonaTest", "12345678Z", LocalDate.now());
        boolean expResult = true;
        boolean result = instance.comprobarDNI();
        assertEquals(expResult, result);
        instance.setDni("12345678A");
        expResult = false;
        result = instance.comprobarDNI();
        assertEquals(expResult, result);
    }

    /**
     * Test of asignarLetraDNI method, of class Persona.
     */
    @Test
    public void testAsignarLetraDNI() {
        System.out.println("asignarLetraDNI");
        Persona instance = new Persona("PersonaTest", "12345678", LocalDate.now());
        instance.asignarLetraDNI();
        String expResult = "12345678Z";
        assertEquals(expResult, instance.getDni());
    }
    
}
