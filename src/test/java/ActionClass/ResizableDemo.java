package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.linkText("Resizable")).click();
		
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);
		 WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		 
		 action.clickAndHold(drag).moveByOffset(90, 90).release().build().perform();
		driver.quit();
		

		
		
		
	}

}
