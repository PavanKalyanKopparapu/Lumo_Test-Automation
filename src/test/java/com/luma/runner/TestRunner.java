package com.luma.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"C:\\Users\\sudhe\\eclipse_workspace\\Luma\\src\\test\\java\\com\\luma\\features"},
		glue={"com/luma/stepDefenitions"}, 
		plugin = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		
		)

public class TestRunner {

}
