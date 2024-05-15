
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class user_employee extends login {
    WebDriver driver;

@BeforeClass
public void loginIfNeeded() throws InterruptedException {
    login loginInstance = login.getInstance();
    if (!loginInstance.isLoggedIn()) {
        loginInstance.login();
    }
}

//    login login = login.getInstance();
//
//    // Call login only once
//        if (!login.isloggedIn()) {
//        login.login();
//    }

    @Test(groups = {"user_employer_click"}, priority = 3)
    void click_user_employee() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/aside/div[1]/ul/li[2]/div/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/div/aside/div[1]/ul/li[2]/ul/li/span")).click();
        Thread.sleep(2000);
    }


    @Test(groups = {"Search_Employee_details_byName"}, priority = 4)
    void Search_Employee_details_byName() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys("\n" +
                "Sajedul Islam"); // Search by name
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[3]/div/div/div/div/div/div/div[1]/button")).click(); // click filter Button
        Thread.sleep(2000);
    }


    @Test(groups = {"Search_Employee_details_byName_Enterkey"}, priority = 5)
    void Search_Employee_details_byName_Enterkey() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys("\n" +
                "Sajedul Islam"); // Search by name
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys(Keys.ENTER); // Clicking the enter key
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[3]/div/div/div/div/div/div/div[2]/button")).click(); // reset button
        Thread.sleep(2000);
    }




    @Test(groups = {"Search_Employee_details_byId"}, priority = 6)
    void Search_Employee_details_byId() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[2]/div/div/div/div/div/input")).sendKeys( "\n" +
                "TN-99299"); // Search by id
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[3]/div/div/div/div/div/div/div[1]/button")).click(); // click filter Button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[3]/div/div/div/div/div/div/div[2]/button")).click(); // reset button
        Thread.sleep(2000);
    }


    @Test(groups = {"Search_Employee_details_byId_Enterkey"}, priority = 7)
    void Search_Employee_details_byId_Enterkey() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys("\n" +
                "TN-99299"); // Search by employeeid
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[1]/div/div/div/div/div/input")).sendKeys(Keys.ENTER); // Clicking the enter key
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/form/div/div[3]/div/div/div/div/div/div/div[2]/button")).click(); // reset button
        Thread.sleep(2000);
    }



}
