import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SplictUsingLocators {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();

//Please use temporary password 'rahulshettyacademy' to Login.

        String[] passwordArray = passwordText.split("'");
        //0th index - Please use temporary password
        //1st index - rahulshettyacademy' to Login.
        String[] passwordArray2 = passwordArray[1].split("'");
        //0th index - rahulshettyacademy
        //1st index - to Login.
        String password = passwordArray[1].split("'")[0];
        System.out.println(passwordArray2[0]);
        System.out.println(password);


    }

}


