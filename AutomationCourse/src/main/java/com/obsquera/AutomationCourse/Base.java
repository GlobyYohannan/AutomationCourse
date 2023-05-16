package com.obsquera.AutomationCourse;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;

	
	public void initializeBrowser()
	{
		//To invoke Chrome Browser
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\git\\AutomationCourse\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe" );
		//driver=new ChromeDriver();
		
		//To invoke Edge Browser
		//System.setProperty("webdriver.edge.driver","C:\\Users\\user\\git\\AutomationCourse\\AutomationCourse\\src\\main\\java\\Resources\\msedgedriver.exe" );
		//driver=new EdgeDriver();
		//driver.get("https://www.amazon.in/");
		
		//To invoke firefox Browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Documents\\Seleniumtestingtutorial\\AutomationCourse2\\src\\main\\java\\Resources\\geckodriver.exe" );
		driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	

	public static void main(String[] args) {
		
		Base base=new Base();
		base.initializeBrowser();

	}

}
