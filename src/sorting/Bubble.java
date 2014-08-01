/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

/**
 *
 * @author Isa
 */
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
      System.out.println("El resultado ordenado (Bubble) es");
                for (int x = 0; x < inputArr.length-1; x++){
                    System.out.println(inputArr[x]);
                }
    }
}
