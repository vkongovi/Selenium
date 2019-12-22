package SalesForce;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class reuseableMethods  {
    static WebDriver driver;
    //static ExtentReports reports;
    //static ExtentTest log;

    //Method Name : driverInitialization
    //Input Parameter : None
    //Output Parameter : None
    public  static void driverInitialization() {
        System.setProperty("webdriver.chrome.driver", "C:\\Vinaya\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //opening a URL :To check if webPage is accessible
    //Input Parameter :  url being accessed - this could be difference from the title
    //Output Parameter : boolean
    public  static boolean webPageAccess(String url) throws InterruptedException {
        boolean flag = false;
        String actualTitle;
        driver.get( url );
        Thread.sleep( 2000 );
        System.out.println( "Argument passed is :" + url );
        System.out.println( "Actual Title of page accessed is:" + driver.getTitle() );
        actualTitle = driver.getTitle();
        if (url == actualTitle)
            flag = true;
        else
            flag = false;
        return flag;
    }

    //Method to click a link on a page
    //Input Parameter : WebElement - <a> link to be clicked
    //Output Parameter : None
    public  static void actionClickLink(WebElement we_object) {
        System.out.println( "Clicking the link/tab : "+we_object );
        we_object.click();
    }


    //method to enter values to a input text field on a web page
    //Input Parameter : WebElement Name, Value to be entered in the webelement
    //Output Parameter : None
    public static void sendInputValue(WebElement webObject, String value) {
        System.out.println( "Value to be entered for : " + webObject );
        System.out.println("value entered is : "+value);
        webObject.sendKeys( value );

    }

    //method to enter values to a read text field from a web page
    //Input Parameter : WebElement Name, Value to be entered in the webelement
    //Output Parameter : None

    public static String getTextValue(WebElement webObject){
        String textValueis;
        textValueis=webObject.getText();
        System.out.println("Value entered for : "+webObject);
        System.out.println("Stored value is "+textValueis);
        return textValueis;
    }
    //method to click a button
    //Input Parameter : WebElement
    //Output Parameter : None
    public  static void clickButtonName(WebElement webObject) {
        System.out.println("Clicking the button/image : "+webObject);
        webObject.click();

    }

    //method to read selected item from a dropdown
    //Input Parameter : WebElement
    //Output Parameter : String - value from the dropdown
    public static String selectedItem(WebElement webObject){
        String chosenValue;
        Select chosenItem = new Select(webObject);
        WebElement ListObject = chosenItem.getFirstSelectedOption();
        chosenValue=webObject.getText();
        System.out.println("The item chosen from "+webObject+" is : "+chosenValue);
        return chosenValue;
    }

    //method to read from an external file using the poi jar file to read .xls file
    //Input Parameter : Pathname , SheetName
    //Output Parameter : String matrix - to read authentication details

   /* public static String[][] readExcelData(String pathName, String sheetName) throws IOException {
//Create an object of FileInputStream class to read excel file
        FileInputStream fs = new FileInputStream( new File(pathName) );
        //If it is xls file then create object of HSSFWorkbook class
        HSSFWorkbook wb = new HSSFWorkbook( fs );
        //Read sheet inside the workbook by its name
        HSSFSheet sheet = wb.getSheet(sheetName);
        //getting no of rows
        int rowCount = sheet.getLastRowNum() + 1;
        System.out.println( rowCount );
        //getting no of column
        int colCount = sheet.getRow( 0 ).getLastCellNum();
        System.out.println( colCount );
//        Storing rowcount and colcount in string Array
        String[][] data = new String[rowCount][colCount];
//       checking weather the data is numeric or string
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                int cellType = sheet.getRow( i ).getCell( j ).getCellType();
                if (cellType == HSSFCell.CELL_TYPE_NUMERIC) {
                    int val = (int) sheet.getRow( i ).getCell( j ).getNumericCellValue();
                    data[i][j] = String.valueOf( val );
                } else
                    data[i][j] = sheet.getRow( i ).getCell( j ).getStringCellValue();
            }
        }
//Create a loop to print cell values in a row
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {

                System.out.print( data[i][j] + " " );
            }
            System.out.println();
        }
        return data;
    }*/

    //method to press escape button
    //Input Parameter :
    //Output Parameter :
    public  static void pressEscape() throws AWTException {
        Robot rbt = new Robot();
        rbt.keyPress( KeyEvent.VK_ESCAPE );
        rbt.keyRelease( KeyEvent.VK_ESCAPE );
    }

    //method to close driver
    //Input Parameter : None
    //Output Parameter : None
    public  static void closeDriver() {
        driver.close();
    }

    //Method to wait for page download/time delay
    //Input Parameter : int
    //Output Parameter : None
    public  static void timeDelay(int milleSecond) throws InterruptedException {
        Thread.sleep( milleSecond );
    }
}

