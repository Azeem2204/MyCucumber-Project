package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef 
{
WebDriver driver;
	
	@Given("^User need to be on google page$")
	public void User_need_to_be_on_google_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AZEEMUDDIN\\Cucumberworkspace\\CucumberAuto1\\src\\test\\resources\\Browser Drivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		
		
	}
	@When("^User enters \"([^\"]*)\" string$")
	public void User_enters_search_string(String Search) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Search);	
		Thread.sleep(5000);
	}
}
