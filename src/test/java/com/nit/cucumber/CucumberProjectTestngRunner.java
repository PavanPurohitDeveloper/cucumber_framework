package com.nit.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/test/resources"},
		glue= {"com.nit.cucumber"},
		plugin= {
				"html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
		},
		tags= {"~@BookHotel", "@ShopOnEbay"}	//execute first and dont execute second scenario	
	)
public class CucumberProjectTestngRunner extends AbstractTestNGCucumberTests {

}
