package com.revature.eval.java.basictesting;

//import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

public class Basics {
//
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		System.out.println("newbasictest");
		int x = 2 + 3;
		Assert.assertTrue(x < 10);
	}

	@Test
	public void test2() {
		System.out.println("newbasictest2");
		int x = 2 + 3;
		Assert.assertFalse(x > 10);
	}

	@Test
	public void test3() {
		System.out.println("newbasictest3");
		String input = "hello";
		Assert.assertEquals(input, "hello");
	}

	@After
	public   void tearDownAfterClass() throws Exception {
	}

	@AfterClass
	public static void tearDown() throws Exception {
	}

}
