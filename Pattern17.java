package com.patterns.level5;

public class Pattern17 {

	public static void main(String[] args) {
		int n=3,front=0,back=n*2-1;
		int a[][]=new int[n*2-1][n*2-1];
		while(n!=0) {
			for(int i=front;i<back;i++) {
				for(int j=front;j<back;j++) {
					if(j==front ||i==front ||i==back-1||j==back-1) {
						a[i][j]=n;
					}
				}
			}
			++front;
			--back;
			--n;
		}
		for(int[] i:a) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
