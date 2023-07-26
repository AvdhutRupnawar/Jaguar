package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();
		  driver.get("http://dista.ai/");
		  driver.manage().window().maximize();
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1500);","");
		  Thread.sleep(5000l);
		
		String text50 = driver.findElement(By.xpath("(//span[@data-duration='2000'])[1]")).getText();
		String Fulltext = driver.findElement(By.xpath("(//div[@class='elementor-counter-title'])[1]")).getText();
		String textK = driver.findElement(By.xpath("(//span[@class='elementor-counter-number-suffix'])[1]")).getText();
				
				System.out.print(text50);
			
				System.out.println(textK);
			
				System.out.println(Fulltext);
				
				System.out.println("-*".repeat(40));
				
				String exp50 = "50";
				if(text50.equals(exp50))
				{
					System.out.println("Test case Pass:- "+text50);}
					else
						{System.out.println("Test case Failed:- "+text50);}
				
				String Ktxt = "K+";
				if(textK.equals(Ktxt))
				{
					System.out.println("Test case Pass :- "+textK);}
					else
						{System.out.println("Test case Failed:- "+textK);}
				
				String exptext = "Field assets managed";
				if(Fulltext.equals(exptext))
				{
					System.out.println("Test case Pass:- "+Fulltext);}
					else
						{System.out.println("Test case Failed:- "+Fulltext);}
				
				driver.quit();
		 
		  
		
//		 
		 
		 
		 
		 	
		 
		
		
		
	}

}
