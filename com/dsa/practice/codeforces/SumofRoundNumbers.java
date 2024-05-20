//https://codeforces.com/problemset/problem/1807/A
package com.dsa.practice.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumofRoundNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();

        for (int i = 0; i < noOfTestCases; i++) {

            int n = scanner.nextInt();
            List<Integer> integers = new ArrayList<>();

            int multi = 1;
            while (n > 0) {
                if (n % 10 > 0) {
                    integers.add((n % 10) * multi);
                }
                n = n / 10;
                multi = multi * 10;
            }
            System.out.println(integers.size());

            for (int j = 0; j < integers.size(); j++) {
                System.out.print(integers.get(j));
                if (j < integers.size() - 1) {
                    System.out.println(" ");
                }

            }
            System.out.println();
        }
    }

}
