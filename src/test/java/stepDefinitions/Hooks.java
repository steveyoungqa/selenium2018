package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import driver.driverFactory;

public class Hooks extends driverFactory {

    @After
    public void after (Scenario scenario) throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();


    }
}
