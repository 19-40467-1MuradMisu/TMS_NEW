
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


public class vehicle extends manufacturer {
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


    @Test(groups = {" Vehicle_click"}, priority = 18)
    void vehicle_click() throws InterruptedException {

        driver.findElement(By.xpath("(//div[@role='menuitem'])[2]")).click(); // click on configuration menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[normalize-space()='Vehicles'])[1]")).click(); // click on vehicle menu
        Thread.sleep(2000);
    }

    @Test(groups = {"create_new_vehicle"}, priority = 18)
    void create_new_vehicle() throws InterruptedException {







        driver.findElement(By.xpath("(//button[@class='ant-btn css-42nv3w ant-btn-default bg-blue-700 text-white'])[1]")).click(); //  Click on Add new button
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[1]")).click(); // click on manufacturer option
        Thread.sleep(2000);
        WebElement  manufacturer= driver.findElement(By.xpath("(//div[@title='Honda'])[1]"));
        manufacturer.click(); // Select the desired element from dropdown menu
        Thread.sleep(2000);
        String uuid = UUID.randomUUID().toString();   // Generate random value

        driver.findElement(By.xpath("(//input[@id='brtaInfo_licenseNo'])[1]")).sendKeys(uuid); // click on manufacturer option
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='basicInfo_model'])[1]")).sendKeys(uuid); // provide year for model
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='basicInfo_yearModel'])[1]")).sendKeys("2016"); // provide year for model
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[2]")).click(); // click on Vehicle_Type option
        Thread.sleep(2000);
        WebElement  Vehicle_Type = driver.findElement(By.xpath("(//div[@title='PREMIO '])[1]"));
        Vehicle_Type.click(); // Select the desired element from dropdown menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='basicInfo_age'])[1]")).sendKeys("5"); // provide age
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='basicInfo_engineNo'])[1]")).sendKeys(uuid); // provide  Engine Number
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='basicInfo_chassisNo'])[1]")).sendKeys(uuid); // provide  Chassis Number
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='basicInfo_passengerCapacity'])[1]")).sendKeys("5"); // provide passenger capacity
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='basicInfo_loadCapacity'])[1]")).sendKeys("5000"); // provide loadcapacity
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='basicInfo_fuelTypeId'])[1]")).click(); //  click on fuel type
        Thread.sleep(2000);

        WebElement fuel_type = driver.findElement(By.xpath("(//div[contains(text(),'Petrol')])[1]"));
        fuel_type.click(); // select fuel type
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='basicInfo_statusId'])[1]")).click(); //  click on Status
        Thread.sleep(2000);

        WebElement status = driver.findElement(By.xpath("(//div[contains(text(),'IN SERVICE')])[1]"));
        status.click(); // select  status
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='basicInfo_inclusionDate'])[1]")).click(); //  click on fleet Inclusion date
        Thread.sleep(2000);

        WebElement Fleet_Inclusion_Date = driver.findElement(By.xpath("(//a[normalize-space()='Today'])[1]"));
        Fleet_Inclusion_Date.click(); // select  status
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[@class='ant-btn css-42nv3w ant-btn-primary'])[1]")).click(); //  click on next button
        Thread.sleep(2000);



        // BRTA Information

        driver.findElement(By.xpath("(//input[@id='brtaInfo_licenseExpiry'])[1]")).click(); //  click on Expiry date
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='2024'])[2]")).click(); //  click on year to select
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[normalize-space()='2025'])[1]")).click(); //  Select desired year
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[normalize-space()='Jun'])[1]")).click(); //  Select desired month
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner'][normalize-space()='12'])[2]")).click(); //  Select desired date
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='brtaInfo_fitnessNo'])[1]")).sendKeys("Very Good"); //   Provide fitness
        Thread.sleep(2000);



        driver.findElement(By.xpath("(//input[@id='brtaInfo_fitnessExpiry'])[1]")).click(); //  click on year to select
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='2024'])[2]")).click(); //  click on year to select
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[normalize-space()='2025'])[1]")).click(); //  Select desired year
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[normalize-space()='Jun'])[1]")).click(); //  Select desired month
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[contains(text(),'12')])[4]")).click(); //  Select desired date
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='brtaInfo_routePermit'])[1]")).sendKeys("MNJG7398"); //   provide route permit
        Thread.sleep(2000);



        driver.findElement(By.xpath("(//input[@id='brtaInfo_routePermitExpiry'])[1]")).click(); //  Select desired date
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='2024'])[3]")).click(); //  click on year to select
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[normalize-space()='2025'])[1]")).click(); //  Select desired year
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[normalize-space()='Jun'])[1]")).click(); //  Select desired month
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[contains(text(),'12')])[5]")).click(); //  Select desired date
        Thread.sleep(2000);















    }






}





