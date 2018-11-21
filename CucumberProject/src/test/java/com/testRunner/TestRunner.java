package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\feature\\example.feature",
        glue = {"com.stepDefenitions"},
        tags = {"~@Ignore"},
        plugin = ("html:target/cucumber-reports/cucumber-pretty"),
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false) //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			



public class TestRunner {

}
