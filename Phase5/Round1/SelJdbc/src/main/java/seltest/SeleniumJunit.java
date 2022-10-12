package seltest;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJunit {
static WebDriver wd=null;
@Before
public void init() {
	System.setProperty("webdriver.chrome.driver","C:\\\\95\\\\chromedriver.exe");
	 wd=new ChromeDriver();
	//maximize the screen
	wd.manage().window().maximize();
	wd.get("http://localhost:8080/SelJdbc/index.jsp");
}

public static String selCode(String value) {
	System.out.println(value);
	wd.findElement(By.name("user")).sendKeys(value);
	wd.findElement(By.name("submit")).submit();
	return wd.findElement(By.name("h1")).getText();
}
	
	
	@Test
	public void test1() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the user name ");
//		String name=sc.next();
		String actualres=selCode("reshma");
		String expectedres="data inserted successfully..";
		assertEquals(expectedres, actualres);
		wd.close();
	}
	@Test
	public void test2() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the user name ");
//		String name=sc.next();
		String actualres=selCode("degi");
		String expectedres="data inserted successfully..";
		assertEquals(expectedres, actualres);
		wd.close();
	}
}

