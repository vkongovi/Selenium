package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_Logout extends reuseableMethods {
    //Class to test logout click

    public static void main(String[] arg) {
        WebElement we_linkClicked = driver.findElement( By.linkText( "Logout" ) );
        we_linkClicked.click();

    }

}
