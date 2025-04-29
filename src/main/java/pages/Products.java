package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.Baseclass;

import static pages.Baseclass.scrollIntoWebElement;
import static pages.Baseclass.waitForElementTobeClickable;

public class Products {

    public Products(WebDriver driver) {
        Baseclass.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement lnk_Viewproduct;
    @FindBy(xpath = "//p[contains(.,'Availability')]")
    public WebElement wbl_availability;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement btn_addtocart;

    @FindBy(xpath = "//h4[@class='modal-title w-100']")
    public WebElement addtocart_modeltitle;

    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement lnk_viewcart;


    public void clickViewProduct(){
        waitForElementTobeClickable(lnk_Viewproduct);
        scrollIntoWebElement(lnk_Viewproduct);
        lnk_Viewproduct.click();
    }

    public void addtocart(){
        waitForElementTobeClickable(btn_addtocart);
        scrollIntoWebElement(btn_addtocart);
        btn_addtocart.click();
    }

    public void verifyaddtocart(){
        waitForElementTobeClickable(lnk_viewcart);
        scrollIntoWebElement(addtocart_modeltitle);
        Assert.assertEquals(addtocart_modeltitle.getText().trim(),"Added!");
    }



    public void verifyAvailabiliy(String Availability) {
        String avialability = wbl_availability.getText().trim();
        Assert.assertEquals(avialability, Availability);
    }




}
