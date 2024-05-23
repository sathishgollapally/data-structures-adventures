package com.dsa.practice.leetcode;

public class Solution344 {
    public static void main(String[] args) {
        char[] s = {'h','e'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }

    }


}