package com.dsa.practice.leetcode;

public class Solution258 {
    public static void main(String[] args) {
        int result = addDigits(10);
        System.out.println(result);
    }

    // by math formula
    public static int addDigits(int num) {
        if(num <= 9) {
            return num;
        } else {
            return 1 + ( num -1 ) % 9 ; // if we do only num % 9, it will work for numbers which are not divisible by 9
        }
    }

    // by code
    public static int addDigits1(int num) {
        int sum = 0;
        while(num > 0 || sum > 9) {
            if(num == 0) {
                num = sum;
                sum = 0;
            } else {
                sum = sum +  num % 10;
                num = num/10;
            }
        }

        return sum;
    }




}