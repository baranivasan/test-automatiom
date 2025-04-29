package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static pages.Baseclass.driver;
import static pages.Baseclass.waitForElementTobeClickable;

public class Login {


    public Login(WebDriver driver){
        Baseclass.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement input_login_EmailAddress;


    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement input_login_Password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement btn_Login;

    @FindBy(xpath = "//a[contains(.,'Logged in as')]")
    public WebElement LoggedInUser;

    @FindBy(xpath = "//p[contains(.,'incorrect')]")
    public WebElement loginErrorMessage;

    public void Login(String emailAddress, String password){
        input_login_EmailAddress.sendKeys(emailAddress);
        input_login_Password.sendKeys(password);
        btn_Login.click();
    }

    public void verifyLoginSuccess(String userName){
        waitForElementTobeClickable(LoggedInUser);
        Assert.assertEquals(LoggedInUser.getText().trim(),"Logged in as "+ userName);
    }





}
