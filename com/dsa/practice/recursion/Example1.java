package com.dsa.practice.recursion;

public class Example1 {
    public static void main(String[] args) {
        print(1, 100);
    }

    public static void print(int i, int n) {
        System.out.println(i);
        if(i == n) {
            return;
        }
        print(i+1, n);
    }

}
