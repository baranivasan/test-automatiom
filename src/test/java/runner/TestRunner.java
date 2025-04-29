package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import pages.Baseclass;
import pages.Home;
import pages.Login;

import static pages.Baseclass.driver;
import static pages.Baseclass.openBrowser;

//@CucumberOptions(
//    features = "src/test/resources/features",
//    glue= {"stepDefinitions"},
//    plugin={"pretty"},
//    tags="test"
//)

//public class TestRunner extends AbstractTestNGCucumberTests {
////     a
//}
public class TestRunner {
    //    public static WebDriver driver;
    public static void main(String[] args) {


        try {
            WebDriver webDriver = openBrowser("Chrome");
            Home home = new Home(webDriver);
            Login login = new Login(webDriver);
//            home.launchApplication();
            home.openLoginPage();
            login.Login("baranivasan2002@gmail.com", "Barani24");
            login.verifyLoginSuccess("Baranivasa");

        }
        finally {
            Baseclass.quitDriver();
        }
    }
}

