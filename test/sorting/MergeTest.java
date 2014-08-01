/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 *Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * MergeTest.java
* Prueba unitaria del tipo de ordenamiento Merge*/

//package sorting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MergeTest {
    
    public MergeTest() {
    }
    
    //Prueba Unitaria del método MergeSort 
    //Se crea una cadena de número desordenados y se indica como se espera que sean ordenados
    @Test
    public void testMergeSort() {
        System.out.println("MERGE SORT");
        Merge instance = new Merge();
        Integer [] ingresado = {333,435,235};
        Comparable[] inputArr = ingresado;
        instance.mergeSort(inputArr);
        Integer [] esperado = {235,333,435};  
         //Si ambas cadenas son iguales, la prueba será exitosa
        assertArrayEquals(ingresado,esperado);
    }

    
}

//Bibliografia:
//JUnit Example. En: http://cda.morris.umn.edu/~elenam/2101_summer10/examples/junit.html , [visitado el dia 31/07/2014]
