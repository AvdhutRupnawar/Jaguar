package WebElement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement btnwindow = driver.findElement(By.xpath("//button[@id= 'openwindow']"));
		btnwindow.click();
		
		
		Set<String> winId = driver.getWindowHandles();
		Iterator <String> Iter = winId.iterator();
		String pwinId = Iter.next();
		System.out.println("Parent wind Id : " + pwinId );
		String cwinId = Iter.next();
		System.out.println("Child wind Id : " + cwinId );
		
		
		driver.switchTo().window(cwinId);
		String actualcwinId= driver.getCurrentUrl();
		String expcwinId = "https://www.letskodeit.com/courses";
		
		if(actualcwinId.equals(expcwinId))
		{
			System.out.println("Test case#1 Passed");}
			else
			{	System.out.println("Test case#1 Failed");}
		
		driver.close();
		
		driver.switchTo().window(pwinId);
		String actualpwinId =driver.getCurrentUrl();
		String exppwinId = "https://www.letskodeit.com/practice";
				
		if (actualpwinId.equals(exppwinId))
		{System.out.println("Test case#2 Passed");}
		else
		{	System.out.println("Test case#2 Failed");}
	
		Thread.sleep(4000l);
		driver.quit();
		
	}
		
		
		
		
		
	}


