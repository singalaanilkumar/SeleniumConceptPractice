import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='products']/div[1]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='products']/div[3]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='products']/div[6]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button")).click();
        Thread.sleep(3000);
        driver.close();

    }
}