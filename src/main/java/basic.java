import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic {
    public static void main(String[] args) {

        //Microsoft Edge
        WebDriverManager.edgedriver().setup();
        WebDriver driver2 = new EdgeDriver();

        driver2.get("https://www.w3schools.com/html/default.asp");
        System.out.println(driver2.getTitle());
        System.out.println(driver2.getCurrentUrl());
        driver2.close();//closes only the current window on which Selenium is running automated tests. The WebDriver session, however, remains active.
        //driver.quit();//quit() method closes all browser windows and ends the WebDriver session.
    }
}
