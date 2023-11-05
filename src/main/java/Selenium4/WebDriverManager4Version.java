package Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class WebDriverManager4Version {
    public static void main(String[] args) throws InterruptedException {
      /*  String chropath=SeleniumManager.getInstance().getDriverPath("ChromeDriver");
        System.out.println(chropath);*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/manual-automation-testing-of-webservices-api/");
    }
}
