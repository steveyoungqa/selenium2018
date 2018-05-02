package pageObjects;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class homePage extends driverFactory {

    public static WebElement Sport() throws IOException {
        return findElement(By.cssSelector(".orb-nav-sport>a"),5);
    }

    public static WebElement Football() throws IOException {
        return findElement(By.xpath("//span[@class=\"primary-nav__link-text\" and text()=\"Football\"]"),5);
    }

    public static WebElement SecondaryNavigationText(String text) throws IOException {
        return findElement(By.xpath("//*[@class='secondary-nav__link']//*[contains(text(), '" + text + "')]"),5);
    }

    public static WebElement tablesSearchTerm() throws IOException {
        return findElement(By.id("downshift-0-input"),5);
    }

    public static WebElement searchIcon() throws IOException {
        return findElement(By.id("sp-c-search"),5);
    }

    public static WebElement wikipediaLogo() throws IOException {
        return webDriver.findElement(By.cssSelector(".mw-wiki-logo"));
    }

    public static WebElement byPartialLinkText (String name) throws IOException {
        return webDriver.findElement(By.partialLinkText(name));
    }

    public static WebElement byLinkText (String text) throws IOException {
        return webDriver.findElement(By.linkText(text));
    }





}
