package com.dsa.practice.miscellaneous;

import java.util.*;

public class PrintAUsingB {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] a = new int[n];

    for(int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }

    int m = sc.nextInt();

    int[] b = new int[m];

    for(int j = 0; j < m ; j++) {
        b[j] = sc.nextInt();
    }

    for(int i = 0; i < m ; i++) {
        int index = b[i];
        if(index >=0 && index < n) {
            System.out.print(a[index]+" ");
        } else {
            System.out.print("-1 ");
        }
    }

    }
}