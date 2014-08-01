/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 *Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * BubbleTest.java
* Prueba unitaria del tipo de ordenamiento Bubble*/
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
public class BubbleTest {
    
    public BubbleTest() {
    }
    //Prueba Unitaria del método BubbleSort 
    //Se crea una cadena de número desordenados y se indica como se espera que sean ordenados
    @Test
    public void testBubbleSort() {
        System.out.println("BUBBLE SORT");
        Merge instance = new Merge();
        Integer [] ingresado = {9,3,5,2,1,6,4};
        Comparable[] inputArr = ingresado;
        instance.mergeSort(inputArr);
        Integer [] esperado = {1,2,3,4,5,6,9};  
         //Si ambas cadenas son iguales, la prueba será exitosa
        assertArrayEquals(ingresado,esperado);
    }
    
}

//Bibliografia:
//JUnit Example. En: http://cda.morris.umn.edu/~elenam/2101_summer10/examples/junit.html , [visitado el dia 31/07/2014]