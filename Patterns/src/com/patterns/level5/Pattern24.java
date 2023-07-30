package com.patterns.level5;

public class Pattern24 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=0;j<=6;j++) {
				if((i+j)%7==0) {
					System.out.print("7 ");
				}
				else {
					System.out.print((i+j)%7+" ");
				}
			}
			System.out.println();
		}
	}

}
