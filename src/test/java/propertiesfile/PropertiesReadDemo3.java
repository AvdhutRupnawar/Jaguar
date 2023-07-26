package propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesReadDemo3 {
	WebDriver driver = null;

	private static Properties readProperties(String FileName,Properties prop) throws IOException
	{
		  prop = new Properties();
		FileInputStream fis = new FileInputStream(FileName);
		
		prop.load(fis);
		return prop;
	}
	

	private static WebDriver LaunchBrowser(WebDriver driver, String browser) {
		String browser;
		switch(browser.toUpperCase())
		{
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Invalid browser : " + browser);
		}
		return driver;
	}
	
	
	private static void maxWindow (WebDriver driver,Properties prop) {
		String max = prop.getProperty("maximizeWindow");
		if(max.equals("true"))
		{
			driver.manage().window().maximize();
		}
	}
	
	 static void  timeOut(WebDriver driver,Properties prop)
	{
		String timeout = prop.getProperty("timeout");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeout)));
	}
	
	
	private static String OpenUrl(WebDriver driver,Properties prop) {
		String Url = prop.getProperty("url");
		return Url;
	}
	
	 static WebElement getWebElement(By by ,WebDriver driver) 
	 {
		return  driver.findElement(by);
	 }
	 static void type (By by,String key ,WebDriver driver,Properties prop)
	 {
		 getWebElement(by,driver).sendKeys(prop.getProperty(key));
		
	 }
	 
	private static String getActualUrl(WebDriver driver)
	 {
		String actualUrl= driver.getCurrentUrl();
		 return actualUrl;
	 }
	private static void verifyUrls(String expUrl,WebDriver driver)
	 {
		 if(expUrl.equals(getActualUrl(driver)))
		 
				System.out.println(" Login successfully ");
			else
				System.out.println("Login Unsuccessfull ");
		 
	 }
	
	
	
	
	public static void main(String[] args) throws IOException {

	Properties prop=null;
		WebDriver driver = null;
		
		String expUrl = "http://127.0.0.1/user/submit_tt.do";
		String FileName= System.getProperty("user.dir")+ "/src/test/java/propertiesfile/config.properties";
		
		prop = readProperties(FileName,prop);
		
		driver = LaunchBrowser(driver,browser);
		OpenUrl(driver,prop);
		maxWindow(driver,prop);
		timeOut(driver,prop);
		type(By.name("username"),"username",driver,prop);
		type(By.name("pwd"),"password",driver,prop);
		verifyUrls( expUrl, driver);
		
		
		
	}

}
