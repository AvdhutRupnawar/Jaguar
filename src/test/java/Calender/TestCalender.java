package Calender;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCalender {

	public static void main(String[] args) throws Exception {
		String url = "https://www.hyrtutorials.com/p/calendar-practice.html ";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
	
		
		

/*
 * Validate the date provided by the user Input
 */
		LocalDate todaysDate = LocalDate.now();
		//passDate
		
		// set a date format for userDefinedDate 
		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		//small 'm' will take it as minutes
		// when you provide 'DD' when date is false it gives privious moth date'
		// when you provide 'dd' when date is false it gives next moth date'
		
		String targetDate = "28-Feb-2021";
		Date formattedTargetDate;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	WebElement text =	driver.findElement(By.xpath("//input[@id='second_date_picker']"));
		text.click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"
				+ "//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()="+targetDate+"]"));
		
		try {
			targetDateFormat.setLenient(false);
			formattedTargetDate = targetDateFormat.parse(targetDate);
			System.out.println(formattedTargetDate);
			
			int todaysDay = todaysDate.getDayOfMonth();
			System.out.println(todaysDay);
			
		} catch (Exception e) {
			throw new Exception( "Input date is provided ,plesw check input date");
		}
		
		
	//	/*Select a  date 
		
		
		
		
		
		
	}

}
