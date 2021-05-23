package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on facebook login page$")
	public void User_need_to_be_on_facebook_login_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AZEEMUDDIN\\Cucumberworkspace\\CucumberAuto1\\src\\test\\resources\\Browser Drivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@class='_6ltg']/a")).click();
		Thread.sleep(5000);
		
		
	}
	@When("^User enters user first name$")
	public void User_enters_user_first_name() throws InterruptedException
	{
		if(driver.findElement(By.xpath("//*[@id='facebook']/body/div[3]/div[2]/div/div")).isDisplayed())
		{
			System.out.println("cntrl Reched");
			Thread.sleep(5000);
			if(driver.findElement(By.name("firstname")).isDisplayed())
			{
				driver.findElement(By.name("firstname")).sendKeys("Test Cucumber");
			}
		}
		
	}
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present()
	{
		if(driver.findElement(By.name("firstname")).isDisplayed())
		{
			String UserName = driver.findElement(By.name("firstname")).getAttribute("value");
			System.out.println(UserName);
			Assert.assertEquals("Test Cucumber", UserName);
		}
	}

}
