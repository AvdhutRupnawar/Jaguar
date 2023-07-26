package TestNG;

import org.testng.annotations.Test;


public class TestDemo2 {
	
	@Test(priority=2)
	public void verifyLoggin()
	{
		System.out.println("Verify loggin...! ");
	}
	
	@Test(priority=1)
	public void verifyReg()
	{
		System.out.println("Verity Reg...!");
		
	}
	@Test(priority=3)
	public void verifyLogout()
	{
		System.out.println("Verify Logout...!");
	}
	

}
