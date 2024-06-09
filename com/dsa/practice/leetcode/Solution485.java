package com.dsa.practice.leetcode;

public class Solution485 {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1,0,1};
        int result = findMaxConsecutiveOnes(a);
        System.out.println(result);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutiveOnes = Integer.MIN_VALUE;
        int count = 0;

       for(int num : nums) {
            if(num == 1) {
                count++;
            } else {
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
                count = 0;
            }
       }
       maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
       return maxConsecutiveOnes;
    }

}