package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static pages.Baseclass.openBrowser;
import static pages.Baseclass.quitDriver;

@CucumberOptions(
        glue = "stepdefinitions",
        features = "src/test/resources/features",
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@AutomationExercise"
)
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
    @BeforeSuite
    public void setUp() {
        openBrowser("Chrome");
    }

    @AfterSuite
    public void tearDown() {
        quitDriver();
    }

}
