package com.patterns.level5;

public class Pattern25 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			System.out.printf("%3d",i);
			int p=i;
			for(int j=1;j<i;j++) {
				if(j%2!=0) {
					System.out.printf("%3d",p+(2*(n-i+1))-1);
					p = p+(2*(n-i+1))-1;
				}
				else {
					System.out.printf("%3d",p+(2*(i-j)));
					p = p+(2*(i-j));
				}
			}
			System.out.println();
		}
	}

}
