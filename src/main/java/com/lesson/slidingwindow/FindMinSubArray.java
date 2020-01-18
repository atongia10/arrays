package com.lesson.slidingwindow;
/*  # Problem Statement #
    Given an array of positive numbers and a positive number ‘S’,
    find the length of the smallest contiguous subarray
    whose sum is greater than or equal to ‘S’.
    Return 0, if no such subarray exists.
* */
public class FindMinSubArray {

    public static void main(String[] args) {
        int result = findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + result);
        result = findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
        System.out.println("Smallest subarray length: " + result);
        result = findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + result);
    }

    private static int findMinSubArray(int k, int[] input) {
        int winStart = 0;
        int winEnd = 0;
        int minNumber = Integer.MAX_VALUE;
        int sum = 0;

        for(winEnd=0;winEnd<input.length;winEnd++){
            sum+=input[winEnd];
            while(sum >= k){
                minNumber = Math.min(minNumber, (winEnd-winStart)+1);
                sum-=input[winStart];
                winStart++;
            }
        }
        return minNumber;
    }

}
