import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class waitex {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
//Thread.sleep(3000);
        //WebDriverWait wait = new WebDriverWait(driver, 7);//below selenium 4.o
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//above selenium 4.o
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown = new Select(options);
        dropdown.selectByValue("consult");
        driver.findElement(By.id("signInBtn")).click();
        List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
        for (int i = 0; i < products.size(); i++) {
            products.get(i).click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
        driver.findElement(By.partialLinkText("Checkout")).click();
    }
}
