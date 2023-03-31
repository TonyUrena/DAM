/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

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
public class CirculitoTest {
    
    public CirculitoTest() {
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
     * Test of establecerX method, of class Circulito.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadasX(valorX);

    }

    /**
     * Test of obtenerX method, of class Circulito.
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadasX();
        assertEquals(expResult, result);

    }

    /**
     * Test of establecerY method, of class Circulito.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadasY(valorY);

    }

    /**
     * Test of obtenerY method, of class Circulito.
     */
    @Test
    public void testObtenerY() {
        System.out.println("obtenerY");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadasY();
        assertEquals(expResult, result);

    }

    /**
     * Test of establecerRadio method, of class Circulito.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Circulito instance = new Circulito();
        instance.establecerRadio(0.0);
        instance.establecerRadio(0.1);
    }

    /**
     * Test of obtenerRadio method, of class Circulito.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.0;
        double result = instance.getRadio();
        assertEquals(0.1, result, 1e-6);

        instance.establecerRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,1e-6);
    }

    /**
     * Test of obtenerDiametro method, of class Circulito.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.0;
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result,1e-6);

    }

    /**
     * Test of obtenerCircunferencia method, of class Circulito.
     */
    @Test
    public void testObtenerCircunferencia() {
        System.out.println("obtenerCircunferencia");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.6283185;;
        double result = instance.obtenerCircunferencia();
        assertEquals(expResult, result, 1e-6);

    }

    /**
     * Test of obtenerArea method, of class Circulito.
     */
    @Test
    public void testObtenerAreaCirculo() {
        System.out.println("obtenerArea");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult =  0.0314159;
        double result = instance.obtenerAreaCirculo();
        assertEquals(expResult, result, 1e-6);

    }


    /**
     * Test of trasladarCentro method, of class Circulito.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
  Circulito instance = new Circulito();
        int resultx=instance.getCoordenadasX();
        int resulty=instance.getCoordenadasY();
        instance.trasladarCentro(5,5);
        int resultnx = instance.getCoordenadasX();
        int resultny = instance.getCoordenadasY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+5, resultny);

    }
    
}
