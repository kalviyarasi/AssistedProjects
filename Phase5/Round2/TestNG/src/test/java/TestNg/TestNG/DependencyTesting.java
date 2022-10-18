package TestNg.TestNG;

import org.testng.annotations.Test;

public class DependencyTesting {
  String trackID=null;
@Test(priority = 1)
	public void createId() {
	int a=50/0;
		System.out.println("creation of ID");
		trackID="abcd";
	}
	@Test(priority = 2,dependsOnMethods = {"createId"})  //dependsOnMethods is to skip the test methods, if createId method is failed 
	public void trackShipping() {
		if(trackID!=null) {
			System.out.println("shipping is in progress");
		}
		else {
			System.out.println("shipping is failed");
		}
	}
	@Test(priority = 3,dependsOnMethods = {"createId"})
	public void cancelShipping() {
		if(trackID!=null) {
			System.out.println("cancelshipping is in progress");
		}
		else {
			System.out.println("cancelshipping is failed");
		}
	}

}

