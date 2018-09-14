package com.capgemini.basics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
	
	public static Object display(String string) {
	
	GregorianCalendar date = new GregorianCalendar(); 
	int day = date.get(Calendar.DAY_OF_MONTH);
	int month = date.get(Calendar.MONTH);

	int year = date.get(Calendar.YEAR); 

	int second = date.get(Calendar.SECOND); 

	int minute = date.get(Calendar.MINUTE);

	int hour = date.get(Calendar.HOUR);

	
		
//	System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
//	
//
//	System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
	return +day+"/"+(month+1)+"/"+year;

}
}
