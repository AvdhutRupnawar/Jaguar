package Jquery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDemo1 {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		  driver.manage().window().maximize();
	
		  driver.findElement(By.id("justAnInputBox")).click();
		  
		  List<WebElement> low = driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])"
		  		                       + "[1]//span[@class='comboTreeItemTitle']"));
		  
		  System.out.println("low size : " + low.size());
		  
		for(WebElement element:low)
		{
			String options = element.getText();
			if(options.equals("choice 3")|| options.equals("choice 5"))
			{
				element.click();
				System.out.println(options);
			}
		}
		
		Thread.sleep(3000l);
		driver.quit();
	}
	

}
