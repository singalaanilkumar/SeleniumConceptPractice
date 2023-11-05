package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetValueAppearWhenUClickFromDropDown {
    public static void main(String[] args) throws InterruptedException {
        /** there are several values appear when u click on drop down how to get all values from dropdown tell me the logic */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement selectdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(selectdropdown);
// Get all the options in the dropdown
        List<WebElement> options = dropdown.getOptions();

// Iterate over the options and print their values
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }
}
