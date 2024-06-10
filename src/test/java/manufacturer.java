
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
import java.util.UUID;


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


    @Test(groups = {"New_Manufacturer"}, priority = 14)
    void New_Manufacturer() throws InterruptedException {

        driver.findElement(By.xpath("(//button[@class='ant-btn css-42nv3w ant-btn-default bg-blue-700 text-white'])[1]")).click(); // Click on Add New button
        Thread.sleep(2000);


        // Provide mendatory option for new manufacturer

        Set<String> Handles = driver.getWindowHandles();
        for (String Handle : Handles) {
            String Handle1 = "Add New Manufacturer";
            if (!Handle.equals(Handle1)) {
                driver.switchTo().window(Handle);
                System.out.println(Handle);

                String uuid = UUID.randomUUID().toString(); // Genearte Random text

                driver.findElement(By.xpath("(//input[@id='name'])[2]")).sendKeys(uuid); //  Send values to the find
                Thread.sleep(2000);
                driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();  // Click on reset button

                driver.findElement(By.xpath("(//input[@id='name'])[2]")).sendKeys(uuid); //  Send values to the find
                Thread.sleep(2000);

                driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); //  Click on submit button
                Thread.sleep(2000);


            }


        }
    }


        @Test(groups = {"Search_manufacture_byName"}, priority = 16)
        void Search_manufacture_byName () throws InterruptedException {

            driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("\n" + "Honda"); // Search by name
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click(); // click filter Button
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button[class='ant-btn css-42nv3w ant-btn-default ant-btn-dangerous']")).click(); // reset button
            Thread.sleep(2000);
        }

        @Test(groups = {"Search_manufacture_byName_Enterkey"}, priority = 17)
        void Search_manufacture_byName_Enterkey () throws InterruptedException {

            driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("\n" +
                    "Honda"); // Search by name
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys(Keys.ENTER); // Clicking the enter key
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button[class='ant-btn css-42nv3w ant-btn-default ant-btn-dangerous']")).click(); // reset button
            Thread.sleep(2000);
        }


        @Test(groups = {"Click_Active_Inactive_Tab"}, priority = 15)
        void Click_Active_Inactive_Tab () throws InterruptedException {

            driver.findElement(By.xpath("(//div[@class='ant-tabs-tab'])[1]")).click();  // Click on inactive tab
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//td[@class='ant-table-cell'])[3]")).click();  // Click on three dot button
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[1]")).click();  // Perform active from inactive
            Thread.sleep(2000);

            Set<String> Handles = driver.getWindowHandles();
            for (String Handle : Handles) {
                String Handle1 = "Are you sure, want to change status?";
                if (!Handle.equals(Handle1)) {
                    driver.switchTo().window(Handle);
                    System.out.println(Handle);
                    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click(); // Click on Yes button
                    Thread.sleep(2000);
                }
            }


            // Switch to Active tab

            driver.findElement(By.xpath("(//div[@class='ant-tabs-tab'])[1]")).click();  // Perform inactive from active
            Thread.sleep(2000);

            driver.findElement(By.xpath("(//div[@class='ant-dropdown-trigger cursor-pointer'])[1]")).click();  // Click on three dot button
            Thread.sleep(2000);

            driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[1]")).click();  // Perform active from inactive
            Thread.sleep(2000);

            // Set<String> Handles=driver.getWindowHandles();
            for (String Handle : Handles) {
                String Handle1 = "Archieve";
                if (!Handle.equals(Handle1)) {
                    driver.switchTo().window(Handle);
                    System.out.println(Handle);
                    driver.findElement(By.xpath("(//input[@id='name'])[2]")).sendKeys("1"); // change name
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); // Click on  Submit button
                    Thread.sleep(2000);
                }
            }


            // Perform archive action

            driver.findElement(By.xpath("(//div[@class='ant-dropdown-trigger cursor-pointer'])[1]")).click();  // Click on three dot button
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[2]")).click();  // Perform active from inactive
            Thread.sleep(2000);

            // Set<String> Handles=driver.getWindowHandles();
            for (String Handle : Handles) {
                String Handle1 = "Update Manufacturer";
                if (!Handle.equals(Handle1)) {
                    driver.switchTo().window(Handle);
                    System.out.println(Handle);
                    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click(); // Archieve Confirmation
                    Thread.sleep(2000);

                }


            }


        }


    }


