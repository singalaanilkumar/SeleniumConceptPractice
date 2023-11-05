package WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverHeadlessMode {
    public static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        //co.setHeadless(true);//not launching browser and but code been running fine
        co.addArguments("headless");
        //co.setHeadless(false);//launching browser & code been running fine
        driver = WebDriverManager.chromedriver().capabilities(co).create();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/default.asp");
    }
}
