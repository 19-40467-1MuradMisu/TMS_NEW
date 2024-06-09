
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


public class manufacturer extends base {
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

    @Test(groups = {" manufacturer_click"}, priority = 13)
    void manufacturer_click() throws InterruptedException {

        driver.findElement(By.xpath("(//div[@role='menuitem'])[2]")).click(); // click on configuration menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'][normalize-space()='Manufacturer'])[1]")).click(); // click on employee menu
        Thread.sleep(2000);
    }


    @Test(groups = {"Search_manufacture_byName"}, priority = 14)
    void Search_manufacture_byName() throws InterruptedException {


        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div[3]/form/div/div[1]/div/div/div/div/div/input")).sendKeys("\n" + "TATA"); // Search by name
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[class='ant-space css-42nv3w ant-space-horizontal ant-space-align-center ant-space-gap-row-small ant-space-gap-col-small'] div:nth-child(1)")).click(); // click filter Button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='ant-btn css-42nv3w ant-btn-default ant-btn-dangerous']")).click(); // reset button
        Thread.sleep(2000);
    }

    @Test(groups = {"Search_manufacture_byName_Enterkey"}, priority = 15)
    void Search_manufacture_byName_Enterkey() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div[3]/form/div/div[1]/div/div/div/div/div/input")).sendKeys("\n" +
                "TATA"); // Search by name
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[class='ant-space css-42nv3w ant-space-horizontal ant-space-align-center ant-space-gap-row-small ant-space-gap-col-small'] div:nth-child(1)")).sendKeys(Keys.ENTER); // Clicking the enter key
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='ant-btn css-42nv3w ant-btn-default ant-btn-dangerous']")).click(); // reset button
        Thread.sleep(2000);
    }








    @Test(groups = {"Employee_ActionButton"}, priority = 10)
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
                //hello

            }
        }

    }

}


