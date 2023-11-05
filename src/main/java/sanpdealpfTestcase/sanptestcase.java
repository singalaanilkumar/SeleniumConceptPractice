package sanpdealpfTestcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sanpdealpf.SearchItem;

public class sanptestcase {
    @Test
    public void main() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        SearchItem s = new SearchItem(driver);
        s.enteritemOnSearch();
        s.ClickSearchButton().click();

    }
}