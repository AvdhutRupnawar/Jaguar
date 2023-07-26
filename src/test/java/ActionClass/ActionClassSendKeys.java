package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKeys {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); // Browser Launched
		driver.get("https://www.letskodeit.com/practice"); // go to URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// implicit Wait to for syncronisation
		// to handle stale element
		
		
		WebElement autoSuggestText = driver.findElement(By.xpath("//input[@id='autosuggest']")); // autoSuggestopion click
		autoSuggestText.sendKeys("Avdhut"); 
		
		Actions action = new Actions(driver);
		action.sendKeys(autoSuggestText,"Ram").build().perform();
		
WebElement btnOpenWindow= driver.findElement(By.id("openwindow"));
//		
		action.click(btnOpenWindow).build().perform(); // by using action class click on openWindow button
		
//btnOpenWindow.click();
	}

}
