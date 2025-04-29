package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Baseclass;
import pages.Home;
import pages.Login;

public class LoginSteps extends Baseclass {

    Home home = new Home(driver);
    Login login = new Login(driver);
    @Given("user launch automation exercise")
    public void userLaunchApplication(){
        home.launchApplication();
    }

    @Then("user click on login link")
    public void userClickOnLoginLink() {
        home.clickLoginPage();
    }

    @And("user enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String username, String password) {
        login.Login(username,password);
    }

    @Then("user verify {string} logged in successfully")
    public void userVerifyLoggedInSuccessfully(String username) {
        login.verifyLoginSuccess(username);
    }


    @And("user verify {string} in login page")
    public void userVerifyInLoginPage(String errorMessage) {
        String actualErrorMessage = login.loginErrorMessage.getText().trim();
        Assert.assertEquals(actualErrorMessage,errorMessage);
    }
}
