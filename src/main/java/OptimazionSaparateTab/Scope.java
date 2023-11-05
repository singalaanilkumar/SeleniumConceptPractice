package OptimazionSaparateTab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //1. Give me the count of links on the page.
        //2. Count of footer section-

        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        //3-
        WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());

        //4- click on each link in the coloumn and check if the pages are opening-
        for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

            String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            //Keys.chord(Keys.CONTROL, Keys.ENTER); -> this help to click on our keyboard  ctrl+enter like that
            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            Thread.sleep(5000L);

        }// opens all the tabs
        Set<String> abc = driver.getWindowHandles();//4
        Iterator<String> it = abc.iterator();
        // iterator will helps has  to move form one tab to another tab
        while (it.hasNext()) {
            //hasNext() :- hasNext tells whether as the next index is present (or) not.
            //it.next() :- it acually move to next index
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
    }
}