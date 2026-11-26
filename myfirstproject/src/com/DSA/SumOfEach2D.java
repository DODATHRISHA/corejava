package com.DSA;

public class SumOfEach2D {

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };


		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = a[i][j] + sum;
			}
			System.out.println(sum);
		}
	}

}
