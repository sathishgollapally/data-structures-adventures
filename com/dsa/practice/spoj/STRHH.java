package com.dsa.practice.spoj;

import java.util.*;
import java.lang.*;


public class STRHH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++) {
            String s = sc.nextLine();
            for(int j = 0; j < s.length()/2; j= j+2) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}