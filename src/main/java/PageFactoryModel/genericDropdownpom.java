package PageFactoryModel;

import GenericUtils.genericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class genericDropdownpom extends genericMethods {
   // WebDriver driver; //local variable

    @FindBy(id = "ctl00_mainContent_DropDownListCurrency" )
    WebElement currency;

   /* public genericDropdownpom(WebDriver driver) //parameterized comstructor

    {
        this.driver=driver;//using help of this keyword local variable driver invoked to pagemodel contructor.
        PageFactory.initElements( driver,this);//intialize the elements of page factory
    }*/



    public genericDropdownpom() {
        PageFactory.initElements( driver,this);
    }

    public  void dropdown()
    {
        doselectByVisibleText(currency,"USD");
    }
}

