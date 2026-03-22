package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import factory.DriverFactory;

import java.time.Duration;

public class WaitUtils {

    private static WebDriver driver = DriverFactory.getDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static WebElement waitForElementVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForElementClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}