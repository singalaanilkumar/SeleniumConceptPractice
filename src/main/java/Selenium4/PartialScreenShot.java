package Selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class PartialScreenShot {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

//Switching Window

      //  driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it = handles.iterator();

        String parentWindowId = it.next();

        String childWindow = it.next();

        driver.switchTo().window(childWindow);

        driver.get("https://rahulshettyacademy.com/");

        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

                .get(1).getText();

        driver.switchTo().window(parentWindowId);

        WebElement name = driver.findElement(By.cssSelector("[name='name']"));

        name.sendKeys(courseName);

// Parial Screenshot means particular screenshot here name webElement er are taking screenshot

        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));

//driver.quit(); // quit multiple windows are open then we call quit
        //driver.close();//close only window are open means the we call close method

    }
}
