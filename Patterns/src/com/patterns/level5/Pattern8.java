package com.patterns.level5;

public class Pattern8 {

	public static void main(String[] args) {
		int n=8;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print("\\");
				}
				else if(j==n-i+1) {
					System.out.print("/");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
