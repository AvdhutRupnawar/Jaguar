package Actitime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateCustomer {
static WebDriver driver;
	static WebDriverWait wait;
	static void launchBrowser()
	{
		String url = "https://demo.actitime.com/login.do";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofMillis(600));
	}

	static WebElement getWebElement(By by)
	{
		return driver.findElement(by);
	}
	
	static void type(By by,String value)
	{
		getWebElement(by).sendKeys(value);
	}
	
	static void clickElement(By by)
	{
		getWebElement(by).click();
	}
	
	
	
	static void click(By by)

	{
		getWebElement(by).click();
	}

	private static void verifyUrl(String expUrl)
	{
	
		if(expUrl.equals(getactualUrl()))
		
			System.out.println(" Login successfully ");
		else
			System.out.println("Login Unsuccessfull ");
		
	}
	
	private static String getactualUrl()
	{
		String actualUrl = driver.getCurrentUrl();
		return actualUrl;
	}
	private static String getText(By by) {
		String text = getWebElement(by).getText();
		return text;
	}
	private static final By Un = By.name("username");
	private static final By Pass = By .name("pwd");
	private static final By customerName = By.xpath("(//input[@placeholder='Enter Customer Name'])[2]");
	

	
	public static void main(String[] args) {
		
		launchBrowser();
		
		type(Un,"admin");
		type(Pass, "manager");
		click(By.id("loginButton"));
		getactualUrl();
		verifyUrl("https://demo.actitime.com/user/submit_tt.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//*[@id=\"container_tasks\"]")).click();
		
		click(By.className("addNewButton"));
		click(By.xpath("//div[@style='display: block;'][@class='item createNewCustomer']"));
		type(customerName,"Abcd123");
		click(By.xpath("components_button_label"));
		getText(By.xpath("/html/body/div[13]/div/div/span[1]"));
		
	
		
		
		
		
		
	}

}
