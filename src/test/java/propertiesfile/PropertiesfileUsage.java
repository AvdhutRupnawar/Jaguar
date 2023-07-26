package propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesfileUsage {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		
		String fileName = System.getProperty("user.dir")+ "/src/test/java/propertiesfile/config.properties";
		   Properties prop = new Properties();
		   FileInputStream fis= new FileInputStream(fileName);
		   	prop.load(fis);
		   	
		   	String browser = prop.getProperty("browser");
		   	if(browser.equalsIgnoreCase("Chrome"))
		   	{
		   			driver = new ChromeDriver();
		   			
		   	}
		   	if(browser.equalsIgnoreCase("EDGE"))
		   	{
		   		driver= new EdgeDriver();
		   		
		   	}
		
		   	if(browser.equalsIgnoreCase("Firfox"))
		   	{
		   		driver = new FirefoxDriver();
		   		
		   	}
		
		   	String url = prop.getProperty("url");
		   			driver.get(url);
		   	
		   	String Max= prop.getProperty("maximizeWindow");
		   	if(Max.equalsIgnoreCase("true"))
		   	{
		   		driver.manage().window().maximize();
		   	}
		   String timeout = prop.getProperty("timeout");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeout)));
		 
	}

}
