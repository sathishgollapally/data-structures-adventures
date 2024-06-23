package com.dsa.practice.spoj;

import java.util.Scanner;

class ADDREV {
    public static void main (String[] args) throws Exception	{

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = reverse(reverse(a) + reverse(b));
            System.out.println(result);
        }

    }

    public static int reverse(int number) {
        int rev = 0;
        while(number > 0) {
            int rem = number % 10;
            rev = rem + (rev * 10);
            number = number/10;
        }
        return rev;
    }
}