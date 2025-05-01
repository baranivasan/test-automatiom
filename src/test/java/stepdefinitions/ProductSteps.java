package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Baseclass;
import pages.Products;

public class ProductSteps extends Baseclass {

    Products products= new Products(driver);
    @Given("user added the item in cart")
    public void userAddedTheItemInCart() {
        products.addtocart();
    }

    @Then("user click on view product link")
    public void userClickOnViewProductLink() {
        products.clickViewProduct();
    }


    @Then("user click the view cart")
    public void userClickTheViewCart() {
        products.lnk_viewcart.click();
    }


}
