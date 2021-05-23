package com.basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features={"src/test/resources/com/basic/backgroundFF/"},
		glue={"com/basic/backgroundSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportBgrd.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportBgrd.html"}
		
		)


public class RunMyBackgroundTest 
{
	

}
