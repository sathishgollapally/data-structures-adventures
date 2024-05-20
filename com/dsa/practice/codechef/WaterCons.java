//https://www.codechef.com/problems/WATERCONS
package com.dsa.practice.codechef;


import java.util.Scanner;

public class WaterCons
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int x = sc.nextInt();
			if(x >= 2000) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}
}
