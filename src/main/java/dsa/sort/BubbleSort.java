package dsa.sort;

import java.util.Arrays;

/**
 * BUBBLE SORT (Standard Implementation)
 * TIME COMPLEXITY: O(n^2) - Always runs full nested loops.
 * SPACE COMPLEXITY: O(1) - In-place sorting.
 */
public class BubbleSort {

    public static int[] bubbleSortImpl(int[] arr){
        // Outer loop: Number of passes required to sort the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop: Always scans the entire array minus the last element
            for (int j = 0; j < arr.length - 1; j++) {
                // If the left element is greater, swap them (Bubbling up)
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 126, 2, 8, 3, 1, 125};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        bubbleSortImpl(arr);
        System.out.println("After Sorting  : " + Arrays.toString(arr));
    }
}