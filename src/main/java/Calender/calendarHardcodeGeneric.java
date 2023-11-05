package Calender;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class calendarHardcodeGeneric {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();

        String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();//november 2022
        System.out.println(monthYearVal);//February 2021
        String month = monthYearVal.split(" ")[0].trim();
        String year = monthYearVal.split(" ")[1].trim();

        while (!(month.equals("November") && year.equals("2024"))) {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
            monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
            System.out.println(monthYearVal);//February 2021
            month = monthYearVal.split(" ")[0].trim();
            year = monthYearVal.split(" ")[1].trim();
        }
            driver.findElement(By.xpath("//a[text()='27']")).click();
        }

    }



