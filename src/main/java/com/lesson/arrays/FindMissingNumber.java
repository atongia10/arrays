package com.lesson.arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] input = {1, 2, 6, 4, 3, 7};
        System.out.println(findMissingNumber_way1(input));
        int[] arr = new int[] { 1, 4, 2, 1, 3, 5, 16, 2, 3, 5 };
        System.out.println(findSingleNumbers(arr));
    }

    private static int findMissingNumber_way1(int[] input) {
        int sumXOR = 0;
        int seriesXOR = 0;
        for(int i=1; i<=input.length+1;i++){
            sumXOR = i ^ sumXOR;
        }
        for(int j=0;j<input.length;j++){
            seriesXOR = seriesXOR ^ input[j];
        }
        return seriesXOR ^ sumXOR;
    }

    public static int[] findSingleNumbers(int[] nums) {
        // get the XOR of the all the numbers
        int n1xn2 = 0;
        for (int num : nums) {
            n1xn2 ^= num;
        }

        // get the rightmost bit that is '1'
        int rightmostSetBit = 1;
        while ((rightmostSetBit & n1xn2) == 0) {
            rightmostSetBit = rightmostSetBit << 1;
        }
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) // the bit is set
                num1 ^= num;
            else // the bit is not set
                num2 ^= num;
        }
        return new int[] { num1, num2 };
    }

}
