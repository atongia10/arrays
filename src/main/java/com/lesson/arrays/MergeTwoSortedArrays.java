package com.lesson.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        MergeTwoSortedArrays MergeTwoSortedArrays = new MergeTwoSortedArrays();

        int[] arr1 = {1, 3, 4, 15};
        int[] arr2 = {0, 2, 6, 7, 8, 12};

        Arrays.stream(MergeTwoSortedArrays.mergeArrays(arr1, arr2))
            .forEach(System.out::println);

    }

    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int [] result = new int[arr1.length + arr2.length];

        int i =0;
        int j=0;
        int k=0;

        while (i < arr1.length && j < arr2.length) {
         if(arr1[i] <= arr2[j]){
             result[k++]=arr1[i++];
         } else {
             result[k++]=arr2[j++];
         }
        }

        while (i<arr1.length){
            result[k++]=arr1[i++];
        }

        while (j<arr2.length){
            result[k++]=arr2[j++];
        }

        return result;
    }

}
