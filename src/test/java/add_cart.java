import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class add_cart {
    private WebDriver driver;

    public add_cart(WebDriver driver) {
        this.driver = driver;
    }
    @Test
    public void performadd_cart() throws InterruptedException {
        System.out.println("Starting adding cart...");

        driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='modal-content'])[1]")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//u[normalize-space()='View Cart'])[1]")).click();
//        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[normalize-space()='Proceed To Checkout'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//textarea[@name='message'])[1]")).sendKeys("This is my order");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[normalize-space()='Place Order'])[1]")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("(//input[@name='name_on_card'])[1]")).sendKeys("misu");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@name='card_number'])[1]")).sendKeys("9348543894398");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@placeholder='ex. 311'])[1]")).sendKeys("299");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@placeholder='MM'])[1]")).sendKeys("7");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@placeholder='YYYY'])[1]")).sendKeys("2027");
        Thread.sleep(2000);


        driver.findElement(By.xpath("(//button[normalize-space()='Pay and Confirm Order'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
        Thread.sleep(2000);


        System.out.println("Order Successfull");
    }
}
