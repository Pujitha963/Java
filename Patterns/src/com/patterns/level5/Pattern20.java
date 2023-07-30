package com.patterns.level5;

public class Pattern20 {

	public static void main(String[] args) {
		int num=5;
		int a[][]=new int[num][num];
		int n=1,f=0;
		for(int i=f;i<num/2+1;i++) {
			for(int j=f;j<num-f;j++) {
				a[i][j]=n;
				n++;
			}
			for(int p=f+1;p<num-f;p++) {
				a[p][num-f-1]=n;
				n++;
			}
			for(int q=num-f-2;q>=f;q--) {
				a[num-f-1][q]=n;
				n++;
			}
			for(int q=num-f-2;q>=f+1;q--) {
				a[q][f]=n;
				n++;
			}
			f++;
		}
		for(int i[]:a) {
			for(int j:i) {
				System.out.printf("%4d",j);
			}
			System.out.println();
		}
	}

}
