package com.dsa.practice.leetcode;

public class Solution263 {
    public static void main(String[] args) {
        boolean isUgly = isUgly(14);
        System.out.println(isUgly);
    }

    public static boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                break;
            }
        }
        return n == 1;
    }
}