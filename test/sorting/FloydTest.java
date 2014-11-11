/*
*Hoja de trabajo 9, Algoritmos y Estructura de Datos
*Isa Maria Contreras 13154
*Jose Sagastume Pinto 13217
*FloydTest.java
*Prueba Unitaria de la clase Floyd
*/
package sorting;

import Sorting.Floyd;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isa
 */
public class FloydTest {
    
    public FloydTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Prueba unitaria de predecesores de una ruta
    @Test
    public void testPredecesores() {
        System.out.println("Predecesores");
        int num1 = 0;
        int num2 = 0;
        Floyd instance = new Floyd();
        instance.predecesores(num1, num2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    //Prueba unitaria de centro grafo
    @Test
    public void testCentroGrafo() {
        System.out.println("centroGrafo");
        Floyd instance = new Floyd();
        String expResult = "Izabal";
        String result = instance.centroGrafo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
