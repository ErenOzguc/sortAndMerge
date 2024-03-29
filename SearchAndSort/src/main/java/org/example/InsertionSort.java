// Insertion sort in Java
package org.example;
import org.example.Print;

import java.util.Arrays;

public class InsertionSort {

    void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    // Driver code
    public  void sort(int array[]) {
        Print print = new Print();
        InsertionSort is = new InsertionSort();
        is.insertionSort(array);
      print.yazdir("sorted by insertionSort ",array);
    }
}