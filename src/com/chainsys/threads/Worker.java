package com.chainsys.threads;

public class Worker {
//	global Variable
	public int amount=0;
	public synchronized void callme() //to a make method  synchronized use synchronized keyword
	{
		long currentthreadid = Thread.currentThread().getId();
		System.out.println("Inside Callme thread ID " + currentthreadid);
//		local Variable
		// int amount=0;
		try {
			for (int i = 0; i < 5; i++) {
				amount += i;
				System.out.println(currentthreadid + "  " + amount);
//			Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
