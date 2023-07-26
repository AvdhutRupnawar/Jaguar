  package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			
			driver.findElement(By.name("firstname")).sendKeys("Vikas");
			driver.findElement(By.name("lastname")).sendKeys("Shinde");
			driver.findElement(By.name("reg_email__")).sendKeys("VickyShide123@gamil.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("VickyShide123@gamil.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Vicky@123");
			
			WebElement DOB = driver.findElement(By.name("birthday_day"));
			Select selectBirth = new Select(DOB );
			selectBirth.selectByIndex(15);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			WebElement DOM = driver.findElement(By.name("birthday_month"));
			Select selectMonth = new Select(DOM );
			selectMonth.selectByIndex(6);
	
			WebElement DOY = driver.findElement(By.name("birthday_year"));
			Select selectyr = new Select(DOY);
			selectyr.selectByIndex(24);
			
			driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
			     driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			     
			

	}

}
