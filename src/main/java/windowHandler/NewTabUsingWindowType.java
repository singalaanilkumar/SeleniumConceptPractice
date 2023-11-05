package windowHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class NewTabUsingWindowType {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();//within single line we are launching chrome browser
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("http://the-internet.herokuapp.com/");
    }
}
