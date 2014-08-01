/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 *Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * InsertionTest.java
* Prueba unitaria del tipo de ordenamiento Insertion*/

//package sorting;

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
public class InsertionTest {
    
    public InsertionTest() {
    }
    
    //Prueba Unitaria del método InsertionSort 
    //Se crea una cadena de número desordenados y se indica como se espera que sean ordenados
    @Test
    public void testInsertionSort() {
        System.out.println("INSERTION SORT");
        Merge instance = new Merge();
        Integer [] ingresado = {10000,23000,49000,56000,48500};
        Comparable[] inputArr = ingresado;
        instance.mergeSort(inputArr);
        Integer [] esperado = {10000,23000,48500,49000,56000};  
         //Si ambas cadenas son iguales, la prueba será exitosa
        assertArrayEquals(ingresado,esperado);
    }

    
}

//Bibliografia:
//JUnit Example. En: http://cda.morris.umn.edu/~elenam/2101_summer10/examples/junit.html , [visitado el dia 31/07/2014]
