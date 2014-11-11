/*
*Hoja de trabajo 9, Algoritmos y Estructura de Datos
*Isa Maria Contreras 13154
*Jose Sagastume Pinto 13217
*GrafosTest.java
*Pruebas unitarias de la clase Grafos
*/

package sorting;

import Sorting.Grafos;
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
public class GrafosTest {
    
    public GrafosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
   
    //Prueba unitaria para agregar un nodo
    @Test
    public void testAgregarNodo() {
        System.out.println("agregarNodo");
        Object nodo = null;
        Grafos instance = new GrafosImpl();
        instance.agregarNodo(nodo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    //Prueba unitaria ostrar matriz de adyacencia
    @Test
    public void testMostrarMatrizAdy() {
        System.out.println("mostrarMatrizAdy");
        Grafos instance = new GrafosImpl();
        String expResult = "";
        String result = instance.mostrarMatrizAdy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    //Prueba unitaria para verificar que una ciudad se encontraba en el grafo
    @Test
    public void testVerificar() {
        System.out.println("verificar");
        
        Grafos instance = new GrafosImpl();
        boolean expResult = true;
        boolean result = instance.verificar(contenido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    //Prueba unitaria agregas conexion entre ciudades
    @Test
    public void testAgregarConexion() {
        System.out.println("agregarConexion");
        Object v1 = null;
        Object v2 = null;
        Object contenido = null;
        Grafos instance = new GrafosImpl();
        instance.agregarConexion(v1, v2, contenido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    //Prueba unitaria tamaño del grafo
    @Test
    public void testTamanoGrafo() {
        System.out.println("tamanoGrafo");
        Grafos instance = new GrafosImpl();
        int expResult = 0;
        int result = instance.tamanoGrafo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class GrafosImpl implements Grafos {

        public void agregarNodo(V nodo) {
        }

        public void agregarConexion(V v1, V v2, E contenido) {
        }

        public String mostrarMatrizAdy() {
            return "";
        }

        public int obtenerPosicion(V contenido) {
            return 0;
        }

        public V obtenerNodo(int etiqueta) {
            return null;
        }

        public int obtenerConexion(V contenido1, V contenido2) {
            return 0;
        }

        public boolean verificar(V contenido) {
            return false;
        }

        public int tamanoGrafo() {
            return 0;
        }
    }

    

    
    
}
