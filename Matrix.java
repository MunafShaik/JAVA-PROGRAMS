package com;

public class Matrix {

	public boolean searchNumber(int[][] matrix, int target) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int target = 11;
		Matrix m = new Matrix();
		boolean result = m.searchNumber(matrix, target);
		if (result) {
			System.out.println("Target is present in the matrix");
		} else {
			System.out.println("Target is not present in the matrix");

		}
	}
}
