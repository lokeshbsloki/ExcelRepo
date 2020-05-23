package com.qa.tests;

import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void test1() {
		System.out.println("tes1-A");
	}
	@Test(groups = "lokesh")
	public void test2() {
		System.out.println("test1-B");
	}
	@Test
	public void test3() {
		System.out.println("test1-C");
	}
	@Test
	public void test4() {
		System.out.println("test1-D");
	}
}
