package sikuliProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Task {
public static void main(String[] args) throws FindFailed {
	//register the chrome driver
			System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			//maximize the screen
			wd.manage().window().maximize();
			wd.get("https://www.ilovepdf.com/word_to_pdf");
			Screen sc=new Screen();
			Pattern p1=new Pattern("C:\\Users\\Kalviyarasi\\Pictures\\img1.PNG");
			sc.click(p1);
			Pattern p2=new Pattern("C:\\Users\\Kalviyarasi\\Pictures\\img2.PNG");
			sc.click(p2);
			Pattern p3=new Pattern("C:\\Users\\Kalviyarasi\\Pictures\\img3.PNG");
			sc.click(p3);
			Pattern p4=new Pattern("C:\\Users\\Kalviyarasi\\Pictures\\img4.PNG");
			sc.click(p4);
}
}
