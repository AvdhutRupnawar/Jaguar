package TestNG.Dataprovider;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpingAttributesDemo1 {
	
	
	String createName(int maxChars)
	{
	Random rnd = new Random();
	String charSet = "QWERTYUIOPLKJHGFDSAZXCVBNMmnbvcxzasdfghjklopiuytrewq1234567890";
	String fn = "";
	
	for  ( int i= 1; i<maxChars; i++)
	{
		int ind = rnd.nextInt(charSet.length());
		fn = fn+ charSet.charAt(ind);
	}
		
		return fn;
		
	}
	
	
	@Test(invocationCount = 15, enabled = false)
	public void verifyLogin()
	{
		System.out.println("I am running " + createName(5));
	}
	
	@Test(timeOut =1)
	public void verifytimeOut() throws InterruptedException {
		// ThreadTimeoutException , default timeOut value is 0 i.e. Ignore
		Thread.sleep(2000l);
		System.out.println("**********");
	}

	@Test(enabled=false)
	public void test1()
	{
		System.out.println("I am in test1");
		Assert.fail("Intentionally failing..");
	}
	// if there is a defect found for test1 and test2 is dependent on test1, test2 will never be run. But for time being I want to run test2 even if test1 is failing, then use alwaysRun=true, alwaysRun = false
	
	@Test(dependsOnMethods = {"test1"}, alwaysRun=true, enabled=false) //enabled takes precedence over alwaysRun
//	defect#1234 so enabled = false
	public void test2()
	{
		System.out.println("I am in test2");
	}
	
	@Test(expectedExceptions= {RuntimeException.class}, enabled=false)
	public void test3()
	{
		int i = 1;
		System.out.println("test3 is getting executed...");
		if (i==1)
			throw new RuntimeException("Exception occurred !!!");
		System.out.println("test3 is execution over...");
		
	}

}
