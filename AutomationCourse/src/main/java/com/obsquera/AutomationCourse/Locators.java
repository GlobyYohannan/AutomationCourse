package com.obsquera.AutomationCourse;

import org.openqa.selenium.By;

public class Locators extends Base{
	
	public void locatingById()
	{
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("nav-logo-sprites"));
		driver.findElement(By.id("glow-ingress-line1"));
		driver.findElement(By.id("searchDropdownDescription"));
		driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	}

	
	public void locatingByClassName()
	{
		driver.findElement(By.className("nav-imageHref"));
		driver.findElement(By.className("nav-line-2"));
		driver.findElement(By.className("nav-a"));
		driver.findElement(By.className("a-button-text"));
		driver.findElement(By.className("a-link-normal"));
	}
	
	public void locatingByName()
	{
		driver.findElement(By.name("glow-validation-token"));
		driver.findElement(By.name("url"));
		driver.findElement(By.name("url"));
	}
	
	public void locateByCssSelector()
	{
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));//tag and id(#)
		driver.findElement(By.cssSelector("a#nav-logo-sprites"));//tag and id(#)
		driver.findElement(By.cssSelector("a.nav-imageHref"));//tag and class(.)
		driver.findElement(By.cssSelector("a.a-button-text"));//tag and class(.)
		driver.findElement(By.cssSelector("a[aria-label='Amazon.in']"));//tag and attributes(tag[attribute='value'])
		driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_0']"));
	}
	
	public void locateBylinkText()
	{
		driver.findElement(By.linkText("Amazon miniTV"));
		driver.findElement(By.partialLinkText("Today's"));
		
	}
	
	
	public static void main(String[] args) {
		
		Locators locator=new Locators();
		locator.initializeBrowser();
		//locator.locatingById();
		//locator.locatingByClassName();
		//locator.locatingByName();
		//locator.locateByCssSelector();
		locator.locateBylinkText();
		
		locator.driverQuit();

	}

}
