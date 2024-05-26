
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class user_employee extends base {
   // WebDriver driver;
    login loginInstance;

@BeforeClass
public void loginIfNeeded() throws InterruptedException {
    login loginInstance = login.getInstance();
    if (!loginInstance.isLoggedIn()) {
        loginInstance.driver = this.driver;
        loginInstance.view_web_page_of_TMS();
        loginInstance.login();
    }
}

//    login login = login.getInstance();
//
//    // Call login only once
//        if (!login.isloggedIn()) {
//        login.login();
//    }

    @Test(groups = {"user_employer_click_(Users_Employee)"}, priority = 3)
    void click_user_employee() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/aside/div[1]/ul/li[1]/div/span")).click(); // click on users menu
        Thread.sleep(2000);

       driver.findElement(By.xpath("/html/body/div/div/aside/div[1]/ul/li[1]/ul/li/span")).click(); // click on employee menu
       Thread.sleep(2000);
    }


    @Test(groups = {"Search_Employee_details_byName"}, priority = 4)
    void Search_Employee_details_byName() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys("\n" + "misu_qa5"); // Search by name
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/form/div/div[2]/div/div/div/div/div/div/div[1]/button")).click(); // click filter Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/form/div/div[2]/div/div/div/div/div/div/div[2]/button")).click(); // reset button
        Thread.sleep(2000);
    }

    @Test(groups = {"Search_Employee_details_byName_Enterkey"}, priority = 5)
    void Search_Employee_details_byName_Enterkey() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys("\n" +
                "misu_qa5"); // Search by name
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys(Keys.ENTER); // Clicking the enter key
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/form/div/div[2]/div/div/div/div/div/div/div[2]/button")).click(); // reset button
        Thread.sleep(2000);
    }


    @Test(groups = {"Search_Employee_details_byId"}, priority = 6)
    void Search_Employee_details_byId() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys( "\n" +
                "\n" + "TN-999995"); // Search by id
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).click(); // click filter Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/form/div/div[2]/div/div/div/div/div/div/div[2]/button")).click(); // reset button
        Thread.sleep(2000);
    }


    @Test(groups = {"Search_Employee_details_byId_Enterkey"}, priority = 7)
    void Search_Employee_details_byId_Enterkey() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys("\n" +
                "TN-999995"); // Search by employeeid
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys(Keys.ENTER); // Clicking the enter key
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/form/div/div[2]/div/div/div/div/div/div/div[2]/button")).click(); // reset button
        Thread.sleep(2000);
    }

    @Test(groups = {"Employee_Demo_File_Download"}, priority = 8)
    void Employee_Demo_File_Download() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/div[1]/div/button[1]")).click(); // Click on downlaod button
        Thread.sleep(2000);
    }

    @Test(groups = {"Employee_File_Upload"}, priority = 9)
    void Employee_File_Upload() throws InterruptedException {
        Thread.sleep(2000);
//         driver.findElement(By.cssSelector(".ant-upload.ant-upload-select")).click(); // This will click on that upload button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement File1= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ant-upload.ant-upload-select")));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", File1);
//
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", File1);
//        Thread.sleep(500); // give a small delay to ensure scrolling is done
//
//        // Click on the element using JavaScript Executor
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", File1);
//        Thread.sleep(2000); // Wait for the file chooser dialog to open
//      //String filename="";
        driver.findElement(By.cssSelector(".ant-upload.ant-upload-select")).click(); // This will click on that upload button
        Thread.sleep(2000);

//      File1.sendKeys("D://sample.xlsx");// Click on upload button and upload Excel file
//        Thread.sleep(2000);
        try {
            Thread.sleep(2000);  // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Use Robot class to handle the file dialog
        try {
            Robot robot = new Robot();

            // Set the file path to the clipboard
            String filePath = "D:\\sample.xlsx";
            StringSelection selection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

            // Press Ctrl+V to paste the file path
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Press Enter to confirm the file selection
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }

        // Optional: Wait to see the result and close the browser
        try {
            Thread.sleep(2000);  // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


