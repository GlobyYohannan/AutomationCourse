package com.obsquera.AutomationCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class WebElementsCommandsSample extends Base {
	
	public void webElementsCommandsSample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys("Hello");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		singleInputTextField.clear();
		boolean singleInputTextFieldIsDisplayed=singleInputTextField.isDisplayed();
		boolean showMessageButtonIsEnabled=showMessageButton.isEnabled();
		String showMessageButtonText=showMessageButton.getText();
		Dimension showMessageButtonSize=showMessageButton.getSize();
		int showMessageButtonHeight=showMessageButtonSize.getHeight();
		int showMessageButtonWidth=showMessageButtonSize.getWidth();
		int singleInputTextFieldX=singleInputTextField.getLocation().getX();
		int singleInputTextFieldY=singleInputTextField.getLocation().getY();
		int showMessageButtonX= showMessageButton.getLocation().getX();
		int showMessageButtonY= showMessageButton.getLocation().getY();
		String showMessageButtonAttribute=showMessageButton.getAttribute("class");
		String showMessageButtonBorderRadius=showMessageButton.getCssValue("border-radius");
		String showMessageButtonBackgroundColor=showMessageButton.getCssValue("background-color");
		
	}
	
	public void singleInputTextField()
	{
		String input="Globy";
		String expectedYourMessageText="Your Message : "+input;
		
		WebElement singleInputTextField1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField1.sendKeys(input);
		WebElement showMessageButton1=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton1.click();
		String yourMessageText=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		
		if(expectedYourMessageText.equals(yourMessageText))
		{
			System.out.println("Test Message Text Validation Passed");
		}
		else
		{
			System.out.println("Test Message Text Validation Failed");
		}
		
	}
	
	public void twoInputField()
	{ 
		int a=5;
		int b=10;
	    String a1=Integer.toString(a);
	    String b1=Integer.toString(b);
	    int sum=a+b;
	    String expectedTotalAPlusBText= "Total A + B : "+sum;	
		WebElement valueATextField= driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement valueBTextField= driver.findElement(By.xpath("//input[@id='value-b']"));
		
		valueATextField.sendKeys(a1);
		valueBTextField.sendKeys(b1);
		
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		
		WebElement totalText=driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalAPlusBText=totalText.getText();
		
			
		
		if(expectedTotalAPlusBText.equals(totalAPlusBText))
		{
			System.out.println("Test Message Text A plus B Validation Passed");
		}
		else
		{
			System.out.println("Test Message Text A plus B Validation failed");
		}
		
	}
	
	public void verifyHeightWidthOfGetTotalButton()
	{
		WebElement getTotalButton1=driver.findElement(By.xpath("//button[@id='button-two']"));
		Dimension getTotalButtonSize=getTotalButton1.getSize();
		int getTotalButtonSizeHeight=getTotalButtonSize.getHeight();
		int getTotalButtonSizeWidth=getTotalButtonSize.getWidth();
	}
	public void  verifyTextAIsAboveTextB()
	{
		WebElement valueATextField1= driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement valueBTextField1= driver.findElement(By.xpath("//input[@id='value-b']"));
		int valueATextField1X= valueATextField1.getLocation().getX();
		int valueATextField1Y= valueATextField1.getLocation().getY();
		int valueBTextField1X= valueBTextField1.getLocation().getX();
		int valueBTextField1Y= valueBTextField1.getLocation().getY();
		
		if(valueATextField1Y<valueBTextField1Y)
		{
			System.out.println("TextFieldA is above TextFieldB");
		}
		else
		{
			{
				System.out.println("TextFieldA is not above TextFieldB");
			}
		}
	}
	
	public void verifyBackGroundColorOfGetTotalButton()
	{
		String expectedGetTotalButtonBackgroungColor="#007bff";
		WebElement getTotalButton1=driver.findElement(By.xpath("//button[@id='button-two']"));
		
		String getTotalButton1BackGroundColor=getTotalButton1.getCssValue("background-color");
		
		
		String hex = Color.fromString(getTotalButton1BackGroundColor).asHex();
		System.out.println(hex);
		
		if(hex.equals(expectedGetTotalButtonBackgroungColor))
		{
			System.out.println("verifyBackGroundColorOfGetTotalButton Passed");
		}
		
		else
		{
			System.out.println("verifyBackGroundColorOfGetTotalButton Failed");
		}
	}

	public static void main(String[] args) {
		WebElementsCommandsSample webElementsCommandsSample =new WebElementsCommandsSample();
		webElementsCommandsSample.initializeBrowser();
		webElementsCommandsSample.webElementsCommandsSample();
		webElementsCommandsSample.twoInputField();
		webElementsCommandsSample.singleInputTextField();
		webElementsCommandsSample.verifyHeightWidthOfGetTotalButton();
		webElementsCommandsSample.verifyTextAIsAboveTextB();
		webElementsCommandsSample.verifyBackGroundColorOfGetTotalButton();
		webElementsCommandsSample.driverQuit();
	}

}
