package com.dsa.practice.miscellaneous;

import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner scanner  = new Scanner(System.in);
        int arr[] = new int[99];
        int N = 100;
        int actualSum = 0;
        int expectedSum = N * (N+1) /2;
        System.out.println(expectedSum);
        for(int i = 0; i < 99; i++) {
            actualSum = actualSum + scanner.nextInt();
        }
        System.out.println(expectedSum - actualSum);

    }
}