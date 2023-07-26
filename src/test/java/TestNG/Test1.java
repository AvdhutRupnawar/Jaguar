package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void verifyUrl()
	{
		AssertJUnit.fail();
		System.out.println("Verify URL...");
	}
	
	@Test
	public void verifyTitle()
	{
		System.out.println("Verify Title....");
	}
}
