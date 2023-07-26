package AutoIT;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItNotRequired {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.xpath("//div/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//div[@class='orangehrm-header-container']//button[@type='button']")).click();
			Thread.sleep(4000l);
			
			driver.findElement(By.xpath("//div[@class='oxd-file-div oxd-file-div--active']//button[@type='button']")).click();
			
			Runtime.getRuntime().exec("H:\\OrangeFile");
			
			Thread.sleep(4000l);
			
			
			
		
	}

}
