package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {

		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement we = driver.findElement(By.xpath("//*[@data-uniqid='1621702280245']"));
		String expLabel = "Practice Page";
		String actLabel = we.getText();
		
		if (actLabel.equals(expLabel))
			System.out.println("Test case Passed !!!!");
		else
			System.out.println("Test case Failed, expValue: " + expLabel + " : " + " actValue: " + actLabel);
			
		driver.quit();
		
		
		
		
		
	}

}
