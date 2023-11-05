package ScroolAndWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment7WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        WebElement table = driver.findElement(By.cssSelector("table#product.table-display"));

        System.out.println(table.findElements(By.tagName("tr")).size());

        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

        List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

        System.out.println(secondrow.get(0).getText());

        System.out.println(secondrow.get(1).getText());

        System.out.println(secondrow.get(2).getText());

    }
}
