package windowHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabNdWindowOpen {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

// This will open the new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://www.google.com");

// This will open the new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://www.google.com");
    }
}
