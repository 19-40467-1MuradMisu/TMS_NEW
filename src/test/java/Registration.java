import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Registration extends base {
    private boolean isRegistered = false;

    @Test(priority = 1)
    public void view_web_page_of_Automation_Exercise() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);

        try {
            WebElement consentButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]"));
            consentButton.click();
            System.out.println("Consent pop-up handled successfully.");
        } catch (Exception e) {
            System.out.println("Consent pop-up not found, or already handled.");
        }
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void Registration() throws InterruptedException {
        driver.findElement(By.xpath("(//a[normalize-space()='Signup / Login'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@placeholder='Name'])[1]")).sendKeys("misu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@data-qa='signup-email'])[1]")).sendKeys("misu_test25@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[normalize-space()='Signup'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("abc123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("md");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("misu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='address1'])[1]")).sendKeys("raatuse 22, tartu linn, raya");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='state'])[1]")).sendKeys("Missori");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='city'])[1]")).sendKeys("New York");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='zipcode'])[1]")).sendKeys("6450");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='mobile_number'])[1]")).sendKeys("01836875023");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[normalize-space()='Create Account'])[1]")).click();
        Thread.sleep(2000);

        isRegistered = true;
        System.out.println("User Registered successfully.");

        driver.findElement(By.xpath("(//a[normalize-space()='Continue'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
        Thread.sleep(2000);

        // Start login if registration was successful
        if (isRegistered) {
            Login login = new Login(driver);  // Pass driver to login
            login.performLogin();
        }
    }
}
