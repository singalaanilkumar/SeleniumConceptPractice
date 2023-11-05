package GenericUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class genericMethods {
    public static WebDriver driver;

    //For Click Action
    public void clickingOnWebElement(WebElement element) {
        element.click();
    }

    //For sendkeys Action
    public void sendKeysWebElement(WebElement element, String text) {
        element.click();
        element.clear();
        element.sendKeys(text);
    }


    //accepting an alert From UI
    public void acceptAlert(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

    //this method is for mouse hovering from one element to another element
    public void mouseHoverAndClickElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
    }

    public void selectDropDownValue(WebElement element, String type, String value) {
        Select select = new Select(element);
        switch (type) {
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "visibletext":
                select.selectByVisibleText(value);
                break;
            default:
                System.out.println("pass the correct selection criteria");
                break;
        }
    }

    public void doselectByVisibleText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void doselectDropDownByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void doselectDropDownByValue(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByValue(text);
    }


}
