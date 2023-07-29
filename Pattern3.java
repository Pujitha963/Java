package com.patterns.level5;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			char ch='A';
			for(int j=0;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			ch--;
			for(int k=0;k<i;k++) {
				ch--;
				System.out.print(ch);
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			char ch='A';
			for(int j=0;j<n-i-1;j++) {
				System.out.print(ch);
				ch++;
			}
			ch--;
			for(int k=0;k<n-i-2;k++) {
				ch--;
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
