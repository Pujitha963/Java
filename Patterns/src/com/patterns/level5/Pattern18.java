package com.patterns.level5;

public class Pattern18 {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if((j==1&&i<6) || (i==1 && j>4) || i==5 || j==5 || (i==9&&j<6) || (i>5&&j==9)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
