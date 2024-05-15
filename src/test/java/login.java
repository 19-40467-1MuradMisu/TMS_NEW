

import org.openqa.selenium.By;
import org.testng.annotations.Test;


//public class login extends base{
//
//    @Test(groups ={"view_web_page_of_TMS"},priority = 1)
//    void view_web_page_of_TMS() {
//        driver.get("http://192.168.61.37:3000/");
//
//    }
//
//    @Test(groups ={"Login"},priority = 2)
//    void Login() throws InterruptedException {
//
//        driver.findElement(By.xpath("/html/body/div/div/div/form/div[2]/div/div/div/div/input")).sendKeys("tmsadmin");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div/div/div/form/div[4]/div/div/div/div/span/input")).sendKeys("tms1234");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div/div/div/form/div[6]/div/div/div/div/button/span")).click();
//        Thread.sleep(1000);
//    }
//
//}
public class login extends base {
    private static login instance;
    boolean isloggedIn;

    protected login() {
        // Private constructor to prevent instantiation from outside
        isloggedIn = false;
    }

    public static login getInstance() {
        if (instance == null) {
            instance = new login();
        }
        return instance;
    }

    @Test(groups ={"view_web_page_of_TMS"},priority = 1)
    void view_web_page_of_TMS() {
        driver.get("http://192.168.61.37:3000/");

    }
    @Test(groups ={"Login"},priority = 2)
    public void login() throws InterruptedException {
        // Your login logic here
        // For example, setting isLoggedIn to true
        driver.findElement(By.xpath("/html/body/div/div/div/form/div[2]/div/div/div/div/input")).sendKeys("tmsadmin");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/form/div[4]/div/div/div/div/span/input")).sendKeys("tms1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/form/div[6]/div/div/div/div/button/span")).click();
        Thread.sleep(1000);

        isloggedIn = true;
        System.out.println("User logged in successfully.");
    }

    public boolean isLoggedIn() {
        return isloggedIn;
    }


}
