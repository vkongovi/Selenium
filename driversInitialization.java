package SalesForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driversInitialization {
    static WebDriver driver;

    //general method - without constructor - chromeBrowser
    //Input Parameter : None - consctructor
    //Output Parameter : None
    public  driversInitialization() {
        System.setProperty("webdriver.chrome.driver", "C:\\Vinaya\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //method to open application in the specified browser
    //Input Parameter : Browser Name as String
    //Output Parameter : None
    public void driversInitialization(String browserName){
        //yet to implement
    }
}