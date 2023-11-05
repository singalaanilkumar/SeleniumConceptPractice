package UniqueThingsForPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.9.1");
    }
}
