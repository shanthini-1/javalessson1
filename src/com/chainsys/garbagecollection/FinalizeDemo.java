package com.chainsys.garbagecollection;

public class FinalizeDemo
{
	public static void main(String args[])throws Exception
	{
		Calculator c1=new Calculator();
		c1.add(100,50);
		c1=null;
		Calculator c2=new Calculator();
		Calculator c3=new Calculator();
		//Creating an object for Runtime
		// It is not possible to create an object directly for runtime like
		//Runtime firstR = new Runtime();
		//the default constructor for runtime is private here.
		//so we use a static method getRuntime() of the runtime class to create
		//an object for Runtime
		Runtime rt=Runtime.getRuntime();//factory method
	     rt.gc();//runtime garbage collector
	     c2=null;
	     c2.div(2, 45)	;
	     c3=null;
	     rt.gc();

		System.in.read();
	}
}
