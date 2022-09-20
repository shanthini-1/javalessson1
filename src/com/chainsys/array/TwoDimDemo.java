package com.chainsys.array;

public class TwoDimDemo {
	public static void createTwoDimArray() {
		int twod[][] = new int[4][5];// 4 rows 5 cols
		int rowIndex, colIndex = 0;
		int data = 0;
		for (rowIndex = 0; rowIndex < 4; rowIndex++) {
			for (colIndex = 0; colIndex < 5; colIndex++) {
				twod[rowIndex][colIndex] = data;
				data++;
			}
		}
		for (rowIndex = 0; rowIndex < 4; rowIndex++) {
			for (colIndex = 0; colIndex < 5; colIndex++) {
				System.out.print(twod[rowIndex][colIndex] + "\t ");
			}
			System.out.println();

		}
	}

	public static void calculateToTotalandAverage() {
		int marks[][] = new int[][] { { 86, 98, 84, 46, 76, 0, 0 }, { 98, 82, 71, 64, 64, 0, 0 },
				{ 77, 97, 86, 60, 59, 0, 0 }, { 38, 93, 40, 83, 91, 0, 0 }, { 89, 77, 90, 60, 50, 0, 0 }, };// 5 rows 7
																											// col
		int rowIndex, colIndex, sum = 0;
		for (rowIndex = 0; rowIndex < 5; rowIndex++) {
			for (colIndex = 0; colIndex < 5; colIndex++) {

				sum += marks[rowIndex][colIndex];
			}
			marks[rowIndex][5] = sum;
			marks[rowIndex][6] = sum / 5;
			sum = 0;
		}
		// Display the marks,total,Average
		int subjectNo = 1;
		for (subjectNo = 1; subjectNo <= 5; subjectNo++)
			System.out.print("SUB" + (subjectNo) + "\t |");
		System.out.print("TOTAL\t |");
		System.out.println("AVG\t |");
		System.out.println("---------------------------------------------------------");
		for (rowIndex = 0; rowIndex < 5; rowIndex++) {
			for (colIndex = 0; colIndex < 7; colIndex++) {
				System.out.print(marks[rowIndex][colIndex] + "\t |");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------");
	}

/**	public static void fewOtherWaysOfCreatingTwoDintArray() {
		int[] a[] = new int[4][4];// col for all the rows are equal
		int a1[][] = new int[4][4];
		// int a2[][]=new int[][4]; <- wrong
		// uneven 2D arrays-the col for all the rows are not equal
		int[] a3[] = new int[4][];
		int[][] a4 = new int[4][4];
		// col for all the rows are equal
		int[][] a5 = new int[4][4];
		// col for all the row are equal
		int[] i[] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		// col for all the row are equal
		// int j[]=new int[2] {1,2};//wrong
		int k[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		// col for all the rows are equal
	}
**/
	public static void unevenTwodArray() {
		int[][] uneventwod = new int[4][];
		uneventwod[0] = new int[1];
		uneventwod[1] = new int[4];
		uneventwod[2] = new int[3];
		uneventwod[3] = new int[2];
		int rowIndex, colIndex, rowlength = 0, data = 100;
		for (rowIndex = 0; rowIndex < 4; rowIndex++) {
			rowlength = uneventwod[rowIndex].length;
			for (colIndex = 0; colIndex < rowlength; colIndex++) {
				uneventwod[rowIndex][colIndex] = data;
				data++;
			}
		}
		for (rowIndex = 0; rowIndex < 4; rowIndex++) {
			rowlength = uneventwod[rowIndex].length;
			for (colIndex = 0; colIndex < rowlength; colIndex++) {
				System.out.println(uneventwod[rowIndex][colIndex] + " ");
			}
			System.out.println();
		}
	}

//leela's way
	public static void unevenTwoDArray() {
		int uneventwod[][] = new int[3][];
		uneventwod[0] = new int[1];
		uneventwod[1] = new int[1];
		uneventwod[2] = new int[1];
		int rowIndex, colIndex, rowlength = 0;
		String data[] = { "hai", "i am leela", "oracle java developer" };
		for (rowIndex = 0; rowIndex < 3; rowIndex++) {
			rowlength = uneventwod[rowIndex].length;
			for (colIndex = 0; colIndex < rowlength; colIndex++) {
				System.out.print(data[rowIndex] + " ");
			}
			System.out.println();
		}
	}
	
	
//
	public static void calculateToTotalandAverage1() {
		int marks[][] = new int[][] { { 86, 98, 84, 46, 76, 0, 0 }, { 98, 82, 71, 64, 64, 0, 0 },
				{ 77, 97, 86, 60, 59, 0, 0 }, { 38, 93, 40, 83, 91, 0, 0 }, { 89, 77, 90, 60, 50, 0, 0 }, };// 5 rows 7
																											// col
		int rowIndex, colIndex, sum = 0;
		for (rowIndex = 0; rowIndex < 5; rowIndex++) {
			for (colIndex = 0; colIndex < 5; colIndex++) {

				sum += marks[rowIndex][colIndex];
			}
			marks[rowIndex][5] = sum;
			marks[rowIndex][6] = sum / 5;
			sum = 0;
		}
		// Display the marks,total,Average
		int subjectNo = 1;
		for (subjectNo = 1; subjectNo <= 5; subjectNo++)
			System.out.print("SUB" + (subjectNo) + "-");
		System.out.print("TOTAL -");
		System.out.println("AVG -");
		System.out.println("----------------------------------------");
		//using String method
		String output=" ";
		for (rowIndex = 0; rowIndex < 5; rowIndex++) {
			for (colIndex = 0; colIndex < 7; colIndex++) {
				int mark=marks[rowIndex][colIndex];
				if (mark<100) 
					output=String.format("0%d -", mark);
				else
					output=String.format("%d - ", mark);
				System.out.print(output);
			}
			System.out.println();
		}
		//System.out.println("---------------------------------------------------------");
	}

}
