package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
//
//public class DataProvider {
//
//	@Test(dataProvider = "getData")
//	public void validateLogin(String username,String password) {
//		System.out.println("Validating Login page..!");
//		System.out.println("UserName : " + username + "Password : " + password);
//
//	}
//
//	@dataProvider
//	public Object[][] getData()
//	{
//		Object[][] data = new Object[4][2];
//
//		// first data set /row
//		data[0][0] = "Virat";
//		data[0][1] = "Kohli";
//
//		// Second data set
//		data[1][0] = "Rohit";
//		data[1][0] = "sharma";
//
//		// third data set
//		data[2][0] = "Shardul ";
//		data[2][1] = "Thakur ";
//
//		//fourth data set 
//		data [3][0] = "KL";
//		data [3][1] = "Rahul";
//		
//		return data ;
//		
//
//	}
//
//}
public class DataProvider {

	@Test(dataProvider="getData")
	public void validateLogin(String username, String password)
	{
		System.out.println("Validating Login page..");
		System.out.println("username: " + username + " password: " + password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[4][2];
		// first data set / row
		data[0][0] = "Virat";
		data[0][1] = "Virat@123";
		// second data set / row
		data[1][0] = "Rohit";
		data[1][1] = "Rohit@456";
		// Third data set / row
		data[2][0] = "Gill";
		data[2][1] = "Gill@789";
		// Fourth data set / row
		data[3][0] = "Rahul";
		data[3][1] = "Rahul@101112";
		
		return data;
	}
}
