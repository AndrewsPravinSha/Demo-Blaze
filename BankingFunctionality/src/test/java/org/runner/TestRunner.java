package org.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Feature-Files\\",glue = "StepdefinitionFiles",
dryRun = true,tags = {"@addtoCart"}

)
public class TestRunner extends AbstractTestNGCucumberTests{

}
