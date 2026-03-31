package dsa.search;

import java.util.Scanner;

/**
 * BINARY SEARCH ALGORITHM
 * * PREREQUISITE: The array MUST be sorted in ascending order.
 * * TIME COMPLEXITY: O(log n)
 * Reason: With each comparison, the search space is halved. This logarithmic
 * behavior makes it significantly faster than Linear Search for large datasets.
 * * SPACE COMPLEXITY: O(1)
 * Reason: The search is performed iteratively using only a few variables
 * (left, right, mid), regardless of the input array size.
 */
public class BinarySearch {

    /**
     * Implements the binary search logic using an iterative approach.
     * * @param array The sorted array to search through
     *
     * @param key The value to find
     * @return The index of the key if found, otherwise -1
     */
    public static int binarySearchImpl(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left <= right) {
            // Calculate the middle index
            mid = (left + right) / 2;

            // Check if the key is present at the middle
            if (key == array[mid]) {
                return mid;
            }

            // If key is smaller, ignore the right half
            if (key < array[mid]) {
                right = mid - 1;
            }
            // If key is larger, ignore the left half
            else {
                left = mid + 1;
            }
        }
        // Key was not present in the array
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Note: Array is already sorted (required for Binary Search)
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        System.out.println("Please Enter the key to search: ");
        int key = sc.nextInt();

        // Execute the search
        int index = binarySearchImpl(array, key);

        // Logic Check: index will be -1 if the key is not found
        if (index != -1) {
            System.out.println("Key Found at index : " + index);
        } else {
            System.out.println("Key Not Found!");
        }
        sc.close();
    }
}