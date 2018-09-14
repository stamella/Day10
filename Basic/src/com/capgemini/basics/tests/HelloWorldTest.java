package com.capgemini.basics.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Display;

class HelloWorldTest {

	@Test
	void test() {
		assertEquals("HelloWorld",Display.print("HelloWorld"));
	}

}
