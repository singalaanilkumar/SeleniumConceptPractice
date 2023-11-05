package genericPageCode;

import GenericUtils.genericMethods;
import PageFactoryModel.genericDropdownpom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownWihGeneric {
    /*static  WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver(); // we put WebDriver we get error nullpointererror
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        By currency = By.id("ctl00_mainContent_DropDownListCurrency");
        doselectByVisibleText(currency, "USD");
    }

    public static WebElement getelement(By locator) {
        return driver.findElement(locator);
    }

    public static void doselectByVisibleText(By locator, String text) {
        Select select = new Select(getelement(locator));
        select.selectByVisibleText(text);
    }*/

    genericDropdownpom gd = new genericDropdownpom();
    @Test
    public  void run(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        gd.dropdown();
    }

}