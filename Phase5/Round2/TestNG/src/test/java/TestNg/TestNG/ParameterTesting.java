package TestNg.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTesting {
	WebDriver wd;
	@Parameters("browser")
@BeforeTest
public void config(String browser) {
	switch(browser) {
	case "chrome":WebDriverManager.chromedriver().setup();
	wd=new ChromeDriver();
	break;
	case "edge":WebDriverManager.edgedriver().setup();
	wd=new EdgeDriver();
	break;
	
	}
	wd.manage().window().maximize();
	
	
}

@AfterTest
public void quitbrowser() {
	wd.quit();
}
	
	//"https://www.google.com/?gws_rd=ssl"
@Parameters("url1")
  @Test
  public void test1(String url1) {
  wd.get(url1);
  }
  
 //"https://www.amazon.in/"
@Parameters("url2")
  @Test
  public void test2(String url2) {
	  wd.get(url2);
  }
}



//
//public class FirstTest {
//	WebDriver wd;
//@BeforeTest
//public void config() {
//	WebDriverManager.chromedriver().setup();
//	wd=new ChromeDriver();
//	wd.manage().window().maximize();
//	
//}
//
//@AfterTest
//public void quitbrowser() {
//	wd.quit();
//}
//	
//	
//  @Test
//  public void test1() {
//  wd.get("https://www.google.com/?gws_rd=ssl");
//  
//  //When we have an assertion failure the flow gets terminated at that point in the test method.
////  String title=wd.getTitle();
////  String url=wd.getCurrentUrl();
////  assertEquals("Googl",title,"title not matched");
////  assertEquals("https://www.google.com/?gws_rd=ssl",url,"url not matched");
//
//  SoftAssert sa=new SoftAssert();
//  String title=wd.getTitle();
//  String url=wd.getCurrentUrl();
//  sa.assertEquals("Googl",title,"title not matched");
//  System.out.println("after google test");
//  sa.assertEquals("https://www.google.com/?gws_rd=ssl",url,"url not matched");
// sa.assertAll(); //if you don't include this ,even test case is failed,it will not be displayed
//
//  }
//  
//  @Test
//  public void test2() {
//	  wd.get("https://www.amazon.in/");
//  }
//}

