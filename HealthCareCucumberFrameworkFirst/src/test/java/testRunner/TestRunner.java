package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resource/features/Registration.feature","src/test/resource/features/login.feature"},
      
        glue={"stepDefinations"},
        
       
        plugin={
                "pretty",
                "json:target/cucumber-jason-reports/Cucumber.json",
                "html:target/cucumber-html-reports/cucumber.html",
                 "junit:target/cucumber-xml-reports/Cucumber.xml",
                "json:target/cucumber.json"},
        
        //tags= "@Regression or @Smoke",
        dryRun = false,
        monochrome = true
       
)
public class TestRunner {

}
//"json:target/cucumber.json"
// "json:target/cucumber-jason-reports/Cucumber.json" ,
  //"html:target/cucumber-html-reports/cucumber.html",
 // "junit:target/cucumber-xml-reports/Cucumber.xml",
 
  