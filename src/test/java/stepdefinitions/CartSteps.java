package stepdefinitions;

import io.cucumber.java.en.And;
import pages.Baseclass;
import pages.Cart;

public class CartSteps  extends Baseclass {

     Cart cart = new Cart(driver);
    @And("user verify the item price")
    public void userVerifyTheItemPrice() {
        cart.verifycartprice("Rs. 500");
    }
}
