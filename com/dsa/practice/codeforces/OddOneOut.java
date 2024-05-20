//https://codeforces.com/contest/1915/problem/A
package com.dsa.practice.codeforces;

import java.util.Scanner;

public class OddOneOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();

        for (int i = 0; i < noOfTestCases; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == b) {
                System.out.println(c);
            } else if (b == c) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }

        }
    }

}
