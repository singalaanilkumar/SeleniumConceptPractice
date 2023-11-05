package Calender;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GenericCalendarLogic {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


        while (!driver.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).getText().contains("October")) {
           //driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
            driver.findElement(By.cssSelector("[class='datepicker-days'] th.next")).click();
        }
/*
while(true)//while loop will keep on executing until it becomes flase
{}

while(flase)//the block is stopped
{}
!true = flase
!flase= true
 */

        List<WebElement> dates = driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
        int count1= dates.size();
        int count = driver.findElements(By.className("day")).size();

        for (int i = 0; i < count; i++) {
            String text = driver.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("21")) {
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }
    }
}


  /*  static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        selectDate("23","November","2025");
    }

    public static void selectDate (String expectDay, String expectMonth, String expectYear){
        String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
        System.out.println(monthYearVal);//February 2021
        String month = monthYearVal.split(" ")[0].trim();
        String year = monthYearVal.split(" ")[1].trim();

        while (!(month.equals(expectMonth) && year.equals(expectYear))) {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
            monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
            System.out.println(monthYearVal);//February 2021
            month = monthYearVal.split(" ")[0].trim();
            year = monthYearVal.split(" ")[1].trim();
        }
        driver.findElement(By.xpath("//a[text()='"+expectDay+"']")).click();
    }*/