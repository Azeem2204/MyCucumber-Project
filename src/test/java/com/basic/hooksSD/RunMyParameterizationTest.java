package com.basic.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features={"src/test/resources/com/basic/hooksFF/"},
		glue={"com/basic/hooksSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reporthooks.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportBgrd.html"}
		
		)


public class RunMyParameterizationTest 
{
	

}
