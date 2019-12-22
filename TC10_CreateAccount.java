package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class TC10_CreateAccount extends reuseableMethods {
    static String[] account_names={"Test QA","Test qa"};
    public static void main(String[] arg) throws InterruptedException, AWTException {
        TC_SalesForce.TC01_LoginScenario();
        CreateAccount();

    }

    public static void CreateAccount() throws InterruptedException {
            WebElement webelement_Object;
        //click on Accounts tab
        //webelement_Object=driver.findElement( By.xpath(".//*//li[@id='Account_Tab']"));
        webelement_Object=driver.findElement( By.id("Account_Tab"));
        timeDelay(2000);
        actionClickLink( webelement_Object );

        //click on New button
        //webelement_Object=driver.findElement( By.xpath("//input[@name='new']"));
        webelement_Object=driver.findElement( By.name("new"));
        timeDelay(2000);
        clickButtonName( webelement_Object );

        //enter value for account name field
        int i = 0;
        String account_name=account_names[0]+":"+i++;
        System.out.println(account_name);
       // webelement_Object=driver.findElement( By.xpath("//input[@id='acc2']"));
        webelement_Object=driver.findElement( By.id("acc2"));
        sendInputValue(webelement_Object,account_name);

        //creating another one - so click on save and new
       // webelement_Object=driver.findElement( By.xpath("//input[@name='save_new']"));
        webelement_Object=driver.findElement( By.name("save_new"));
        clickButtonName(webelement_Object);

        timeDelay( 4000 );
        account_name=account_names[1]+":"+i++;
        System.out.println(account_name);
        //webelement_Object=driver.findElement( By.xpath("//input[@id='acc2']"));
        webelement_Object=driver.findElement( By.id("acc2"));
        sendInputValue(webelement_Object,account_name);

        timeDelay( 3000 );
        //webelement_Object=driver.findElement( By.xpath("//input[@name='save']"));
        webelement_Object=driver.findElement( By.name("save"));
        clickButtonName(webelement_Object);
        timeDelay( 4000 );
        i=+1;
    }
}
