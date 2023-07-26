package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();  // Browser Launched
		driver.get("https://www.letskodeit.com/practice"); // go to URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// implicit Wait to for synchronisation
		// to handle stale element
		
		WebElement frameEle  = driver.findElement(By.xpath("// iframe[@id='courses-iframe']")); // finding frame 
		
		driver.switchTo().frame(frameEle); // to navigate focus to frame
		String Heading = driver.findElement(By.xpath("//h1[@class='dynamic-heading margin-bottom-20']")).getText(); //Header path
		System.out.println("Heading is : " + Heading);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().defaultContent(); 
		// To get on main page 
		//When focus is inside a frame, weblement outside the frame is not accessible.
		// To access an webelement outside frame when focus is inside frame, focus has to come out of frame using
		//driver.switchTo().defaultContent();

		String Lable = driver.findElement(By.xpath("(//fieldset/legend)[2]")).getText();// Lablepath (main page)
		System.out.println("lable is :- " +Lable);
		
		
		
		
		
		
	}

}
