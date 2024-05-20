package com.dsa.practice.gfg;

public class ArmstrongNumber {
	public static void main (String[] args) {
		System.out.println(armstrongNumber(152));
	}

	public static String armstrongNumber(int n){
		int temp = n;
		int sum = 0;
		while ( n > 0) {
			int digit = n % 10;
			sum = sum + digit * digit * digit;
			n /= 10;
		}
		return sum == temp ? "Yes" : "No";
	}
}
