package com.dsa.practice.miscellaneous;

import java.util.*;

public class TowersOfHanoi {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    int n;
    for(int tc = 0; tc < t; tc++) {
        n = scanner.nextInt();    
        int movesRequired = 1;
        if(n > 1) {
            movesRequired = (int) Math.pow(2, n) - 1;
        }
        System.out.println(movesRequired);
        printTowersOfHanoi(n, 'A', 'C','B');
    }

    }

   public static void printTowersOfHanoi(int n, char src, char dest, char temp) {
        if(n == 0) {
            return;
        }

        printTowersOfHanoi(n-1, src, temp, dest);
        System.out.println("Move " + n +" from " +src +" to " + dest);
        printTowersOfHanoi(n-1, temp, dest, src);

    }
}