package dsa.sort;

import java.util.Arrays;

/**
 * BUBBLE SORT (Fully Optimized)
 * TIME COMPLEXITY:
 * - Worst Case: O(n^2)
 * - Best Case: O(n) (When array is already sorted)
 * OPTIMIZATION: Early exit using a 'flag' if no swaps occur.
 */
public class BubbleSortImproved02 {

    public static int[] bubbleSortImpl(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // Assume the array is sorted at the start of every pass
            boolean flag = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // If a swap happens, the array wasn't fully sorted yet
                    flag = true;
                }
            }

            // If NO swaps happened in a whole pass, the array IS sorted.
            // Exit early to save time!
            if(!flag){
                break;
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