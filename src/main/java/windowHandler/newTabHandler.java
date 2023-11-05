package windowHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class newTabHandler {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();//within single line we are launching chrome browser
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("http://the-internet.herokuapp.com/");
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles.size());
        String parentHandle = driver.getWindowHandle();
        for (String handle : handles) {
            if (handle != parentHandle) {
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
            }
        }
        driver.switchTo().window(parentHandle);
        Thread.sleep(10000);
    }
}
