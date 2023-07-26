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

public class FileReadingUsingMethod {
	static WebDriver driver = null;

	private static Properties readProperties(String FileName, Properties prop) throws IOException

	{

		prop = new Properties();
		FileInputStream fis = new FileInputStream(FileName);

		prop.load(fis);
		return prop;

	}

	private static void openUrl(WebDriver driver, Properties prop) {
		String url = prop.getProperty("url");
		driver.get(url);
	}

	private static WebDriver launchBrowser(WebDriver driver, Properties prop) {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chroMe")) {
			driver = new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("EDge")) {
			driver = new EdgeDriver();
		}
		if (browser.equalsIgnoreCase("FirefoxDriver")) {
			driver = new FirefoxDriver();
		}
		return driver;

	}

	static void setMaximize(WebDriver driver, Properties prop) {
		String max = prop.getProperty("maximizeWindow");
		if (max.equalsIgnoreCase("true")) {
			driver.manage().window().maximize();
		}

	}

	static void timeOut(WebDriver driver, Properties prop) {
		String timeout = prop.getProperty("timeout");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeout)));
	}

	static WebElement getWebElement(By by, WebDriver driver) {
		return driver.findElement(by);

	}

	static void type(By by,String key,WebDriver driver ,Properties prop)
	{
		getWebElement(by,driver).sendKeys(prop.getProperty(key));
	}
	static void click(By by,WebDriver driver)

	{
		getWebElement(by,driver).click();
	}

	private static String getactualUrl(WebDriver driver)
	{
		String actualUrl = driver.getCurrentUrl();
		return actualUrl;
	}private static void verifyUrls(String expUrl,WebDriver driver)
	{
		if(expUrl.equals(getactualUrl(driver)))
		
			System.out.println(" Login successfully ");
		else
			System.out.println("Login Unsuccessfull ");
		
	}
	
	

	public static void main(String[] args) throws IOException {

		Properties prop = null;
		String FileName = System.getProperty("user.dir") + "/src/test/java/propertiesfile/config.properties";

		prop = readProperties(FileName, prop);
		String expUrl = "http://127.0.0.1/user/submit_tt.do";

		driver = launchBrowser(driver, prop);

		openUrl(driver, prop);

		setMaximize(driver, prop);
		timeOut(driver, prop);
		type(By.name("username"),"username",driver,prop);
		type(By.name("pwd"),"password",driver,prop);
		click(By.id("loginButton"),driver);
		
		verifyUrls(expUrl,driver);
		
		

		  driver.quit();

	}

}
