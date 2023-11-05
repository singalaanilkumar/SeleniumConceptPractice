package AssignmentTasks;

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

public class WaitsAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(7));//selenium 4
        //WebDriverWait w = new WebDriverWait(driver, 7);//below selenium 4
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        WebElement username = driver.findElement(By.cssSelector("input#username.form-control"));
        username.sendKeys("rahulshettyacademy");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("learning");
        WebElement userbutton = driver.findElement(By.xpath("//label[@class='customradio'][2]/span[2]"));
        userbutton.click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Okay']")));
        WebElement okbutton = driver.findElement(By.xpath("//button[text()='Okay']"));
        okbutton.click();
        Select dropdown = new Select(driver.findElement(By.cssSelector("select.form-control")));
        dropdown.selectByIndex(2);
        WebElement agree = driver.findElement(By.id("terms"));
        agree.click();
        WebElement sigin = driver.findElement(By.cssSelector("input#signInBtn.btn.btn-info.btn-md"));
        sigin.click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.nav-link.btn.btn-primary")));
        List<WebElement> products = driver.findElements(By.cssSelector("button.btn.btn-info"));
        for (int i = 0; i < products.size(); i++) //products.size()=4 -> i<4
        {
            products.get(i).click();
        }
        WebElement checkout = driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary"));
        checkout.click();
    }
}