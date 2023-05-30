package com.obsquera.AutomationCourse;

public class NavigationCommands extends Base{
	
	public void navigationCommands()
	{
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands commands=new NavigationCommands();
		commands.initializeBrowser();
		commands.navigationCommands();
		commands.driverQuit();

	}
	
	

}
