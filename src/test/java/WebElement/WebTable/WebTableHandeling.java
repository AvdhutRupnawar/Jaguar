package WebElement.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandeling {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		
	/*	
		List<WebElement> webEle= driver.findElements(By.xpath("//div//tr[2]/td"));
		for (int i =0; i<webEle.size();i++)
			{System.out.print( String.format("%35s", webEle.get(i)));
			System.out.println();
		
		}
	*/
		
			List<WebElement>  low = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));

		List<WebElement> loc = low.get(0).findElements(By.xpath("th"));
		for(WebElement ele: loc)
		System.out.print(String.format("%-35s",ele.getText()));
	System.out.println();	

		for(int i=1;i<low.size();i++)
		{
		loc = low.get(i).findElements(By.xpath("td"));
		for(WebElement ele: loc)
			System.out.print(String.format("%-35s",ele.getText()));
			System.out.println();	
	}
		
		driver.quit();
		
	}

}
