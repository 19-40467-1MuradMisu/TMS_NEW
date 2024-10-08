
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




public class workshop extends vehicle {
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


    @Test(groups = {"workshop_click"}, priority = 19)
    void workshop_click() throws InterruptedException {

        driver.findElement(By.xpath("(//div[@role='menuitem'])[2]")).click(); // click on configuration menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[normalize-space()='Workshop'])[1]")).click(); // click on vehicle menu
        Thread.sleep(2000);
    }

    @Test(groups = {"create_new_workshop"}, priority = 20)
    void create_new_workshop() throws InterruptedException {

        // 2 lines below should be omitted
        driver.findElement(By.xpath("(//div[@role='menuitem'])[2]")).click(); // click on configuration menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[normalize-space()='Workshop'])[1]")).click(); // click on vehicle menu
        Thread.sleep(2000);






        driver.findElement(By.xpath("(//button[@class='ant-btn css-42nv3w ant-btn-default bg-blue-700 text-white'])[1]")).click(); //  Click on Add new button
        Thread.sleep(2000);

        String uuid = UUID.randomUUID().toString(); //Generate for random value
        driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys(uuid); // provide name for workshop
        Thread.sleep(2000);



        driver.findElement(By.xpath("(//input[@id='location'])[1]")).sendKeys("Uttara-1, Dhaka"); // click on manufacturer option
        Thread.sleep(2000);



        driver.findElement(By.xpath("(//input[@id='workshopTypeById'])[1]")).click(); // click on Workshop_Type option
        Thread.sleep(2000);
        WebElement  Workshop_Type = driver.findElement(By.xpath("(//div[contains(text(),'OUTSIDE GARAGE')])[1]"));
        Workshop_Type.click(); // Select the desired element from dropdown menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='startTime'])[1]")).sendKeys("23:07:14"); // Provide working hour [From]
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/form/div[1]/div[5]/div/div[2]/div/div/div/div/input")).sendKeys("12:09:20"); // Provide working hour [To]
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[contains(text(),'OK')])[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='contactNo'])[1]")).sendKeys("+8801873636367"); // Provide Contact No
        Thread.sleep(2000);

        //driver.findElement(By.xpath("(//textarea[@id='address'])[1]")).sendKeys("Dhaka,Bangladesh"); // Provide Contact No
       //Thread.sleep(2000);

        String uuid1 = UUID.randomUUID().toString(); //Generate for random value
        driver.findElement(By.xpath("(//textarea[@id='address'])[1]")).sendKeys(uuid1); // provide address for workshop
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[normalize-space()='Submit'])[1]")).click(); // Click submit button
        Thread.sleep(2000);





        }


    @Test(groups = {"Reset_workshop"}, priority = 21)
    void Reset_workshop() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@role='menuitem'])[2]")).click(); // click on configuration menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[normalize-space()='Workshop'])[1]")).click(); // click on vehicle menu
        Thread.sleep(2000);






        driver.findElement(By.xpath("(//button[@class='ant-btn css-42nv3w ant-btn-default bg-blue-700 text-white'])[1]")).click(); //  Click on Add new button
        Thread.sleep(2000);

        String uuid = UUID.randomUUID().toString(); //Generate for random value
        driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys(uuid); // provide name for workshop
        Thread.sleep(2000);



        driver.findElement(By.xpath("(//input[@id='location'])[1]")).sendKeys("Uttara-1, Dhaka"); // click on manufacturer option
        Thread.sleep(2000);



        driver.findElement(By.xpath("(//input[@id='workshopTypeById'])[1]")).click(); // click on Workshop_Type option
        Thread.sleep(2000);
        WebElement  Workshop_Type = driver.findElement(By.xpath("(//div[contains(text(),'OUTSIDE GARAGE')])[1]"));
        Workshop_Type.click(); // Select the desired element from dropdown menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='startTime'])[1]")).sendKeys("23:07:14"); // Provide working hour [From]
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[normalize-space()='OK'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/form/div[1]/div[5]/div/div[2]/div/div/div/div/input")).sendKeys("12:09:20"); // Provide working hour [To]
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[contains(text(),'OK')])[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='contactNo'])[1]")).sendKeys("+8801873636367"); // Provide Contact No
        Thread.sleep(2000);

        //driver.findElement(By.xpath("(//textarea[@id='address'])[1]")).sendKeys("Dhaka,Bangladesh"); // Provide Contact No
        //Thread.sleep(2000);

        String uuid1 = UUID.randomUUID().toString(); //Generate for random value
        driver.findElement(By.xpath("(//textarea[@id='address'])[1]")).sendKeys(uuid1); // provide address for workshop
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[normalize-space()='Reset'])[1]")).click();
        Thread.sleep(2000);
    }


       /*
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


*/







    }












