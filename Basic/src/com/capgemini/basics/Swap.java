package com.capgemini.basics;

public class Swap {

	public static long change(int number1, int number2) {
		number1 = number1+number2;
		number2 = number1-number2;
		number1 = number1-number2;
		
		return number1;
	
	}

}
