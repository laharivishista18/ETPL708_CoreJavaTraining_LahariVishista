package com.evergent.corejava.Arrays;

public class DDarray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0||j==0||i==4||j==4) {
					ar[i][j]=7;
			}
				else {
					ar[i][j]=1;
			}
				System.out.print(ar[i][j]+" ");
				}
			System.out.println();

	}

}}
