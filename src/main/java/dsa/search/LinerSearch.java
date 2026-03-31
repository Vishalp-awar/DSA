package dsa.search;

import java.util.Scanner;

/**
 * LINEAR SEARCH ALGORITHM
 * * TIME COMPLEXITY: O(n)
 * Reason: In the worst case (key is at the end or not present), the algorithm
 * must check every single element in the array exactly once.
 * * SPACE COMPLEXITY: O(1)
 * Reason: The search is performed in-place. We only use a fixed amount of
 * extra space for the loop counter 'i', regardless of the array size.
 */
public class LinerSearch {

    /**
     * Iterates through the array sequentially to find the target key.
     * * @param arr The array to be searched
     *
     * @param key The value to look for
     * @return The index of the key if found, otherwise -1
     */
    public static int linerSearchImpl(int[] arr, int key) {
        // Step 1: Start a loop from the first element (index 0)
        for (int i = 0; i < arr.length; i++) {
            // Step 2: Compare current element with the key
            if (arr[i] == key) {
                // Step 3: If match is found, return the current index
                return i;
            }
        }
        // Step 4: If the loop finishes without a match, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {88, 33, 66, 99, 44, 77, 22, 55, 11};

        System.out.println("Please Enter the key to search: ");
        int key = sc.nextInt();

        // Execute the search
        int index = linerSearchImpl(array, key);

        // Logic Check: index will be -1 if the key is not found
        if (index != -1) {
            System.out.println("Key Found at index : " + index);
        } else {
            System.out.println("Key Not Found!");
        }

        sc.close();
    }
}