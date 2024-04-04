package com.dsa.practice.fibonacci;

import java.util.Scanner;

public class Fibonacci {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int N = scanner.nextInt();
           int n1 = 0;
           int n2 = 1;
           if(N ==1) {
               System.out.println(n1);
           } else if (N ==1) {
               System.out.println(n2);
           }else {
               System.out.println(n1);
               System.out.println(n2);
               for(int i = 2; i <N; i++) {
                   int n3 = n1 + n2;
                   n1 = n2;
                   n2 = n3;
                   System.out.println(n3);
               }

           }

    }


}
