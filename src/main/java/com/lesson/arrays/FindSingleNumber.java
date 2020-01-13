package com.lesson.arrays;

public class FindSingleNumber {

    public static void main(String[] args) {
        int [] input = {1, 4, 2, 1, 3, 2, 3};
        System.out.println(findSingleNumber(input));
    }

    private static int findSingleNumber(int[] input) {
        int sumXor = 0;

        for(int i=0;i<input.length;i++){
            sumXor = sumXor ^ input[i];
        }
        return sumXor;
    }
}
