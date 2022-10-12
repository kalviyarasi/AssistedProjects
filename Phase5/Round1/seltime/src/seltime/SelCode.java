package seltime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelCode {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
	 WebDriver wd=new ChromeDriver();
	//maximize the screen
	wd.manage().window().maximize();
	wd.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MILLISECONDS);
	wd.get("file:///C:/register.html"); //file is not in sts, workspace it is in local disk c
//	wd.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	WebElement we1= wd.findElement(By.name("sid"));//wd , we , time ,action
	WebElement we2=wd.findElement(By.name("sname"));
	explicit(wd, we1, 200, "1");
	explicit(wd,we2,300,"kalvi");
	
}

public static void explicit(WebDriver wd,WebElement we,int timeout,String value) {
	new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we));
	we.sendKeys(value);
}
}


