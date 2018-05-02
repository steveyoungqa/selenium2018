package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.Map;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"driver", "stepDefinitions", "testRunner"},
        tags = {"@chrome"},
        format = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"})

public class testRunner {

    public static Map<String, String> config;
    public static Scenario scenario;
}

