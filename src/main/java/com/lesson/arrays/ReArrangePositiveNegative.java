package com.lesson.arrays;

import java.util.Arrays;

public class ReArrangePositiveNegative {

    public static void main(String[] args) {
        ReArrangePositiveNegative reArrangePositiveNegative = new ReArrangePositiveNegative();

        int [] arr = {10, -1, 20, 4, 5, -9, -6};
        Arrays.stream(reArrangePositiveNegative.reArrange(arr))
                .forEach(System.out::println);

    }

    private int [] reArrange(int[] arr) {
        int next = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {   // if negative number found
                if (i != next) {
                    int temp = arr[i];
                    arr[i] = arr[next]; // swapping with leftmost positive
                    arr[next] = temp;
                }
                next++;
            }
        }
        return arr;
    }

}
