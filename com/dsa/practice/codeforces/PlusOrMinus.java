//https://codeforces.com/problemset/problem/1807/A
package com.dsa.practice.codeforces;

import java.util.Scanner;

public class PlusOrMinus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();

        for(int i = 0; i < noOfTestCases; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if( a + b == c) {
                System.out.println("+");
            } else if (a - b == c) {
                System.out.println("-");
            }
        }
    }

}
