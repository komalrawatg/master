package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.*;

public class testCases extends BaseTest {

    @Test
    public void verifyOrderFlow() throws InterruptedException {

        LoginPage login = new LoginPage();
        login.login("standard_user", "secret_sauce");

        ProductsPage products = new ProductsPage();
        Assert.assertEquals(products.getPageTitle(), "Products");

        products.addProductToCart();
        products.goToCart();

        CartPage cart = new CartPage();
        cart.clickCheckout();

        CheckoutPage checkout = new CheckoutPage();
        checkout.fillDetails("Komal", "Rawat", "201301");
        System.out.println("details added successfully");
        checkout.clickContinue();
        System.out.println("continue click");
        Thread.sleep(20);
        checkout.clickFinish();
        System.out.println("finish click");
    }
}