package com.capgemini.basics;

public class GreatestNumber {

	public static Object findLargeNumber(double number1, double number2, double number3) {
		
		return (number1>number2&&number1>number3)?number1:(number2>number3)?number2:number3;
		
	}

}
