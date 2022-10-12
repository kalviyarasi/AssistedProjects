package seltest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seljdbc.DbUtil;

public class SelTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register the chrome driver
				
		//Front end -Selenium
				System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
				WebDriver wd=new ChromeDriver();
				//maximize the screen
				wd.manage().window().maximize();
				wd.get("http://localhost:8080/SelJdbc/index.jsp");
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the user name ");
				String name=sc.next();
				wd.findElement(By.name("user")).sendKeys(name);
				wd.findElement(By.name("submit")).submit();
				String actualres=wd.findElement(By.name("h1")).getText();
				String expectedres="data inserted successfully..";
				
				//backend 
				String sql="select * from User";
				Connection con=DbUtil.dBConn();
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				String actualvalue="";
				while(rs.next()) {
					actualvalue=rs.getString(1);
					
				}
				
				//Model -1 testing with conditional statement
				
//				if((actualres.equals(expectedres))&&(name.equals(actualvalue))){
//					System.out.println("the test case is passed");
//				}
//				else {
//					System.out.println("testcase is failed");
//				}

				
				
				
	}

}
