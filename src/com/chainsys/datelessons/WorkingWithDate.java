package com.chainsys.datelessons;
/**
 * @author shan3102
 * created on : 28 mar 2022
 * 
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class WorkingWithDate {
 public static void displayCurrentDate()
 {
	Calendar vCalendar = Calendar.getInstance();
	Date date = vCalendar.getLoc();
	System.out.println(date);
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	System.out.println(dateFormat.format(date));
 }
 public static void displayDOB() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter your date of birth:(yyyy-MM-dd) ");
	 String dob = scanner.nextLine();
	 scanner.close();
	 int year = Integer.parseInt(dob.substring(0,4));
	 int month = Integer.parseInt(dob.substring(5,7))-1;
	 int day = Integer.parseInt(dob.substring(8,10));
	 System.out.println(year+"-"+month+"-"+day);
	 
	 Calendar date = new GregorianCalendar(year,month,day);
	 Date dob1 = date.getTime();
	 SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MMM-dd");
	 System.out.println("DOB "+f1.format(dob1));
	 //retirement date
	 date.add(Calendar.YEAR,60);
	 date.add(Calendar.MONTH,1);
	 date.add(Calendar.DAY_OF_MONTH,1);
	 date.add(Calendar.DATE,-1);
	 System.out.println("retirement date: "+f1.format(date.getTime()));
	 
 }
}
