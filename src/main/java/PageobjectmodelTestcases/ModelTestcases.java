package PageobjectmodelTestcases;

import PageObjectModel.PageModel;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModelTestcases {
    WebDriver driver;

    @Test
    public void main() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        PageModel pm = new PageModel(driver);
        pm.sign().click();
        pm.email();
    }
}