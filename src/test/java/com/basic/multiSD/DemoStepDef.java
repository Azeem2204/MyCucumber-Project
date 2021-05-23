package com.basic.multiSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on Demo Registration page$")
	public void User_need_to_be_on_Demo_Registration_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AZEEMUDDIN\\Cucumberworkspace\\CucumberAuto1\\src\\test\\resources\\Browser Drivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		
	}
	@When("^User enters \"([^\"]*)\" first name$")
	public void User_enters_first_name(String Fname) throws InterruptedException
	{
		if(driver.findElement(By.xpath("//input[@placeholder='First Name']")).isDisplayed())
		{
			System.out.println("cntrl Reched");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Fname);
		
		}
		
	}
	
	@When("^User enters \"([^\"]*)\" last name$")
	public void User_enters_last_name(String Lname) throws InterruptedException
	{
		if(driver.findElement(By.xpath(" //input[@placeholder='Last Name']")).isDisplayed())
		{
			System.out.println("cntrl Reched");
			Thread.sleep(3000);
			driver.findElement(By.xpath(" //input[@placeholder='Last Name']")).sendKeys(Lname);
		
		}
		
	}
}
