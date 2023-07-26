package Practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {
 static WebDriver driver;
	private static By fn = By.xpath("(//input[@type='text'])[1]");
	private static By ln = By.xpath("(//input[@type='text'])[2]");
	private static By email = By.xpath("(//input[@type='text'])[3]");
	private static By reEmail = By.xpath("(//div[3]//input[@type='text'])[1]");
	private static By pwd = By.xpath("//input[@id='password_step_input']");
	private static By day = By.xpath("//select[@id='day']");
	private static By month = By.xpath("//select[@id='month']");
	private static By year = By.xpath("//select[@id='year']");
	
	
	private static WebElement getWebElement(By by) {
		return driver.findElement(by);
	}

	private static void type(By by, String value) {
		getWebElement(by).sendKeys(value);
	}
	
	
	

	public static void main(String[] args) throws IOException {
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='_6ltg'][2]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		
		 By fn = By.xpath("(//input[@type='text'])[1]");
		 By ln = By.xpath("(//input[@type='text'])[2]");
		 By email = By.xpath("(//input[@type='text'])[3]");
		 By reEmail = By.xpath("(//div[3]//input[@type='text'])[1]");
		 By pwd = By.xpath("//input[@id='password_step_input']");
		 By day = By.xpath("//select[@id='day']");
		 By month = By.xpath("//select[@id='month']");
		 By year = By.xpath("//select[@id='year']");
		
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(fn));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(ln));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(reEmail));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		ele =wait.until(ExpectedConditions.presenceOfElementLocated(day));
		ele =wait.until(ExpectedConditions.presenceOfElementLocated(month));
		ele =wait.until(ExpectedConditions.presenceOfElementLocated(year));
	
		
		type(fn, "Vicky");
		type(ln, "Shinde");
		type(email, "VickyShide123@gamil.com");
		type(reEmail, "VickyShide123@gamil.com");
		type(pwd, "Vicky@123");
		type(day, "15");
		type(month, "June");
		type(year, "1999");
		
		
		
		getWebElement(By.xpath("(//input[@type='radio'])[2]")).click();
		WebElement dd = getWebElement(By.name("preferred_pronoun"));
		Select selectBirth = new Select(dd );
		selectBirth.selectByIndex(2);
		
		getWebElement(By.xpath("(//button[@type='submit'])[2]")).click();


		
		
		
	}
		
	}


