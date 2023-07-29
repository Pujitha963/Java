package com.patterns.level5;

public class Pattern14 {

	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			int k=(int)Math.pow(2, 0);
			for(int k1=1;k1<=i+1;k1++) {
				System.out.printf("%3d",k);
				k=k*2;
			}
			k=(int)Math.pow(2, i);
			for(int j=1;j<=i;j++) {
				k=k/2;
				System.out.printf("%3d",k);
			}
			System.out.println();
		}
	}

}
