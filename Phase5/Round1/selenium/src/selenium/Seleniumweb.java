package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumweb {
	public static void main(String[] args) {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
		//creating an object for chrome driver
		WebDriver wd=new ChromeDriver();
		System.out.println(wd);
		 //maximize the screen
		wd.manage().window().maximize();
		
		// to get any website
//		wd.get("https://www.amazon.in/");
//		System.out.println(wd.getCurrentUrl()); //prints the url of website in console
//		System.out.println(wd.getTitle()); //prints the title of website in console
//		wd.close(); //automatically close the website window
		
		//automatically send data to the amazon website
//		wd.findElement(By.linkText("Start here.")).click();
//		wd.findElement(By.id("ap_customer_name")).sendKeys("swetha");
//		wd.findElement(By.id("ap_phone_number")).sendKeys("1234554321");
		
		//using localhost
//		wd.get("http://localhost:8080/");
//		wd.findElement(By.id("name")).sendKeys("Lakshmimlak");
//		wd.findElement(By.id("password-field")).sendKeys("Lakshmi@123");
//		wd.findElement(By.id("mail")).sendKeys("Lakishmi@c.com");
//		wd.findElement(By.xpath("/html/body/section/div/div[2]/div/div/form/div[4]/button")).click();
		
		
		wd.get("https://www.google.com/");
		WebElement r=wd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		r.sendKeys("simplilearn");		
		r.sendKeys(Keys.ENTER);	
		
//		r.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/div/span[2]")).click();
//		r.findElement(By.className("sVXRqc")).click();
		r.findElement(By.linkText("https://www.simplilearn.com/")).click();
	}
	
}
