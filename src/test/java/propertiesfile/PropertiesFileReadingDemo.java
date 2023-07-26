package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class PropertiesFileReadingDemo {

	public static void main(String[] args) throws IOException {

		String fileName = System.getProperty("user.dir") + "/src/test/java/propertiesfile/config.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(fileName);
		prop.load(fis);

		String browser = (String) prop.get("browser");
		System.out.println("browser : =" + browser);

		String username = prop.getProperty("username");
		System.out.println("username := " + username);

		String to = (String) prop.get("timeout");
		String city = (String) prop.get("city");
		String age = (String) prop.get("age");
		String wt = (String) prop.get("weight");
		System.out.println("timeout : " + to);
		System.out.println("city    : " + city);
		System.out.println("age     : " + age);
		System.out.println("wt      : " + wt);
		float wt1 =Integer.parseInt(wt) +100;
		System.out.println(wt1);//156.67
		
//		String wt1 = wt+100;
//		System.out.println(wt1); //==> 56.67100
	}

}
