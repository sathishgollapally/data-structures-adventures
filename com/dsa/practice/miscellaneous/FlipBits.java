package com.dsa.practice.miscellaneous;

import java.util.*;

public class FlipBits {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    for(int i = 0; i < t; i++) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a ^ b;
        System.out.println(Integer.bitCount(x));
    }

    }
}