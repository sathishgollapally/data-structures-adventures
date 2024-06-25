package com.dsa.practice.miscellaneous;

import java.util.*;

public class PowerOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            boolean res = (N & (N-1)) == 0;
            if(res) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    }
}