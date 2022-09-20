package com.chainsys.reflection;

public class Empo
{
   public int Eno;
   public String Name;
   public Empo()
   {
      System.out.println("Emp Created");
   }
   public void startWork()
   {
      System.out.println("WorkStarted");
	}
	public void pauseWork(int duration)
	{
		System.out.println("pauseWork for "+duration );
	}
}
