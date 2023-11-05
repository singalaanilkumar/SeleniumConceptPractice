package UniqueThingsForPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/** How to Enter Text without using sendKeys() method  */

public class EnterTextWithoutSendkeys {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.google.com/");

       /* first approach
       WebElement searchbox= driver.findElement(By.xpath("//input[@class='gLFyf']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Selenium with Chrome'",searchbox);
        searchbox.submit();*/

        /* this second approach */
        WebElement textField = driver.findElement(By.name("q"));
        // enter text into the text field using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='Selenium';", textField);
        textField.submit();
        // close the browser
        driver.quit();
    }
}
