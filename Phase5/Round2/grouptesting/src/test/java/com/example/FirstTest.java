package com.example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FirstTest {
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("in test1");
	}
	
	@Test(groups = {"smoke","functional"})
	public void test2() {
		System.out.println("in test2");
	}
	
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("in test3");
	}
}


