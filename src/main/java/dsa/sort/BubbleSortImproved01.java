package dsa.sort;

import java.util.Arrays;

/**
 * BUBBLE SORT (Improved Pass Logic)
 * TIME COMPLEXITY: O(n^2)
 * OPTIMIZATION: Reduces the inner loop range by 'i' in each pass.
 */
public class BubbleSortImproved01 {

    public static int[] bubbleSortImpl(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // OPTIMIZATION: arr.length - 1 - i
            // We ignore the last 'i' elements because they are already sorted!
            for (int j = 0; j < arr.length - 1 - i; j++) {
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