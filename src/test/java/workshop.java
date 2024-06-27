
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
import java.util.Random;
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
        WebElement Workshop_Type = driver.findElement(By.xpath("(//div[contains(text(),'OUTSIDE GARAGE')])[1]"));
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
        WebElement Workshop_Type = driver.findElement(By.xpath("(//div[contains(text(),'OUTSIDE GARAGE')])[1]"));
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


    @Test(groups = {"WorkShop_Search"}, priority = 22)
    void WorkShop_Search() throws InterruptedException {

        driver.findElement(By.xpath("(//div[@role='menuitem'])[2]")).click(); // click on configuration menu
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[@class='ant-menu-item-icon'])[5]")).click(); // click on Workshop
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("Basundhara"); // input to Search by name field
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='location'])[1]")).sendKeys("Basundhara"); // Input to location field
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='workshopType'])[1]")).click(); // Click on the workshop type field
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[contains(text(),'OUT STATION')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[normalize-space()='Filter'])[1]")).click();


    }

    @Test(groups = {"WorkShop_Edit"}, priority = 23)
    void WorkShop_Edit() throws InterruptedException {


            driver.findElement(By.xpath("(//div[@role='menuitem'])[2]")).click(); // click on configuration menu
            Thread.sleep(2000);

            driver.findElement(By.xpath("(//div[@class='ant-menu-item-icon'])[5]")).click(); // click on Workshop
            Thread.sleep(2000);

            driver.findElement(By.xpath("(//*[name()='svg'])[27]")).click(); // Click on the three dot menu
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[1]")).click(); // click on edit button
            Thread.sleep(2000);


            // Update "Name" field
            WebElement nameField = driver.findElement(By.xpath("(//input[@id='name'])[1]"));
            nameField.click();
            Thread.sleep(2000);
            nameField.sendKeys(Keys.chord(Keys.CONTROL, "a"));

            Thread.sleep(2000);
            nameField.sendKeys(Keys.BACK_SPACE); // Clear the selected text
            Thread.sleep(2000);
            nameField.sendKeys("Boshundora");
            Thread.sleep(2000);




            // Update "Location" field
            WebElement locationField = driver.findElement(By.xpath("(//input[@id='location'])[1]"));
            locationField.click();
            Thread.sleep(2000);

            locationField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            Thread.sleep(2000);
            locationField.sendKeys(Keys.BACK_SPACE); // Clear the selected text
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//input[@id='location'])[1]")).sendKeys("Dhaka");
            Thread.sleep(2000);


            //Workshop type dropdown selection
            WebElement dropdownElement = driver.findElement(By.xpath("(//input[@id='workshopTypeById'])[1]"));// Locate the dropdown element by its XPath
            Select dropdown = new Select(dropdownElement); // Create a Select object
            List<WebElement> options = dropdown.getOptions();

        // Generate a random index based on the number of options
        Random rand = new Random();
        int randomIndex = rand.nextInt(options.size());
        // Select the random option
        dropdown.selectByIndex(randomIndex);

        System.out.println("Selected option: " + options.get(randomIndex).getText());



              /*
            // Update "Working Hour (From)" field
            WebElement workingHourFromField = driver.findElement(By.xpath("(//div[@class='ant-picker ant-picker-outlined ant-picker-status-success css-42nv3w custom-timepicker'])[1]"));
            workingHourFromField.click();
            workingHourFromField.clear();
            workingHourFromField.sendKeys("09:00:00");

            // Update "Working Hour (To)" field
            WebElement workingHourToField = driver.findElement(By.xpath("(//input[@id='endTime'])[1]"));
            workingHourToField.click();
            workingHourToField.clear();
            workingHourToField.sendKeys("18:00:00");

            // Update "Contact no" field
            WebElement contactNoField = driver.findElement(By.xpath("(//input[@id='contactNo'])[1]"));
            contactNoField.click();
            contactNoField.clear();
            contactNoField.sendKeys("01234567890");

            // Update "Address" field
            WebElement addressField = driver.findElement(By.xpath("(//textarea[@id='address'])[1]"));
            addressField.click();
            addressField.clear();
            addressField.sendKeys("D block house no-12");

            // Update "Remarks" field
            WebElement remarksField = driver.findElement(By.xpath("(//textarea[@id='remark'])[1]"));
            remarksField.click();
            remarksField.clear();
            remarksField.sendKeys("Updated remarks");

            // Click the "Update" button
            WebElement updateButton = driver.findElement(By.xpath("(//span[normalize-space()='Update'])[1]"));
            updateButton.click();

            // Optional: Add a delay to see the effect
            Thread.sleep(2000);


             */

    }
}












