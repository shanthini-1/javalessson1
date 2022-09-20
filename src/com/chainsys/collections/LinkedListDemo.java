package com.chainsys.collections;
import java.util.*;

 class LinkedListDemo {
	 public static void main(String args[])
	 {
		 LinkedList<String>stringLinkedList=new LinkedList();
		 stringLinkedList.add("F");
		 stringLinkedList.add("B");
		 stringLinkedList.add("D");
		 stringLinkedList.add("E");
		 stringLinkedList.add("C");
		 stringLinkedList.add("F");
		 stringLinkedList.add("B");
		 stringLinkedList.add("D");
		 stringLinkedList.add("C");
		 stringLinkedList.add("E");
		 stringLinkedList.addLast("Z");
		 stringLinkedList.addFirst("A");
		 stringLinkedList.add(1,"A2");
		 Iterator<String>stringIterator=stringLinkedList.iterator();
		 while(stringIterator.hasNext())
		 {
			 System.out.print(stringIterator.next()+" ");
		 }
		 stringLinkedList.remove("F");
		 stringLinkedList.remove();
		 stringIterator=stringLinkedList.iterator();
		 while(stringIterator.hasNext())
		 {
			 System.out.print(stringIterator.next()+" ");
		 }
		 System.out.println();
		 stringLinkedList.removeFirst();
		 stringLinkedList.removeLast();
		 stringIterator=stringLinkedList.iterator();
		 while(stringIterator.hasNext())
		 {
			 System.out.print(stringIterator.next()+" ");
		 }
		 
	
	 }

}
