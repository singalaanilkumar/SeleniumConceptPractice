package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel {
    WebDriver driver; //local variable

    public PageModel(WebDriver driver) //parameterized comstructor

    {
        this.driver=driver;//using help of this keyword local variable driver invoked to pagemodel contructor.
    }
   By sign = By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']");
    By emaill = By.xpath("//input[@class='whsOnd zHQkBf']");

    public WebElement sign()
    {
         return driver.findElement(sign);
    }

    public  void email()
    {

        driver.findElement(emaill).sendKeys("anilkumar@gmail.com");
    }
}
