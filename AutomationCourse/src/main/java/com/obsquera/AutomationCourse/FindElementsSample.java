package com.obsquera.AutomationCourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsSample extends Base {
	
	public void FindElementsSample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		List<WebElement> menuOptions=driver.findElements(By.tagName("a"));
		System.out.println(menuOptions.size());		
		for (WebElement options:menuOptions)
		{
			System.out.println(options);
		}
		menuOptions.get(2).click();
	}

	public static void main(String[] args) {
		FindElementsSample findElementsSample=new FindElementsSample();
		findElementsSample.initializeBrowser();
		findElementsSample.FindElementsSample();
		findElementsSample.driverQuit();

	}

}
