package com.patterns.level5;

public class Pattern9 {

	public static void main(String[] args) {
		int n=7,p=1,k=1,z=n-1,t=n;
		for(int i=1;i<=n;i++) {
			z=t;
			for(int j=1;j<=i;j++) {
				System.out.print(p+" ");
				p=p-z;
				z++;
			}
			System.out.println();
			k=k+n-i+1;
			p=k;
			t--;
		}
	}

}
