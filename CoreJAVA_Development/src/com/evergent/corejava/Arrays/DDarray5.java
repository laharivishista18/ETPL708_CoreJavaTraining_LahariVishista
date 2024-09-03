package com.evergent.corejava.Arrays;

public class DDarray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[5][5];
		int count=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				count=count+1;
				a[i][j]=count;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
