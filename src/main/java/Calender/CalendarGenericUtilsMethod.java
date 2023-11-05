package Calender;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarGenericUtilsMethod {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        selectDate("26", "November", "2022");
    }

    public static String[] getMonthYear(String monthYearVal) {
        return monthYearVal.split(" ");
    }

    public static void selectDate(String expectDay, String expectMonth, String expectYear) {
        if (expectMonth.equals("February") && Integer.parseInt(expectDay) > 29) {
            System.out.println("wrong date: " + expectMonth + " : " + expectDay);
            return;
        }
        if (Integer.parseInt(expectDay) > 31) {
            System.out.println("wrong date: " + expectMonth + " : " + expectDay);
            return;
        }

        String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
        System.out.println(monthYearVal);//February 2021
        while (!(getMonthYear(monthYearVal)[0].equals(expectMonth) && getMonthYear(monthYearVal)[1].equals(expectYear))) {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
            monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
        }
        driver.findElement(By.xpath("//a[text()='" + expectDay + "']")).click();
    }

}


