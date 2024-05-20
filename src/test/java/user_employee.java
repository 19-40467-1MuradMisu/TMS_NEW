
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


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

        driver.findElement(By.xpath("/html/body/div/div/aside/div[1]/ul/li[2]/div/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/div/aside/div[1]/ul/li[2]/ul/li/span")).click();
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

      WebElement File=driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[2]/div[1]/div/span/div/span/button"));
      File.sendKeys("./D:/sample.xlsx");// Click on downlaod button and upload Excel file
        Thread.sleep(2000);
    }


}


