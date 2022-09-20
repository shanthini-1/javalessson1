package com.chainsys.datelessons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sDate1="31/12/1998";
		Date date1 =null;
		try {
			 date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			System.out.println(sDate1+"\t"+date1);	
		} catch (ParseException e) {
			e.printStackTrace();
		}
			java.sql.Date sqldate = new java.sql.Date(date1.getTime());
			System.out.println(sqldate);
	}

}
