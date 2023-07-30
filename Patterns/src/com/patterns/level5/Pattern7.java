package com.patterns.level5;

public class Pattern7 {

	public static void main(String[] args) {
		int n=5,p=0;
		for(int i=1;i<=n;i++) {
			p = i;
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
				p = p+ (n-j);
			}
			System.out.println();
		}
	}

}
