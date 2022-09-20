package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
			
			// printTriangleC();	
				evenNumbers();
	}		
			public static void printNumbersOneToHundred() {
				int count=0;
				for(count=0;count<=100;count++) {
					System.out.print(count+" ");				
			      }
			}
			public static void incrementopt() {
				int X=1;
				System.out.println(X);
				System.out.println(++X);
				System.out.println(--X);
			}
			
			public static void printNumbersOneToTenA() {
				int countA=0;
				for(countA=1;countA<=3;countA++)
				{
				for(int count=11;count<=20;count++)
					{
					System.out.println(count +" ");
					}
				
			System.out.println();
			}}
			
			public static void printTriangleR() {
				for(int countA=4;countA>=1;countA--)
				{
				for(int countB=1;countB<=countA;countB++)
					{
					System.out.print(countB+"");
					}
			    System.out.println();
		      	}
			}
			public static void printTriangleB() {
				int countA=0;
				for(countA=1;countA<=10;countA++)
				{
				for(int countI=1;countI<countA;countI++)
					{
					System.out.print(".");
					}
				for(int countJ=countA;countJ>=1;countJ--)
					{
						System.out.print(countJ);
					}
			    System.out.println();
		      	}
			}
			public static void printMatrix() {
				int countA=0;
				for(countA=1;countA<=10;countA++)
				{
				for(int count=1;count<=1;count++)
					{
					System.out.print(count+"");
					}
			    System.out.println();
		      	}
			}
			public static void printTriangleC() {
				int countA=0;
				for(countA=1;countA<=10;countA++)
				{
				for(int countI=10;countI>countA;countI--)
					{
					System.out.print(".");
					}
				for(int countJ=countA;countJ>=1;countJ--)
					{
						System.out.print(countJ);
					}
			    System.out.println();
		      	}
			}
			
			public static void printTriangleI() {
				int countA=0;
				for(countA=4;countA>=1;countA--)
				{
				for(int count=1;count<=countA;count++)
					{
					System.out.print(".");
					}
				for(int i=countA;i>=1;i--) {
					System.out.print(i);
				}
			    System.out.println();
		      	}
			}
			public static void printTriangleW() {
				
				int countA=0;
				for(countA=5;countA>=1;countA--)
				{
				for(int countJ=1;countJ<countA;countJ--) {
						 System.out.print(".");
						}
				for(int countI=countA;countI>1;countI++)
					{
					System.out.print(countI);
					}
				
			    System.out.println();
		      	}
			
			}
			public static void evenNumbers() {
				System.out.println("EVEN NUMBERS BETWEEN 1-100:");
				for(int count=1;count<=100;count++) {
					int num=count%2; //for odd num==1
					if(num==0)
					{
						System.out.println(count);
					}
				}
				
			}

}
