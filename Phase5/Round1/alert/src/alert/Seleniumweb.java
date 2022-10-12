package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumweb {
	public static void main(String[] args) throws InterruptedException {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//maximize the screen
		wd.manage().window().maximize();
		wd.get("file:///C://demo.html");
		WebElement we1=wd.findElement(By.xpath("/html/body/form/input"));
		we1.submit();
		Alert alert=wd.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
			
	
	
	}

}






