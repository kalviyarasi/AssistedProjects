package TestNg.TestNG;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 1)
  public void signup() {
	  System.out.println("test for user registration");
  }
  @Test(priority = 2)
  public void signin() {
  System.out.println("test for login ");
  }
  @Test(priority = 3)
  public void search() {
System.out.println("test for search a flight");
  }

  @Test(priority = 4)
  public void book() {
  System.out.println("test for book a ticket");
  }
  @Test(priority = 5)
  public void save() {
  System.out.println("test for save a ticket");
  }
  @Test(priority = 6)
  public void pay() {
 System.out.println("test for pay a ticket");
  }
  @Test(priority = 7)
  public void logout() {
  System.out.println("test for logout");
  }

}

