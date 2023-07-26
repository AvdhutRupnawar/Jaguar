package TestNG.Dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	
	
	@Test(dataProvider="DP")
	public void verifyLogin(Map<String,String> map)
	{
		System.out.println(map.get("username") + " : " + map.get("password"));
	}
	
	@DataProvider(name = "DP")
	public Object [] getData()
	{
		Object [] data = new Object [3];
		
		Map <String ,String > m1 = new HashMap<>();
		m1.put("username","Modi");
		m1.put("password", "Modi@123");
		data[0]= m1;
		
		Map<String,String > m2 = new HashMap<>();
		m2.put("username", "Amit");
		m2.put("password","Shah@123");
		data[1] = m2;
		
		Map<String,String > m3 = new HashMap<>();
		m3.put("username", "ram");
		m3.put("password","ram@123");
		data[2]=m3;
		
		return data;
	
}
}
