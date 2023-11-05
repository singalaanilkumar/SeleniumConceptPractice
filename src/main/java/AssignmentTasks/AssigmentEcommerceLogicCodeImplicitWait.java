package AssignmentTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AssigmentEcommerceLogicCodeImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        addItems(driver, itemsNeeded); // static method
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        //Thread.sleep(5000);
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        //button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        //button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
       // Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
       /* EcommerceLogicCode el = new EcommerceLogicCode();
        el.addItems(driver, itemsNeeded); */ //public method


    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
//Brocolli - 1 Kg
//Brocolli,    1 kg
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            System.out.println(products.get(i).getText());
//format it to get actual vegetable name
//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName)) {
                j++;
//click on Add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}