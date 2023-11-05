package WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WebDriverManagerLatest5Version {
    public static WebDriver driver;
    public static void main(String[] args)  {
        driver = WebDriverManager.chromedriver().create();//within single line we are launching chrome browser and it automatically closed
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/default.asp");
    }
}