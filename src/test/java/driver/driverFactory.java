package driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class driverFactory {

    protected static WebDriver webDriver;

    public static WebDriver createNewWebDriver(String browser) throws IOException {
        if (webDriver == null) {

            if (browser.equals("Chrome")) {
                webDriver = new ChromeDriver();
            }
            if (browser.equals("Firefox")) {
                webDriver = new FirefoxDriver();
            }
        } else {
            System.out.print("Cant read browser type!");
        }
        return webDriver;
    }

    public static WebElement findElement(By by, int timeOutSeconds) throws IOException {

        try {
            return (WebElement) (new WebDriverWait(webDriver, timeOutSeconds)).until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}