package sikuliProject;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

//add jar files of selenium
public class Sikuli {
	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//maximize the screen
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		Screen sc=new Screen();
		Pattern p1=new Pattern("C:\\Users\\Kalviyarasi\\Pictures\\image1.PNG");
		sc.type(p1,"simplilearn");
		Pattern p2=new Pattern("C:\\Users\\Kalviyarasi\\Pictures\\image2.PNG");
		sc.click(p2);	
	}

}
