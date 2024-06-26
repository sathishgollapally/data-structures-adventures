package com.dsa.practice.miscellaneous;

import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = 100;
        int actualSum = 0;
        int expectedSum = n * (n+1) /2;
        System.out.println(expectedSum);
        for(int i = 0; i < 99; i++) {
            actualSum = actualSum + scanner.nextInt();
        }
        System.out.println(expectedSum - actualSum);

    }
}