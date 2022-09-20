package com.chainsys.javatest;

public class NumberPyramid {
	public static void main(String arg[]) {
		pyramid();
	}

	public static void pyramid() {
		int row, colL, colLN, colR;
		for (row = 1; row < 10; row++) {
			for (colL = 9; colL > row; colL--) {
				System.out.print(".");
			}
			for (colLN = colL; colLN > 0; colLN--) {
				System.out.print(colLN);
			}
			for (colR = 2; colR <= colL; colR++)
				System.out.print(colR);
			System.out.println();
		}

	}
}
