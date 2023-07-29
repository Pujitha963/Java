package com.patterns.level5;

public class Pattern13 {

	public static void main(String[] args) {
		for(int i=0;i<=6;i++) {
			int k=(int)Math.pow(2, i);
			for(int j=1;j<=i+1;j++) {
				System.out.printf("%3d",k);
				k=k/2;
			}
			System.out.println();
		}
	}

}
