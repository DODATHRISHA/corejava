package com.DSA;

public class SmallestelementeachRow {

	public static void main(String[] args) {

		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int j = 0; j < a[0].length; j++) {
			int Smallest = a[0][j];
			for (int i = 0; i < a.length; i++) {
				if (a[i][j] < Smallest) {
					Smallest = a[i][j];
				}

			}
			System.out.println(Smallest);

		}

	}

}
