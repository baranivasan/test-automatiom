package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.Baseclass;

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


    public void clickViewProduct(){
        waitForElementTobeClickable(lnk_Viewproduct);
        lnk_Viewproduct.click();
    }

    public void verifyAvailabiliy(String Availability) {
        String avialability = wbl_availability.getText().trim();
        Assert.assertEquals(avialability, Availability);

    }


}
