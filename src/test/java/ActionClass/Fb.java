package ActionClass;

	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class Fb {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class='_6ltg'][2]/a")).click();
			
			driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Rahul");
			driver.findElement(By.xpath("//div[@class ='_5dbb']/div//input")).sendKeys("Shinde");
			driver.findElement(By.xpath("//div[@class='mbm _a4y']/div/div//input")).sendKeys("rahulshinde@gmail.com");
			driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']/div//input")).sendKeys("Rahul@123");
			
			 WebElement DropDnDay = driver.findElement(By.xpath("//span[@class='_5k_4']//select[1]"));
			 DropDnDay.click();
			 DropDnDay.sendKeys("23");
			 DropDnDay.click();
			 
			 WebElement DropDnMan = driver.findElement(By.xpath("//span[@class='_5k_4']//select[2]"));
			 DropDnMan.click();
			 DropDnMan.sendKeys("Mar");
			 DropDnMan.click();
			 
			 WebElement DropDnYr = driver.findElement(By.xpath("//span[@class='_5k_4']//select[3]"));
			 DropDnYr.click();
			 DropDnYr.sendKeys("2014");
			 DropDnYr.click();
			 
			 driver.findElement(By.xpath("//div[@class='mtm _5wa2 _5dbb']//span[@class='_5k_2 _5dba'][2]//input")).click();
			 driver.findElement(By.xpath("//div[@class='_1lch']/button")).click();
			
			 driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input")).sendKeys("rahulshinde@gmail.com");
			 driver.findElement(By.xpath("//div[@class='_1lch']/button")).click();
			 
			 driver.switchTo().window("https://www.facebook.com/?ty=tytrue");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//Actions action = new Actions(driver);
			 driver.findElement(By.name("email")).sendKeys("rahulshinde@gmail.com");
//			WebElement pass =  driver.findElement(By.id("passContainer"));
//			action.sendKeys(pass, "rahulshinde@gmail.com")
		
		}

	}


