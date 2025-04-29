package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums);       // {1, 1, 2, 3, 4, 5}

        System.out.println(Arrays.toString(nums));
    }

    /*
    31    5214
    1 35  214
    13 52 14
    132 51 4
    1321 54
    132145    | 5

    13214
    1 32 14
    12 31 4
    121 34
    12134     | 4

    1213
    12 13
    1 21 3
    11 23
    1123      | 3
     */

    /**
     * Sorts an array by comparing adjascent elements and swapping if in wrong order
     * @param nums the input array to sort
     */
    public static void bubbleSort(int[]nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}