

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class base{
  protected WebDriver driver;
    @BeforeClass
    public void chrome_handle() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterClass
    public void windowhandle() throws InterruptedException {
      //
        if(driver !=null) {
            Thread.sleep(10000);
            driver.quit();

        }
    }
}

