package CssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.openmrs.org/openmrs/login.htm\r\n");
		  driver.manage().window().maximize();
	}
	

}
