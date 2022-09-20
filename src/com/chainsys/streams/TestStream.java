package com.chainsys.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestStream{
   public static void main(String[] args) throws Exception{
      BufferedReader br=new BufferedReader(new
         InputStreamReader(System.in));
      System.out.println("Enter your name: ");
      String name=br.readLine();
      if(name.length()<=0)
         System.err.println("Name cannot be empty");
      else
         System.out.println("Hi! "+name);
   }
}