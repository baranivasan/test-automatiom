package pages;

import org.openqa.selenium.WebDriver;

public class Home extends Baseclass {


    public Home(){

    }


    public void launchApplication(){
        openBrowser("Edge");
        driver.get("https://www.automationexercise.com/");
    }


}
