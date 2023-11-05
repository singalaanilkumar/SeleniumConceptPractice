import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MultipleBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.out.println("select browser(chrome/edge/internetexplorer)");
        try (Scanner s = new Scanner(System.in)) {
            {//it shows suprise warning and resouce leak so i mentioned surround with  try-with-resources.
                String browser=s.next();// browser move to next
                Reporter.log("selecting browser",true);// it is a inbuilt class in TestNG, which helps in logging the messages
                //in the output reports.
                //selecting chrome browser
                if(browser.equalsIgnoreCase("chrome"))
                {
                    Reporter.log("selecting chrome browser",true);
                    String path = System.getProperty("user.dir");
                    System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
                    driver = new ChromeDriver();// lunching the chromebrowser
                    driver.manage().window().maximize();
                    Reporter.log("selected chrome browser", true);
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    driver.get("https://www.snapdeal.com/");
                    Thread.sleep(2000);

                }
                //selecting firefox browser
                else if(browser.equalsIgnoreCase("edge"))//equalsIgnoreCase check each and avery  character its matching are not.
                {
                    Reporter.log("selecting edge browser",true);
                    String path = System.getProperty("user.dir");
                    System.setProperty("webdriver.gecko.driver",path+"\\Drivers\\msedgedriver.exe");
                    driver = new EdgeDriver(); // lunching the edge browser
                    driver.manage().window().maximize();//maximize the window
                    driver.get("https://www.snapdeal.com/");// navigate the url
                    Reporter.log("selected edge Browser", true);
                    Thread.sleep(2000);// sleep the 2sec completely
                }
                //selecting Internet Explorer
                else if(browser.equalsIgnoreCase("internetexplorer"))//equalsIgnoreCase check each and avery  character its matching are not.
                {
                    Reporter.log("selecting internetexplorer",true);
                    String path = System.getProperty("user.dir");
                    System.setProperty("webdriver.gecko.driver",path+"\\Drivers\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();// lunching the InternetExplorer browser
                    //driver.manage().window().maximize();//maximize the window
                    driver.get("https://www.snapdeal.com/");// navigate the url
                    Reporter.log("selected internetexplorer", true);
                    Thread.sleep(2000);// sleep the 2sec completely
                }
            }
        }
    }
    }

