package com.dsa.practice.codeforces;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int x = 0;

        for (int i = 0; i < n; i++) {
            String operation = scanner.next();

            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        
        System.out.println(x);
        
        scanner.close();
    }
}
