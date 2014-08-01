/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 * Isa Contreras 13154 / Luis Orellana 13140/ Erick de Mata 13648
 * Bubble.java
* Ordenamiento de números que utiliza datos del archivo de texto generado*/

//package sorting;


public class Bubble {
    
    
    public void bubbleSort(Comparable[] inputArr) {
      
      //Mientras no se hayan recorrido todos los datos
      for (int index = 1; index < inputArr.length; index++)
      {
        //primera posicion como llave
        Comparable key = inputArr[index];
        int position = index;

        //Mientras no sea posicion 0 y key sea menor a la posicion anterior
        while (position > 0 && key.compareTo(inputArr[position-1]) < 0)
        {
           
           inputArr[position] = inputArr[position-1];
           position--;
        }

        inputArr[position] = (int) key;
      }
      //Impresión de la lista ordenada
      System.out.println("El resultado ordenado (Bubble) es");
                for (int x = 0; x < inputArr.length-1; x++){
                    System.out.println(inputArr[x]);
                }
    }
}
