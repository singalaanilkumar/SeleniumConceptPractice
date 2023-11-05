package UniqueThingsForPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class ClickOnMultipleTimes {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement>  clickOnIncrement = driver.findElements(By.cssSelector("a.increment"));
        List<WebElement> ClickFristIncrementOption =  clickOnIncrement;

        /*frist approach

        int i = 4;
        while(i>0)
        {

            ClickFristIncrementOption.get(1).click();
            i--;
        } */

        /** second approach*/
        for (int i = 1; i <= 4; i++) {
            ClickFristIncrementOption.get(1).click(); //clicking 5 times
        }
        }
    }
