package Calender;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	static WebDriver driver;
	
	static WebElement getWebElement(By by)
	{
	return	driver.findElement(by);
	}

	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		
		By userTextName = By.name("username");
		By passTextame= By.name("pwd");
		By loginButton = By.id("loginButton");
		
		By prevMonth   = By.xpath("((//table[@class='mainSidesPadding'])[1]//tr[1]/td/table/tbody/tr/td)[13]/a");
		By nextMonth   = By.xpath("((//table[@class='mainSidesPadding'])[1]//tr/td[3])[2]/a");
		
		getWebElement(userTextName).sendKeys("admin");
		getWebElement(passTextame).sendKeys("manager");
		getWebElement(loginButton).click();
		
		LocalDate todaysDate = LocalDate.now();
		LocalDate selectedDate = LocalDate.of(2025, 9, 15);
		
		int todaysDay = todaysDate.getDayOfMonth();
		int todaysMonth = todaysDate.getMonthValue();
		int todaysYear = todaysDate.getYear();
		
		System.out.println("todaysDay   : " + todaysDay);
		System.out.println("todaysMonth : " + todaysMonth);
		System.out.println("todaysYear  : " + todaysYear);
		
		
		
		int selectedDay= selectedDate.getDayOfMonth();
		int selectedMonth = selectedDate.getMonthValue();
		int selectedYear = selectedDate.getYear();
		
		System.out.println("selectedDay   : " + selectedDay);
		System.out.println("selectedMonth : " + selectedMonth);
		System.out.println("selectedYear  : " + selectedYear);
		
		boolean goNextMonths = true;
		int     monthsDiff   = 0;
		if(selectedDate.isAfter(todaysDate))
		{		
			goNextMonths = true;
			monthsDiff = selectedMonth-todaysMonth;
		}
		else
		{	goNextMonths = false;
			monthsDiff = todaysMonth-selectedMonth;
		}
		System.out.println("monthsDiff: "+ monthsDiff);
		
		Boolean goNextYear = true;
		int yearDiff = 0;
		if(selectedYear>todaysYear)
		{
			goNextMonths = true;
			yearDiff = selectedYear-todaysYear;
			
		}
		
		
		while(monthsDiff>0)
		{
			if(goNextMonths)
			{
				System.out.println("going in next month");
				getWebElement(nextMonth).click();
			}
			else
			{
				System.out.println("going in previous month");		getWebElement(prevMonth).click();
			}
			monthsDiff--;	
		}
 
		
		
		
		
 		int day = selectedDate.getDayOfMonth();  //2
		System.out.println("day: " + day);
		
		String part1 = "//table[@id='calendar_table']//tr//td//span[text()='";
		String part2= "']";
		WebElement element = getWebElement(By.xpath(part1+day+part2));
		element.click();
	
	}

}
