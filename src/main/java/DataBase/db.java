package DataBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.*;

public class db {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String host = "localhost";

        String port = "3306";

        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "root");

        Statement s = con.createStatement();

        ResultSet rs = s.executeQuery("select * from credentials where scenario ='rewardscard'");

        while (rs.next()) {

            WebDriver driver = new FirefoxDriver();

            driver.get("https://login.salesforce.com");

            driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));

            driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
        }
    }
}