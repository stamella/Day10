package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Addition;

class AddProgramTest {

	@Test
	void test() {
		assertEquals(3.0,Addition.add(2,1));
		assertEquals(-3.0,Addition.add(-2,-1));
		assertEquals(3.3,Addition.add(2.1,1.2));;
	}

}
