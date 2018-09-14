package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Swap;

class SwapTest {

	@Test
	void test() {
		assertEquals(5,Swap.change(4,5));
	}

}
