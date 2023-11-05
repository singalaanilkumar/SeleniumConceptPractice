package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesrdropDownAssignment8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.id("autocomplete")).sendKeys("ind");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='ui-menu-item'][2]/div")).click();

         //driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        //driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
    }
}