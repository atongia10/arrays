package com.lesson.slidingwindow;
/*  # Problem Statement #
    Given an array of positive numbers and a positive number ‘k’,
    find the maximum sum of any contiguous subarray of size ‘k’.
* */

public class FindMaxSumSubArray {

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray( new int[] { 2, 1, 5, 1, 3, 2 }, 3));
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray( new int[] { 2, 3, 4, 1, 5 }, 2));
    }

    private static int findMaxSumSubArray(int[] input, int k) {
        int winSum = 0;
        int winStart=0;
        int winEnd = 0;
        int maxSum = Integer.MIN_VALUE;
        for(winEnd=0;winEnd<input.length;winEnd++){
            winSum+=input[winEnd];
            if(winEnd >= (k-1)){
                maxSum = Math.max(winSum, maxSum);
                winSum-=input[winStart];
                winStart++;
            }
        }
        return maxSum;
    }
}
