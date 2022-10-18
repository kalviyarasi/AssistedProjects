package com.example;

import org.testng.annotations.Test;

public class NewTest {
	@Test(groups = {"sanity"})
	public void test4() {
		System.out.println("in test 4");
	}
	
	@Test(groups = {"functional","regression"})
	public void test5() {
		System.out.println("in test5");
	}
	@Test(groups = {"sanity","smoke"})
	public void test6() {
		System.out.println("in test 6");
	}
}
