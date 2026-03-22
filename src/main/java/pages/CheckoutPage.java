package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import utils.WaitUtils;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage() {
        this.driver = DriverFactory.getDriver();
    }

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");

    public void fillDetails(String fName, String lName, String zip) {
        WaitUtils.waitForElementVisible(firstName).sendKeys(fName);
        WaitUtils.waitForElementVisible(lastName).sendKeys(lName);
        WaitUtils.waitForElementVisible(postalCode).sendKeys(zip);
    }

    public void clickContinue() {
        WaitUtils.waitForElementClickable(continueBtn).click();
    }

    public void clickFinish() {
        WaitUtils.waitForElementClickable(finishBtn).click();
    }
}