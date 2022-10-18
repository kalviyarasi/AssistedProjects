package com.example;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTest {
	WebDriver wd;
@BeforeTest
public void config() {
	WebDriverManager.chromedriver().setup();
	wd=new ChromeDriver();
	wd.manage().window().maximize();
	
}

@AfterTest
public void quitbrowser() {
	wd.quit();
}
	
	
  @Test
  public void test1() {
  wd.get("https://www.google.com/?gws_rd=ssl");
  String title=wd.getTitle();
  String url=wd.getCurrentUrl();
  assertEquals("Google",title,"title not matched");
  assertEquals("https://www.google.com/?gws_rd=ssl",url,"url not matched");
  }
  
  @Test
  public void test2() {
	  wd.get("https://www.amazon.in/");
  }
}


