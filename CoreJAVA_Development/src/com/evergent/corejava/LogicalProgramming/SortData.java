package com.evergent.corejava.LogicalProgramming;
public class SortData {
	int n, temp, i, j;
	public void asec(int num[]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
	}
	public void desc(int num[]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Descending Order");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
	}
}
