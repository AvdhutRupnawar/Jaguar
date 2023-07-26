package TagName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {

	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demo.openmrs.org/openmrs/login.htm"; 
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
		List<WebElement> low = driver.findElements(By.tagName("a"));
		// 
		System.out.println(low.size());
		System.out.println(low.get(0));
		
		String actualUrl = driver.getCurrentUrl();
		String expurl = "https://demo.openmrs.org/openmrs/login.htm";
		if (actualUrl.equals(expurl))
			System.out.println("First link is working ");
		else
			System.out.println("First link is not working");
		
		low = driver.findElements(By.tagName("a"));
		low.get(1).click();
		Thread.sleep(4000l);
		String actText	= driver.findElement(By.xpath("//div[@class='dialog-content']/p")).getText();
		String expText = "Please contact your System Administrator.";
		
		if(actText.equals(expText))
			System.out.println("Second link is working");
		else
			System.out.println("Second link is not working");
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
