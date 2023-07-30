package com.patterns.level5;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			pattern(i);
		}
		for(int i=5-1;i>=1;i--) {
			pattern(i);
		}
	}
	public static void pattern(int i) {
		for(int s=1;s<i;s++) {
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}

}
