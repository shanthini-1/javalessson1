package com.chainsys.unittest;

import com.chainsys.interfaces.ICalculator;
import com.chainsys.interfaces.Calculator;

public class TestInterfaceCalculator {
	public static void main(String args[]) {
		ICalculator c1= new Calculator();
		int output= c1.add(8, 4);
		System.out.println(output);
		output = c1.multiply(8, 4);
		System.out.println(output);
		output = c1.divide(8, 4);
		System.out.println(output);
	}

}
