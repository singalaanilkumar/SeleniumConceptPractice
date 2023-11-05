package Selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;

public class GetHightNdWidth {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys("anil");
        //GEt Height & Width
        System.out.println(name.getRect().getDimension().getHeight());

        System.out.println(name.getRect().getDimension().getWidth());

    }
}
