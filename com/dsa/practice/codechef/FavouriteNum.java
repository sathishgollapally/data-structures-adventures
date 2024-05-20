// https://www.codechef.com/problems/FAVOURITENUM
package com.dsa.practice.codechef;

import java.util.Scanner;

public class FavouriteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0 && x % 7 == 0) {
                System.out.println("Alice");
            } else if (x % 2 == 1 && x % 9 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
    }
}
