package com.chainsys.introduction;

public class Test {

	public static void main(String[] args) {
		//calling method
		rombus();
	}

	public static void rombus() {
		for(int row=1;row<=5;row++) {
			for(int colA=5;colA>row;colA--){
				System.out.print(" ");
			}
			for(int colB=row;colB>0;colB--)
			{
				System.out.print(colB);
			}
			for(int colC=2;colC<=row;colC++) {
				System.out.print(colC);
			}
			
			System.out.println();
		}
		for(int row=4;row>0;row--) {
			for(int colD=row;colD<=4;colD++) {
				System.out.print(" ");
			}
			for(int colE=row;colE>0;colE--) {
				System.out.print(colE);
			}
			for(int colF=2;colF<=row;colF++) {
				System.out.print(colF);
			}
			System.out.println();
		}
	}
}