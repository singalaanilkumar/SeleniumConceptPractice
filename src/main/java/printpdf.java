import BrowserFactory.DriverFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class printpdf {

    public DriverFactory df;

   /* public static void main(String[] args) throws IOException {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        Pdf pdf = driver.print(new PrintOptions());
        Files.write(Paths.get("./InternetHerokutionePage.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
        driver.quit();
    }*/





    @Test()
    public void launch() throws IOException {
        df = new DriverFactory();
        df.init_driver_for_print("chrome");
        DriverFactory.getDriver1().get("https://the-internet.herokuapp.com/");
        Pdf pdf = DriverFactory.getDriver1().print(new PrintOptions());
        Files.write(Paths.get("./InternetHerokutionePage.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
        DriverFactory.getDriver1().quit();

    }
}