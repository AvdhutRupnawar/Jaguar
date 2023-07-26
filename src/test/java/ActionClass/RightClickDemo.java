package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	WebElement  element= driver.findElement(By.xpath("(//p[@align='center']/img)[2]"));
		
		Actions action = new Actions (driver);
		action.moveToElement(element).contextClick().build().perform();
//		driver.findElement(By.name("dm2m1i1tdT")).click();
//		driver.findElement(By.name("dm2m2i0tdT")).click();
		
		driver.findElement(By.id("dm2m1i1tdT")).click();
		Thread.sleep(2000l);
		driver.findElement(By.id("dm2m2i1tdT")).click();
		Thread.sleep(2000l);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("dm2m3i1tdT")).click();
		Thread.sleep(2000l);
				driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr[3]/td/a[1]")).click();
		String TextWhatsNew = driver.findElement(By.xpath("//strong")).getText();
		System.out.println("TextWhatsNew :- " +TextWhatsNew );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.switchTo().window("TextWhatsNew");
		driver.findElement(By.xpath("//a[@title='Android Dark Menu']/img")).click();
		String TextImg1 = driver.findElement(By.xpath("//p[@align='center']/span")).getText();
		System.out.println(" TextImg1 : = " + TextImg1);
		
		driver.navigate().back();

		driver.findElement(By.xpath("//a[@title='Block Blue Menu']/img")).click();
		driver.navigate().back();
		
		
		
		
	}	
	

}
