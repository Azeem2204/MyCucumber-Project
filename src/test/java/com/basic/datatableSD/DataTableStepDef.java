package com.basic.datatableSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDef {
	
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
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String Fname) throws InterruptedException
	{
		if(driver.findElement(By.xpath("//*[@id='facebook']/body/div[3]/div[2]/div/div")).isDisplayed())
		{
			System.out.println("cntrl Reched");
			Thread.sleep(5000);
			if(driver.findElement(By.name("firstname")).isDisplayed())
			{
				driver.findElement(By.name("firstname")).sendKeys(Fname);
			}
		}
		
	}
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user_first_name_is_present(String FName)
	{
		if(driver.findElement(By.name("firstname")).isDisplayed())
		{
			String UserName = driver.findElement(By.name("firstname")).getAttribute("value");
			System.out.println(UserName);
			Assert.assertEquals(FName , UserName);
		}
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void User_enters_user_surname(String LName) throws InterruptedException
	{
		Thread.sleep(3000);
		if(driver.findElement(By.name("lastname")).isDisplayed())
		{
			driver.findElement(By.name("lastname")).sendKeys(LName);
		}
	}

	@But("^User mobile field should be blank$")
	public void User_mobile_field_should_be_blank() throws InterruptedException
	{
		Thread.sleep(2000);
		if(driver.findElement(By.name("reg_email__")).isDisplayed())
		{
			String Mob_Email = driver.findElement(By.name("reg_email__")).getAttribute("value");
			System.out.println(Mob_Email);
			Assert.assertEquals("", Mob_Email);
			Thread.sleep(1000);
		}
	}
	
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
		driver= null;
	}
	
	
	@When("^Enter following Data$")
	public void Enter_following_Data(DataTable table)
	{
		List <List<String>> data = table.raw(); 
		String values1 = data.get(0).get(0);
		
		
		if(driver.findElement(By.name("firstname")).isDisplayed())
		{
			driver.findElement(By.name("firstname")).sendKeys(data.get(0).get(0));
		}
	}
	
	
}
