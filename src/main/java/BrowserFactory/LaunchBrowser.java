package BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
    WebDriver driver;
    @Test
    public void launchBrowserAndExecution()   {
        String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome")) {
             driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("InternetExplorer")) {

             driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
             driver = new EdgeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

             driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get("google.com");
    }
}
