package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstList {
	public static void main(String args[]) {
		List<Integer> nums = new ArrayList<Integer>(); // 1.7
//	List<Integer> listOfnumbers = new ArrayList<Interger>();  //1.5
//	Collection<Object> listOfLists = new ArrayList<Object>(); //1.2
      nums.add(23);
      nums.add(643);
      nums.add(9876);
      nums.add(20);
      System.out.println(nums);
      Iterator<Integer> intIterator=nums.iterator();
      while(intIterator.hasNext())
      {
    	  System.out.println(intIterator.next());
      }
      nums.remove(3);
      nums.add(4, 1234);
      int len = nums.size();
      
    
      Iterator<Integer> intIteratorA=nums.iterator();
      while(intIteratorA.hasNext())
      {
         System.out.println(intIteratorA.next());
      }
      System.out.println("len "+len);
      for(int i=0;i<nums.size();i++) {
//    	  System.out.println(nums.sort());
      }
	}
}
