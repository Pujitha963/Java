package com.patterns.level5;

public class Pattern6 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=6;i++) {
			pattern(ch,i);
			ch++;
		}
		ch='E';
		for(int i=6-1;i>=1;i--) {
			pattern(ch,i);
			ch--;
		}
	}
    public static void pattern(char ch,int i) {
    	for(int s=1;s<=6-i;s++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i*2-1;j++) {
			if(j==1 || j==i*2-1) {
				System.out.print(ch);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
    }
}
