package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo3 {
	
	@Test(priority =1)
	public void reg(){
		System.out.println("User registered...!");
	//	Assert.fail("Intentonally Failing: REG..");
	}
	@Test(priority =2, dependsOnMethods = {"reg"})
	public void login()
	{

		System.out.println("User logged in...");
		Assert.fail("Intentionally failing: LOGIN");	
		}
	
		@Test (priority=3, dependsOnMethods = {"login","reg"})
		public void logout()
		{
			System.out.println("user logged out...");
		
		}
}

