package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class TC11_Createnewview extends reuseableMethods {

public static void main(String[] args) throws InterruptedException, AWTException {
        TC_SalesForce.TC01_LoginScenario();//login to salesforce
        Createnewview();

}

    public static void Createnewview() throws InterruptedException {
        WebElement webelement_Object;

        //click on Accounts tab
        //webelement_Object=driver.findElement( By.xpath(".//*//li[@id='Account_Tab']"));
        webelement_Object=driver.findElement( By.id("Account_Tab"));
        actionClickLink( webelement_Object);
        timeDelay(2000);

        //click on Create new view link
        webelement_Object=driver.findElement( By.linkText("Create New View"));
        actionClickLink(webelement_Object);
        timeDelay(2000);

        //input[@name='fname']
        //input[@name='devname']
        int i=0;
        String viewname="QA Se1 view1";
       // webelement_Object=driver.findElement(By.xpath("//input[@name='fname']"));
        webelement_Object=driver.findElement(By.name("fname"));
        sendInputValue(webelement_Object,viewname);
        timeDelay( 3000 );
       /* String viewnameKey=viewname+"_Unique"+i++;

        driver.findElement(By.xpath("//input[@name='devname']")).sendKeys( viewnameKey );
        timeDelay( 3000 );*/

       // webelement_Object=driver.findElement( By.xpath("//input[@name='save']"));
        webelement_Object=driver.findElement( By.name("save"));
        actionClickLink(webelement_Object);
    }
}
