package com.chainsys.entrypoint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/***
 * 
 * @author shan3102
 * @version 1.0 date: Mar 3 2022
 * @category classroom lessons purpose:
 */
public class Startup {
/**
 * purpose portable executable entry point for the lessons
 * @param args type String
 * @return void
 */
	public static void main(String [] args) {
//int asc =64;
//
//while(asc <96) {
//	if(((asc < 91)&& (asc > 64)) || (asc==95)){
//		System.out.println((char) asc);
//		if(asc==95)
//			System.out.println((char) asc);
//	}
//	asc++;
//	}
//}
//		
		try {
			checkjob("SA_yhgj");
		} catch (com.chainsys.entrypoint.InvalidInputDataException e) {
			e.printStackTrace();
		}
	}
	public static boolean checkjob(String data) throws InvalidInputDataException {
		// TODO Auto-generated method stub
		boolean result = false;
		int len = data.length();
		for (int index = 0; index < len; index++) {
			int asc = (int) data.toUpperCase().charAt(index);
			
			if (((asc > 64) && (asc < 91)) ||(asc == 95))
					  result = true;
			 	
			 	
			else
				throw new InvalidInputDataException("Enter Alphabets(A-Z) and underscore(_) only");
		}
		return result;

	}
	public static void checker()
	{
		String date ="10/02/1989";
		Date sdate = null;
		try {
		System.out.println(	checkDateFormat(date));
		try {
			 sdate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		
		try {
			CheckNofutureDate(sdate);
		} catch (com.chainsys.entrypoint.InvalidInputDataException e) {
			e.printStackTrace();
		}
	}
	public static boolean checkDateFormat(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		String[] data1 = data.split("/");
		for(int i=0;i<data1.length;i++) 
			System.out.println(data1[i]);
		int date = Integer.parseInt(data1[0]);
		int mon =Integer.parseInt(data1[1]);
		int yrs =Integer.parseInt(data1[2]);
		for (int index = 0; index < len; index++) {
			int asc = (int) data.charAt(index);
			if ((asc < 46)|| (asc > 58) )//|| (asc != 47))  
				throw new InvalidInputDataException("Enter date in correct format ");
		}
		
		//TODO
		//date before 1/1/1985
		
		
		if(yrs>1984 && yrs<=2022){
				if (mon == 1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
					if(date>0 && date<=31)
						result = true;
					else
						throw new InvalidInputDataException("enter valid date");
				else if(mon == 2||mon==4||mon==6||mon==9||mon==11)
					if(date>0 && date<=30)
						result = true;
					else 
						throw new InvalidInputDataException("enter valid date");
			    else 
			    	throw new InvalidInputDataException("enter valid month");
			}
		     else
		    	 throw new InvalidInputDataException("enter valid year");
//		if(date.before(calender.getI);
				
		return result;

	
}
	public static boolean checkStringOnly(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		for (int index = 0; index < len; index++) {
			data.toUpperCase();
			int asc = (int) data.charAt(index);
			if (asc < 91 && asc > 64 || asc == 32) {
				result = true;
			} else
				throw new InvalidInputDataException("Enter Alphabets Only");
		}
		return result;
	}


public static boolean CheckNofutureDate(Date date) throws InvalidInputDataException {
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date dateA = new Date();
	String a = formatter.format(dateA);
	boolean result = false;
if( date.compareTo(dateA)<0 )
	result=true;
else
	throw new InvalidInputDataException("enter valid date");
	return result;
//	String testDate = formatter.format(date);
}
}

//public static void main(String[] args) {
//// TODO Auto-generated method stub
//
//int x=2,y=0;
//int z=x/0;
//System.out.println(z);
//Demo objDemo=new Demo();
//objDemo.connectToAndQueryDatabase("system", "Chennai268$");
//}