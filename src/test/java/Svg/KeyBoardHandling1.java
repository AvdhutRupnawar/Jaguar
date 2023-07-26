package Svg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardHandling1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        
        driver.findElement(By.id("userName")).sendKeys("Cyber Success");
        
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).build().perform();
        
        driver.findElement(By.id("userEmail")).sendKeys("abd@gmail.com");
        actions.sendKeys(Keys.TAB).build().perform();
        
        
       WebElement currentAddress =  driver.findElement(By.id("currentAddress"));
       currentAddress.sendKeys("Deccan,Asmani Plaza, Pune 411 016");

        
        String k = Keys.chord(Keys.CONTROL,"a");
        currentAddress.sendKeys(k);
      
        
        Thread.sleep(2000l);
        k = Keys.chord(Keys.CONTROL,"c");
        currentAddress.sendKeys(k);
        
        k = Keys.chord(Keys.CONTROL,"v");
        WebElement permenentAdd = driver.findElement(By.id("permanentAddress"));
        permenentAdd.sendKeys(k);
        
        //WebElement textBoxLocator = driver.findElement(By.te)
       // k = Keys.chord(Keys.F5);
        currentAddress.sendKeys(Keys.F5);
        
        
        
		
		
		
	}

}
