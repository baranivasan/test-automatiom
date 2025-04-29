package runner;

import io.cucumber.messages.types.Product;
import org.openqa.selenium.WebDriver;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Home;
import pages.Login;
import pages.Products;

import static pages.Baseclass.*;

public class TestNGRunner {
    WebDriver webDriver;


    @BeforeTest
    public void LaunchBrowser() {
        webDriver = openBrowser("Chrome");
    }


    @Test(priority = 1)
    public void verifyProduct() {
        Home home = new Home(webDriver);
        Login login = new Login(webDriver);
        home.openLoginPage();
        login.Login("baranivasan2002@gmail.com", "Barani24");
        login.verifyLoginSuccess("Baranivasan");
        home.lnk_Products.click();
        Products product = new Products(webDriver);
        product.clickViewProduct();
        product.verifyAvailabiliy("Availability: In Stock");
    }

    @Test(priority = 2)
    public void addToCart() {
        Products product = new Products(webDriver);

        product.addtocart();
        product.verifyaddtocart();
    }


    @AfterTest
    public void quitBrowser() {
        quitDriver();
    }
}
