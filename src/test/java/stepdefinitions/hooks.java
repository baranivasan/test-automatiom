package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.Baseclass;

public class hooks extends Baseclass {

    @Before
    public void beforeScenario(Scenario scenario){
            driver.manage().deleteAllCookies();
    }

    @After
    public void afterScenario(Scenario scenario){
        scenario.attach(takeScreenShot(),"image/png","ScreenShot");
    }
}
