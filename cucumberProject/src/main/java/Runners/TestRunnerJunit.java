package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:/Users/prate/Downloads/cucumberProject/cucumberProject/src/main/resources/features/hooks2.feature"}
        //dryRun = true
        ,glue = {"stepdefinitions"}
         plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json",
 "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", 
"junit:target/cucumber-results.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = true,

        //tags = "@orateek",
        stepNotifications = true
)
public class TestRunnerJunit {

}
