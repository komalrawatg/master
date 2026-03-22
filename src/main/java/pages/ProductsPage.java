package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import utils.WaitUtils;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage() {
        this.driver = DriverFactory.getDriver();
    }

    private By title = By.className("title");
    private By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");

    public String getPageTitle() {
        return WaitUtils.waitForElementVisible(title).getText();
    }

    public void addProductToCart() {
        WaitUtils.waitForElementClickable(addToCart).click();
    }

    public void goToCart() {
        WaitUtils.waitForElementClickable(cartIcon).click();
    }
}