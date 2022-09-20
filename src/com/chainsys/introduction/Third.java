package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data type
		//signed type
      byte b1=-128;//range (-128 to 127)
      System.out.println("b1="+b1); 
      short s1=-32768 ;//2^16/2
      System.out.println("s1="+s1);
      short s2=32767 ;//2^16/2
      System.out.println("s2="+s2);
      int i1=-2147483648;//2^32/2
      System.out.println("i1="+i1);
      int i2=2147483647;//2^32/2
      System.out.println("i2="+i2);
      long l1=-9223372036854775808L;//2^64/2
      System.out.println("l1="+l1);
      long l2=9223372036854775807L;//2^64/2
      System.out.println("l1="+l2);
      float f1=2147483648.11111F;//2^128/2
      System.out.println("f1="+f1);
      float f2=2147483648.5432F;//2^64/2 
//      double range is infinity
      System.out.println("f2="+f2);
      char c1='a';
      System.out.println("c1="+c1);
      char c2='A';
      System.out.println("c2="+c2);
      int asciiValueofc1=(int)c1;
      System.out.println("asciivalueofc1:"+asciiValueofc1);
      char c3= (char)89;
      System.out.println(c3);
      boolean flag=true;
      System.out.println(flag);
      
	}

}
