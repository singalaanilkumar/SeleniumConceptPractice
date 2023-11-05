package PagefactorymodelTestcases;

import PageFactoryModel.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FactoryTestcase {

       @Test
        public  void  main1() {

           WebDriver driver = new ChromeDriver();
           driver.get("https://www.youtube.com/");
           driver.manage().window().maximize();
           factory f = new factory(driver);
           f.sign().click();
           f.email();

       }
    }
