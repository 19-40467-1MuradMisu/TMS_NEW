import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login {

    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    private boolean islogin = false;

    public void performLogin() throws InterruptedException {
        System.out.println("Starting login process...");

        driver.findElement(By.xpath("(//a[normalize-space()='Signup / Login'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@data-qa='login-email'])[1]")).sendKeys("misu_test25@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@data-qa='login-password'])[1]")).sendKeys("abc123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
        Thread.sleep(2000);

        islogin = true;
        System.out.println("Login successful.");

        if (islogin) {
            add_cart add_cart = new add_cart(driver);  // Pass driver to login
            add_cart.performadd_cart();
        }
    }
}
