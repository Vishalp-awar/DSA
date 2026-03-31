package dsa.sort;

import java.util.Arrays;

/**
 * SELECTION SORT ALGORITHM (Standard Implementation)
 * * TIME COMPLEXITY: O(n^2)
 * Reason: Contains two nested loops. The outer loop runs (n-1) times,
 * and the inner loop performs comparisons to find the minimum element.
 * * SPACE COMPLEXITY: O(1)
 * Reason: It is an in-place sorting algorithm, meaning it only requires
 * a constant amount of extra memory (for the temp variable and indices).
 */
public class SelectionSort {

    /**
     * Sorts the array by repeatedly finding the minimum element from the
     * unsorted part and swapping it with the first element of that part.
     * * @param arr The unsorted integer array
     * @return    The sorted integer array
     */
    public static int[] SelectionSortImpl(int[] arr) {

        // Outer loop: Moves the boundary between the sorted and unsorted parts
        for (int i = 0; i < arr.length - 1; i++) {

            // Step 1: Assume the current index 'i' holds the minimum value
            int minIndex = i;

            // Step 2: Inner loop: Scan the rest of the array (from i+1 to end)
            for (int j = i + 1; j < arr.length; j++) {
                // Update minIndex if a smaller element is found
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Step 3: Swap the found minimum element with the element at index 'i'
            // This ensures only ONE swap happens per outer loop iteration.
            int tempVar = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tempVar;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {88, 33, 66, 99, 44, 77, 22, 55, 11};

        System.out.println("Before array : " + Arrays.toString(array));

        // Sorting the array
        SelectionSortImpl(array);

        System.out.println("After array  : " + Arrays.toString(array));
    }
}