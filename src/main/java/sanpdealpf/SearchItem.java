package sanpdealpf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchItem {
    WebDriver driver;

    public SearchItem(WebDriver driver) //parameterized comstructor

    {
        this.driver = driver;//using help of this keyword local variable driver invoked to pagemodel contructor.
        PageFactory.initElements(driver, this);//intialize the elements of page factory
    }

    By itemSearch = By.xpath("//input[@class='col-xs-20 searchformInput keyword']");
    By SearchButton = By.cssSelector("span.searchTextSpan");

    public void enteritemOnSearch() {
        driver.findElement(itemSearch).sendKeys("Bluetooth Headphone");
    }

    public WebElement ClickSearchButton()
    {
        return driver.findElement(SearchButton);
    }
}

