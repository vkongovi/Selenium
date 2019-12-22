package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.SocketOption;
import java.util.List;

public class ApplicationHomePage {

    public static void main(String[] arg)throws InterruptedException {
        try {
            String urlName = "https://www.salesforce.com/";
            boolean flag = false;
            reuseableMethods reuseMethod = new reuseableMethods();
            System.out.println(flag);
            int i = 0;
            flag = reuseMethod.webPageAccess(urlName);
            //click on login button
            //finding an item by partial linkText
            WebElement we_login = reuseMethod.driver.findElement(By.partialLinkText("Login"));
            reuseMethod.timeDelay(500);
            //simulate the click  of the hyperlink
            System.out.println(we_login);
            reuseMethod.actionClickLink(we_login);

            reuseMethod.timeDelay( 4000  );
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            reuseableMethods.driver.close();
        }
    }//end of main
}//end of class
