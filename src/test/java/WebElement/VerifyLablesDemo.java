package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLablesDemo {

	public static void main(String[] args) {

		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		String explable = "Radio Button Example";
		String actlable = driver.findElement(By.xpath("(//legend)[1]")).getText();
		
		if(explable.equals(actlable))
		{
			System.out.println("Test case Passed");}
			else
				{System.out.println("Test case is Failed");
		}}
		
		
		
	}


