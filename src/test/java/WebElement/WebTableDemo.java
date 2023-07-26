package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		/// table[@id='customers']/tbody/tr[2]/td[1]
		String part1 = "table[@id='customers']/tbody/tr[";
		String part2 = "]/td[";
		String part3 = "]";
		String nXpath;

	//	String ele = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]")).getText();
	//	System.out.print(String.format("%35s", ele));

		for(int r=2;r<8;r++)
		{
			for(int c=1;c<4;c++)
			{
				nXpath = part1+r+part2+c+part3;
				String ele = driver.findElement(By.xpath(nXpath)).getText();
				System.out.print(String.format("%-35s", ele));
			}
				System.out.println();
		}

		driver.quit();

	}
}
