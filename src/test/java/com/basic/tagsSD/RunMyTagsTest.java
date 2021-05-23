package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		//tags = {"@Important"},
		tags = {"@Smoke", "@Regression"},
		//tags = {"@Smoke, @Regression"},
		features={"src/test/resources/com/basic/tagsFF/"},
		glue={"com/basic/tagsSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportTags.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReporttags.html"}
		
		)


public class RunMyTagsTest 
{
	

}
