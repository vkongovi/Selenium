package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.IOException;

public class TC_SalesForce extends reuseableMethods{


    public static void main(String[] arg) throws InterruptedException, IOException, AWTException {
        // String pathName="C:\\Vinaya\\Selenium\\src\\SalesForce\\data.xls";
        // String sheetName="Sheet1";
        // String[][] data = reuseMethod.readExcelData(pathName,sheetName);

        TC01_LoginScenario();
    }


    public static  void TC01_LoginScenario() throws AWTException, InterruptedException {
        //reuseableMethods reuseMethod = new reuseableMethods();
        String urlName = "https://login.salesforce.com/";
        String userName = "vinayakongovi-kxv1@force.com";
        String password = "mysalesforce@2019";
        boolean flag = false;

        driverInitialization();
        driver.get("https://login.salesforce.com/");
        flag=webPageAccess(urlName);
        //flag=reuseMethod.webPageAccess(data[0][0]);

        //To send values to input text boxes on a webpage
        WebElement we_uname=driver.findElement(By.id("username"));
        timeDelay(500);
        sendInputValue(we_uname,userName);
        //reuseMethod.sendInputValue(we_uname,data[1][1]);

        WebElement we_password=driver.findElement(By.id("password"));
        timeDelay(500);
        sendInputValue(we_password,password);
        //reuseMethod.sendInputValue(we_uname,data[2][1]);


        //click a button - submit form
        WebElement we_Btn_login=driver.findElement(By.id("Login"));
        timeDelay(2000);
        clickButtonName(we_Btn_login);
        timeDelay(5000);
        //reuseMethod.pressEscape();
        pressEscape();

        //click on home tab to see if popup window occurs
        driver.findElement( By.xpath(".//*//li[@id='home_Tab']")).click();
    }

}
