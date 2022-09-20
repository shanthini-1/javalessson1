package com.chainsys.threads;

public class CurrentTH {

	public static void main(String args[]) {
		try {
			Thread t1 = Thread.currentThread();
			System.out.println("Th ID: " + t1.getId());
			System.out.println("Th State: " + t1.getState());
			System.out.println("Th Priority: " + t1.getPriority());
			System.out.println("Th ISAlive: " + t1.isAlive());
			System.out.println("Th Max Priority: " + Thread.MAX_PRIORITY);
			System.out.println("Th Min priority: " + Thread.MIN_PRIORITY);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
// A Thread that is STOPPED can not be restarted . isAlive will be false
//Thread are created, managed,executed,and Stopped by OS
//Actual control of the thread is in the CPU (OS)
//if the CPU/core is only one means At that more than thread is there 
//to run means the CPU give access to high priority thread if no priority means than random thread is run.