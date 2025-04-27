package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import pages.Home;

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

    public static void main(String[] args) {
        Home home = new Home();
        home.launchApplication();
    }
}

