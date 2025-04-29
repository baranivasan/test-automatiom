package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static pages.Baseclass.*;

public class Home  {


  
    public Home(WebDriver driver){
        Baseclass.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@href='/login']")
    public WebElement lnk_Login;

    @FindBy(xpath = "//a[contains(.,'Products')]")
    public WebElement lnk_Products;


    public void launchApplication(){

        driver.get("https://www.automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        waitForElementTobeClickable(lnk_Login);
//        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
    }
    
    public void openLoginPage(){
        launchApplication();
        lnk_Login.click();
    }




}
