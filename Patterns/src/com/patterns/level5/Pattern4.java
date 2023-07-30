package com.patterns.level5;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			pattern(n,i);
		}
		for(int i=n-1;i>=1;i--) {
			pattern(n,i);
		}
		sc.close();
	}
	public static void pattern(int n,int i) {
		for(int s=1;s<=n-i;s++) {
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print(j);
		}
		for(int k=2;k<=i;k++) {
			System.out.print(k);
		}
		System.out.println();
	}
}
