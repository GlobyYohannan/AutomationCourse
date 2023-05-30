package com.obsquera.AutomationCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByXpath extends Base{
	
	public void locateXpath()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
	}

	public void locateDynamicXpath()
	{
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtext')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		
		driver.findElement(By.xpath("//span[contains(text(),'Select your address')]"));
		WebElement searchBar=driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search Amazon.in']"));
		driver.findElement(By.xpath("//input[@type='text' or @placeholder='Search Amazon.in']"));
		driver.findElement(By.xpath("//input[@type='text']//parent::div[@class='nav-search-field ']"));
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']//parent::div[@class='nav-search-field ']"));
		driver.findElement(By.xpath("//div[@id='nav-search']//child::div[@id='nav-bar-left']"));
		
		driver.findElement(By.xpath("//input[@type='text']//following::div[@id='nav-iss-attach']"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//preceding::div['nav-search-dropdown-card']"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='nav-search-field ']//descendant::input"));
		driver.findElement(By.xpath("//label[@for='twotabsearchtextbox']//following-sibling::input"));
		
		
		
	}
	public static void main(String[] args) {
		
		LocateByXpath xpath=new LocateByXpath();
		xpath.initializeBrowser();
		//xpath.locateXpath();
		xpath.locateDynamicXpath();
		xpath.driverQuit();
	}

}
