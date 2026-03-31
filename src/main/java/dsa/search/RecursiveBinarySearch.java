package dsa.search;

import java.util.Scanner;

/**
 * RECURSIVE BINARY SEARCH ALGORITHM
 * * PREREQUISITE: The array MUST be sorted.
 * * TIME COMPLEXITY: O(log n)
 * Reason: Each recursive call reduces the search space by half.
 * For 'n' elements, we can only divide the array log(n) times.
 * * SPACE COMPLEXITY: O(log n)
 * Reason: Unlike the iterative version (which is O(1)), the recursive version
 * uses the stack memory for each recursive call. In the worst case,
 * there will be log(n) frames on the call stack.
 */
public class RecursiveBinarySearch {

    /**
     * Implements Binary Search using Recursion.
     * * @param arr   The sorted array to search
     *
     * @param left  Starting index of the search range
     * @param right Ending index of the search range
     * @param key   The value to find
     * @return Index of the key if found, otherwise -1
     */
    public static int recursiveBinarySearchImpl(int[] arr, int left, int right, int key) {
        // Base Case 1: Search range is exhausted (Key not found)
        if (right < left) {
            return -1;
        }

        // Calculate mid point
        int mid = (left + right) / 2;

        // Base Case 2: Key found at middle
        if (arr[mid] == key) {
            return mid;
        }

        // Recursive Step: If key is smaller, search in the left half
        if (key < arr[mid]) {
            return recursiveBinarySearchImpl(arr, left, mid - 1, key);
        }

        // Recursive Step: If key is larger, search in the right half
        else {
            return recursiveBinarySearchImpl(arr, mid + 1, right, key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sorted array required for Binary Search
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        System.out.println("Please Enter the key to search: ");
        int key = sc.nextInt();

        // Initial call with full array range (0 to length-1)
        int resultIndex = recursiveBinarySearchImpl(array, 0, array.length - 1, key);

        if (resultIndex != -1) {
            System.out.println("Recursive Key Found at index : " + resultIndex);
        } else {
            System.out.println("Recursive Key Not Found!");
        }

        sc.close();
    }
}