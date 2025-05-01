package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Baseclass;
import pages.Home;

public class HomeSteps extends Baseclass {

    Home home = new Home(driver);
    @And("user click on Product link")
    public void userClickOnProductLink() {
        home.lnk_Products.click();
    }


    @Then("user logout successfully")
    public void userLogoutSuccessfully() {
        home.logOut();
    }
}
