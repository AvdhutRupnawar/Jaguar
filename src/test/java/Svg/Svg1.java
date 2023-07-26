package Svg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sajithatharaka.github.io/svg-automation/");
		
		WebElement Circle = driver.findElement(By.xpath("//*[name()='svg']//*[name()='circle']"));
		
		System.out.println("X coordinate  :" + Circle.getAttribute("cx"));
		System.out.println("Y-coordinate : "+Circle.getAttribute("cy"));
		System.out.println("Radius       : "+Circle.getAttribute("r"));
		System.out.println("Stroke       : "+Circle.getAttribute("stroke"));
		System.out.println("Stroke Width : "+Circle.getAttribute("stroke-width"));
		System.out.println("Fill Color   : "+Circle.getAttribute("fill"));
		
		
		WebElement svgRectangle = driver.findElement(By.xpath("//*[local-name()='rect' and @id='rectangle']"));
		System.out.println("Width  : "+svgRectangle.getAttribute("width"));
		System.out.println("Height : "+svgRectangle.getAttribute("height"));
		System.out.println("style : "+svgRectangle.getAttribute("style"));
		
		WebElement text = driver.findElement(By.xpath("//*[name()='text']"));
		System.out.println("Getting Text   : " + text.getText());
		System.out.println("Text using textContent : " + text.getAttribute("textContent"));
		System.out.println("Text using innerHTML   : " + text.getAttribute("innerHTML"));
		
		driver.quit();
		
		
		
		
		
	}

}
