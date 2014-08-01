/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temporallate file, choose Tools | Templates
 * and open the temporallate in the editor.
 */

package sorting;

/**
 *
 * @author Isa
 */
public class Insertion {


   public void insertionSort (Comparable[] inputArr)
   {

      int minimo; //valor minimo
      Comparable temporal; //lista comparable temporal

      //mientras no se haya recorrido toda la lista
      for (int index = 0; index < inputArr.length-1; index++)
      {
         
         minimo = index;
         
         
         for (int actual = index+1; actual < inputArr.length; actual++)
         
             //si el dato actual es menor
             if (inputArr[actual].compareTo(inputArr[minimo]) < 0)
               minimo = actual;

         //Cambio de los valores 
         temporal = inputArr[minimo];
         inputArr[minimo] = inputArr[index];
         inputArr[index] = temporal;
      }
      
      //impresion de la lista ordenada
      System.out.println("El resultado ordenado (Insertion) es");
                for (int x = 0; x < inputArr.length-1; x++){
                    System.out.println(inputArr[x]);
                }
   }

   public static void insertionSorting (Comparable[] inputArr)
   {
      
       //Mintras la lista no este terminada
       for (int index = 1; index < inputArr.length; index++)
      {
         
         Comparable key = inputArr[index];
         int posicion = index;

         //Mientras no sea posicion 0 y la posición key sea menor a la posicion anterior
         while (posicion > 0 && key.compareTo(inputArr[posicion-1]) < 0)
         {
            //cargar como nueva posicion el dato anterior
            inputArr[posicion] = inputArr[posicion-1];
            posicion--;
         }
            
         inputArr[posicion] = key;
      }
   }
}


