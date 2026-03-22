package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import utils.WaitUtils;

public class CartPage {

    private WebDriver driver;

    public CartPage() {
        this.driver = DriverFactory.getDriver();
    }

    private By checkoutBtn = By.id("checkout");

    public void clickCheckout() {
        WaitUtils.waitForElementClickable(checkoutBtn).click();
    }
}