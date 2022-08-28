package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features/"},
        glue={"stepDefinations"},
        plugin={
                "pretty","json:target/Cucumber,json",
                "html:target/cucumber-html-report.html"
        },
        dryRun = false
       
)
public class TestRunner {

}
