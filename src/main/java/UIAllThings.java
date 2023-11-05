import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIAllThings {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("anil");

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("anil@gmail.com");

        driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");

        driver.findElement(By.id("exampleCheck1")).click();

        Select drpdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));

        drpdown.selectByIndex(0);

        driver.findElement(By.id("inlineRadio2")).click();

        driver.findElement(By.name("bday")).sendKeys("06/28/2022");
        driver.findElement(By.className("btn-success")).click();
        //System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

        Thread.sleep(5000);
        driver.close();
    }
}