package AutomateAndAjax;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowhandleAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> abc=driver.getWindowHandles();
        Iterator<String> it=abc.iterator();
        String parentWindow=it.next();
        driver.switchTo().window(it.next());
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
       driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
    }
}
