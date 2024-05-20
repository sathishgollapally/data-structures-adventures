package com.dsa.practice.leetcode;

public class Solution2652 {

    public static void main(String[] args) {
        int isUgly = sumOfMultiples(9);
        System.out.println(isUgly);
    }

    public static int sumOfMultiples(int n) {

        int sum = 0;
        for(int i = 0; i <= n ; i++) {
            if(i % 3 == 0  || i % 5 == 0 || i % 7 == 0) {
                System.out.println(i);
                    sum =+ i;
            }
        }
        return sum;
    }
}