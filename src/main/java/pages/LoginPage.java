package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverFactory.getDriver();
    }

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        System.out.println(driver.findElement(password).getAttribute("value"));
        driver.findElement(password).sendKeys(pass);
        System.out.println(driver.findElement(loginBtn).getAttribute("value"));
        driver.findElement(loginBtn).click();
        System.out.println("login clicked");
    }
}