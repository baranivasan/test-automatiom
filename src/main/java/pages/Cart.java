package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart {

    public Cart(WebDriver driver){
        Baseclass.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[@class='cart_price']")
    public WebElement cartprice;

    public void verifycartprice(String Price){
        String price= cartprice.getText().trim();
        Assert.assertEquals(price,Price);
    }
}
