package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Date;

class DateTimeTest {

	@Test
	void test() {
		assertEquals("14/9/2018",Date.display("Today date"));
	}

}
