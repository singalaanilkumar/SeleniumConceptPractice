package windowHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandler1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();//within single line we are launching chrome browser
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();
        //iterator will helps has  to move from one tab to another tab
        String parentWindow = it.next();
        driver.switchTo().window(it.next()); // childwindow
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
    }
}