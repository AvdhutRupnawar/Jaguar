package TestNG.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
	
	@Test
	public void verifyHardAssrtion()
	{
		int actualI = 10, expectedJ = 10;
		System.out.println("Begin test ");
		
//		Assert.assertEquals(actualI, expectedJ);
		Assert.assertEquals(actualI, expectedJ, "actual value of i =" + actualI + " is not equal to j = " + expectedJ);
		System.out.println("End test ");
	}
	
	

}
