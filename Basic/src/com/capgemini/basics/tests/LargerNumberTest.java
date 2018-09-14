package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.GreatestNumber;

class LargerNumberTest {

	@Test
	void test() {
		assertEquals(15.0,GreatestNumber.findLargeNumber(2,12,15));
		assertEquals(12.0,GreatestNumber.findLargeNumber(2,12,-15));
		assertEquals(15.23,GreatestNumber.findLargeNumber(2,12,15.23));
	}

}
