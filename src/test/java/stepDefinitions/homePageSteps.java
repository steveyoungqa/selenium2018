package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import driver.driverFactory;
import pageObjects.homePage;

public class homePageSteps extends driverFactory {



    @cucumber.api.java.en.Given("^I am using the \"([^\"]*)\" browser$")
    public void iAmUsingTheBrowser(String browser) throws Throwable {
        createNewWebDriver(browser);
    }

    @And("^I am on the \"([^\"]*)\" website$")
    public void iAmOnTheWebsite(String url) throws Throwable {
        webDriver.navigate().to(url);
    }

    @Then("^I select the Sport section using a CSS Path$")
    public void iSelectTheSportSectionUsingACSSPath() throws Throwable {
        homePage.Sport().click();
    }

    @And("^I select the Football section using an Xpath with Span text$")
    public void iSelectTheFootballSectionUsingAnXpathWithSpanText() throws Throwable {
        homePage.Football().click();
    }

    @Then("^I select the \"([^\"]*)\" section using an Xpath with Text Contains$")
    public void iSelectTheSectionUsingAnXpathWithTextContains(String text) throws Throwable {
        homePage.SecondaryNavigationText(text).click();
    }

    @And("^I search for the Team \"([^\"]*)\" using an ID locator$")
    public void iSearchForTheTeamUsingAnIDLocator(String team) throws Throwable {
        homePage.tablesSearchTerm().sendKeys(team);
        homePage.searchIcon().click();
    }

    @Then("^I search for \"([^\"]*)\" using Link Text locator$")
    public void iSearchForUsingLinkTextLocator(String text) throws Throwable {
        homePage.byLinkText(text).click();
    }

    @And("^I search for \"([^\"]*)\" using Partial Link Text locator$")
    public void iSearchForUsingPartialLinkTextLocator(String text) throws Throwable {
        homePage.byPartialLinkText(text).click();
    }

}
