package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBPRc {
	static WebDriver driver;
	static WebElement dd;
	static WebDriverWait wait;

	public static final By fn = By.xpath("(//input[@type='text'])[1]");
	public static final By ln = By.xpath("(//input[@type='text'])[2]");
	public static final By email = By.xpath("(//input[@type='text'])[3]");
	public static final By reEmail = By.xpath("(//div[3]//input[@type='text'])[1]");
	public static final By pwd = By.xpath("//input[@id='password_step_input']");
	public static final By day = By.xpath("//select[@id='day']");
	public static final By month = By.xpath("//select[@id='month']");
	public static final By year = By.xpath("//select[@id='year']");

	public static final By createNewAcc = By.xpath("//a[@class='_97w5']");
	public static final By selectGender = By.xpath("(//input[@name='sex'])[3]");
	public static final By clickCustom = By.xpath("(//input[@name='sex'])[3]");
	public static final By clickSubmit = By.xpath("//div[11]//button");

	private static void inputs() {
		type(fn, "Vikas");
		type(ln, "shinde");
		type(email, "vicky134@gmail.com");
		type(reEmail, "vicky134@gmail.com");
		type(pwd, "vicky@gmail");
		type(day, "12");
		type(month, "June");
		type(year, "1999");
	}

	private static WebElement getWebElement(By by) {
		return driver.findElement(by);
	}

	private static void type(By by, String value) {
		getWebElement(by).sendKeys(value);
	}

	private static void select(WebElement dd) {
		dd = getWebElement(By.name("preferred_pronoun"));
		Select selectBirth = new Select(dd);
		selectBirth.selectByIndex(2);

	}

	private static void explicitWait(WebDriverWait wait) {
		
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(fn));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(ln));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(reEmail));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(pwd));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(day));
		ele = wait.until(ExpectedConditions.presenceOfElementLocated(month));
		 ele = wait.until(ExpectedConditions.presenceOfElementLocated(year));
	}

	private static void elementClick(By String) {
		getWebElement(createNewAcc).click();
		getWebElement(selectGender).click();
		getWebElement(clickCustom).click();
		getWebElement(clickSubmit).click();

	}
	static void custom()
	{
		elementClick(clickCustom);

		select(dd);

	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 wait = new WebDriverWait(driver, Duration.ofMillis(600));
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();

		 
		explicitWait(wait);
		inputs();
		Thread.sleep(4000l);
				elementClick(selectGender);
		explicitWait(wait);
		
		getWebElement(clickSubmit);

	}

}
