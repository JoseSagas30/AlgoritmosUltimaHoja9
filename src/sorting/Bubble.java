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
    public void sort(int[] inputArr) {
      for (int index = 1; index < inputArr.length; index++)
      {
        Comparable key = inputArr[index];
        int position = index;

        //  Shift larger values to the right
        while (position > 0 && key.compareTo(inputArr[position-1]) < 0)
        {
           inputArr[position] = inputArr[position-1];
           position--;
        }

        inputArr[position] = (int) key;
      }
    }
}
