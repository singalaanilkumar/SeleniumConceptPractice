package windowHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        //latest webdriver manager thing-within single line we are launching chrome browser
        WebDriver driver = WebDriverManager.chromedriver().create();//within single line we are launching chrome browser
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

        Iterator<String> it = windows.iterator();

        String parentId = it.next();

        String childId = it.next();

        driver.switchTo().window(childId);

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        driver.findElement(By.cssSelector(".im-para.red")).getText();

        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        //Please email us at mentor@rahulshettyacademy.com with below template to receive response
        //trim() -> remove spaces
        //split() -> divided to parts
        //[0] - o index
        driver.switchTo().window(parentId);
        Thread.sleep(5000);
        driver.findElement(By.id("username")).sendKeys(emailId);
        Thread.sleep(5000);
    }
}
