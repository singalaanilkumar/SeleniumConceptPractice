package Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager4VersionHeadlessMode {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        options.addArguments("headless");
        driver = new ChromeDriver(options);
     /*   driver = new ChromeDriver();*/
        driver.get("https://naveenautomationlabs.com/manual-automation-testing-of-webservices-api/");
    }
}
