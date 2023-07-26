package TestNG.Dataprovider;

import org.testng.annotations.DataProvider;

public class Dp {
	
	@DataProvider(name="DP1")
	
	public Object[][] getdata1()
	{
		Object [][] data = {
				{"sharukh","Shah@123"},
				{"Salman","sllu@123"}	
				};
		return data;
		}
		
		
		
		
	
	

}
