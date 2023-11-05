package Selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class InvokingMultipleWindowsNdTabs {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

//Switching Window/Tab
        //driver.switchTo().newWindow(WindowType.TAb);
       // driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it = handles.iterator();

        String parentWindowId = it.next();

        String childWindow = it.next();

        driver.switchTo().window(childWindow);

        driver.get("https://rahulshettyacademy.com/");

        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

                .get(1).getText();

        driver.switchTo().window(parentWindowId);
    }
}
