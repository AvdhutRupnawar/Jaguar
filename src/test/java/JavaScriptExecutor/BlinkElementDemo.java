package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkElementDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		byte ticks = 60;
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		highlight(js,txtFirstName, "My Cyber", ticks);

	 	WebElement txtLastName = driver.findElement(By.name("lastname"));
		highlight(js,txtLastName, "Success",ticks);
		
		
		WebElement txtEmail = driver.findElement(By.name("reg_email__"));
		highlight(js,txtEmail,"CyberSuccess@gmail.com",ticks);

		String val= driver.findElement(By.name("firstname")).getAttribute("value");
		System.out.println("value: " + val);

		String txt = driver.findElement(By.name("firstname")).getText();
		System.out.println("txt: " + txt); //will not have any value
		
	}

	private static void highlight(JavascriptExecutor js, WebElement element, String data, byte ticks) {
		for(int i= 0;i<=ticks;i++)
		{
			if(i%2==0) 
				js.executeScript("arguments[0].style.backgroundcolor = 'red'",element);
				else
					js.executeScript("arguments[0].style.backgroundcolor = 'white'",element);
			
		}
		js.executeScript("arguments[0].style.backgroundColor='White'",element);
		element.sendKeys(data);
		
		
	}}
	


