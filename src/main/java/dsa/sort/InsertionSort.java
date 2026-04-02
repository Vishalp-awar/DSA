package dsa.sort;

import java.util.Arrays;

/**
 * INSERTION SORT (Standard Implementation)
 * TIME COMPLEXITY: O(n^2) - Worst/Average, O(n) - Best Case.
 * SPACE COMPLEXITY: O(1) - In-place sorting.
 */
public class InsertionSort {

    public static int[] insertionSortImpl(int[] arr){
        // Outer loop: Starts from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i]; // Store the current element to be inserted

            // Inner loop: Shifts elements of the sorted segment to the right
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                // Move the larger element one position ahead
                arr[j + 1] = arr[j];
            }

            // Insert the stored element into its correct sorted position
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {33, 88, 66, 99, 44, 77, 55, 22, 11};

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        insertionSortImpl(arr);
        System.out.println("After Sorting  : " + Arrays.toString(arr));
    }
}