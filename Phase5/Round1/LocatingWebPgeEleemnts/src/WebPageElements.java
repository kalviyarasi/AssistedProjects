import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebPageElements {
	public static void main(String[] args) {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//maximize the screen
		wd.manage().window().maximize();
		
		/***
		//Using ID as a Locator
		wd.findElement(By.id("Email"));
		
		//Using class name as a Locator
		wd.findElement(By.className("classname"));
		
		//Using Name as a Locator
		wd.findElement(By.name("name"));
		
		//Using LinkText as a Locator
		wd.findElement(By.linkText("some link"));
		
		wd.findElement(By.partialLinkText("plink"));
		
		//Using Xpath as a Locator
		//relative xpath
		wd.findElement(By.xpath("//*[@class=’relativexapath’]"));

		//Absolute Xpath
		wd.findElement(By.xpath("html/body/div[1]/div[1]/div/h4[1]/b"));
		
		//Using Xpath as a CSS Selector
		wd.findElement(By.cssSelector("input#email"));

		//Using tag name
		wd.findElement(By.tagName("teg name"));
		**/
		//Frame name or id 
		wd.get("https://www.google.com/");
		wd.switchTo().frame("frame name");
		wd.switchTo().frame("frame id or index");
		
		//Switching between tabs in same browser window
		//Open a new tab using Ctrl + t
		//switch back to the old tab using Ctrl + Tab
//		wd.switchTo().window(tabs2.get(1));
//		wd.switchTo().window(tabs2.get(0));
		

	}
	

}
