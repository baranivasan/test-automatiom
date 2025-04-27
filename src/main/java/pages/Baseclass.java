package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {

    public static WebDriver driver;

    public void openBrowser(String browserName){
        switch (browserName.toUpperCase()){
            case "CHROME":
                chrome();
                break;
            case "EDGE":
                edge();
                break;
        }
    }

    public void chrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void edge(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
}
