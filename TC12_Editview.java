package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class TC12_Editview extends reuseableMethods {
    public static void main(String[] arg) throws InterruptedException, AWTException {
        TC_SalesForce.TC01_LoginScenario();//login to salesforce
        Editview();
    }

    public static void Editview() throws InterruptedException {
        WebElement webelement_Object;
        String selectedValue,newValue;

        webelement_Object=driver.findElement( By.id("Account_Tab"));
        actionClickLink( webelement_Object);

        timeDelay(2000);
        webelement_Object = driver.findElement(By.id("fcf"));
        timeDelay( 3000 );
        selectedValue=selectedItem( webelement_Object );
        System.out.println("View chosen is ::"+selectedValue);

        webelement_Object= driver.findElement(By.linkText( "Edit" ));
        actionClickLink( webelement_Object );
        timeDelay( 3000 );

        //--//span[@class='fFooter']//a[text()='Edit']
        webelement_Object = driver.findElement(By.name("fname"));
        if (selectedValue==webelement_Object.getText()){
            System.out.println("Selected was : "+selectedValue+" and view screen is displayed for : "+webelement_Object.getText());
        }
        else
            System.out.println("Error page ! View displayed is not matching!");

        //change view name
            newValue="UPD:"+selectedValue;
        webelement_Object=driver.findElement(By.name("fname"));
        sendInputValue(webelement_Object,newValue);
        timeDelay( 3000 );

        webelement_Object=driver.findElement( By.name("save"));
        actionClickLink(webelement_Object);


    }
}
