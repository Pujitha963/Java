package com.patterns.level5;

public class Pattern12 {

	public static void main(String[] args) {
		for(int j=1;j<=8;j++) {
			pattern(8-j+1);
			for(int k=1;k<j*2-1;k++) {
				System.out.print("_");
			}
			pattern(8-j+1);
			System.out.println();
		}
	}
	public static void pattern(int i) {
		for(int p=0;p<i;p++) {
			System.out.print("*");
		}
	}
}
