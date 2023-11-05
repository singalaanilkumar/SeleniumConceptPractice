package AutomateAndAjax;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        //System.out.println(driver.findElements(By.tagName("iframe")).size());
        //driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        Actions a= new Actions(driver);
        WebElement soure= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));
        a.dragAndDrop(soure, target).build().perform();
    }
}
