package TestNG.Dataprovider;

import org.testng.annotations.Test;

public class ShippingDemo {
	
	@Test(dataProvider = "DP", dataProviderClass = Dp.class)
	public void verifyPayment(String userName) {
		System.out.println(userName);
	}
}
