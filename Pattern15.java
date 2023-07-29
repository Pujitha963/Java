package com.patterns.level5;

public class Pattern15 {

	public static void main(String[] args) {
		String s = "KODNEST";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j>=0;j--) {
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
