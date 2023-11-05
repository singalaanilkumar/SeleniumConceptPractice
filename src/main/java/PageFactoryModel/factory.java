package PageFactoryModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class factory {
    WebDriver driver; //local variable

    public factory(WebDriver driver) //parameterized comstructor

    {
        this.driver=driver;//using help of this keyword local variable driver invoked to pagemodel contructor.
        PageFactory.initElements( driver,this);//intialize the elements of page factory
    }
    @FindBy(xpath = "//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']" )
     WebElement sign;

    @FindBy(xpath ="//input[@class='whsOnd zHQkBf']")
    WebElement emaill;

    public WebElement sign()
    {
        return sign;
    }
    public  void email()
    {
        emaill.sendKeys("anilkumar@gmail.com");
    }
}


