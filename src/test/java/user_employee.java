
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
import java.util.Set;


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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement File1= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ant-upload.ant-upload-select")));

        driver.findElement(By.cssSelector(".ant-upload.ant-upload-select")).click(); // This will click on that upload button
        Thread.sleep(2000);


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

    @Test(groups = {"New_Employee"}, priority = 11)
    void  Add_new_Employee() throws InterruptedException {

        driver.findElement(By.xpath("(//button[@class='ant-btn css-42nv3w ant-btn-default bg-blue-700 text-white'])[1]")).click(); // Click on Add New button
        Thread.sleep(2000);


        // Provide mendatory option for employee
        driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("Habibur"); // Employee name
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='employeeId'])[1]")).sendKeys("Habib-US-99"); // Employee ID
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='designationId'])[1]")).click(); // Designation field click
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='designationId'])[1]")).click(); // Designation field click
        Thread.sleep(2000);
        WebElement designation = driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'][normalize-space()='QA'])[1]"));
        designation.click(); // click on the designation

        driver.findElement(By.xpath("(//input[@id='phoneNumber'])[1]")).sendKeys("017987937436"); //Provide phone number






    }







    @Test(groups = {"Employee_ActionButton"}, priority = 12)
    void Employee_ActionButton() throws InterruptedException {
//    Edit operation

//    driver.findElement(By.cssSelector("li[title='2']")).click(); // Go to 2nd page
        driver.findElement(By.xpath("(//div[@class='ant-dropdown-trigger cursor-pointer'])[1]")).click(); // Click on three dot button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/transport/employee/update/23']")).click(); // Click on edit buttons
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")).click(); // Click on the selection bar
        Thread.sleep(2000);

        WebElement designation = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]")); // Select another designation for editing
        designation.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click(); //  Submit the edit form
        Thread.sleep(2000);

//   Delete Operation

        driver.findElement(By.xpath("(//div[@class='ant-dropdown-trigger cursor-pointer'])[4]")).click(); // Click on three dot button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("li[class='ant-dropdown-menu-item'] span[class='ml-2']")).click(); // Click on delete button
        Thread.sleep(2000);
        // handle the popup window
        Set<String> Handles=driver.getWindowHandles();
        for (String Handle : Handles) {
            String Handle1 = "Are you sure, want to delete?";
            if(!Handle.equals(Handle1)) {
                driver.switchTo().window(Handle);
                System.out.println(Handle);
                driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/button[1]")).click(); // Click on no button
                //System.out.println(Handle);
                Thread.sleep(5000);


            }
        }

    }

}


