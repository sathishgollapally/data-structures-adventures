//https://codeforces.com/contest/1915/problem/A
package com.dsa.practice.codeforces;

import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(checkStrings(str1, str2));

    }

    public static int checkStrings(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) < str2.charAt(i)) {
                return -1;
            } else if (str2.charAt(i) < str1.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }

}
