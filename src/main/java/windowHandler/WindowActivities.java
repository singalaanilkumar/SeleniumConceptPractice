package windowHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WindowActivities {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();//within single line we are launching chrome browser
        driver.manage().window().maximize();
        driver.get("http://google.com"); // get method help's to navigate url
        driver.navigate().to("https://rahulshettyacademy.com");// navigate().to() method help's to navigate another url in browser
        driver.navigate().back();
        driver.navigate().forward();
    }
}