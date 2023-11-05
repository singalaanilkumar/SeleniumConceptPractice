package TestNgtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "getdata")
    public  void main(String username , String password)
    {
        System.out.println(username);
        System.out.println(password);
    }

    //@BeforeMethod
    //public  void main1()
    {
      System.out.println("Bmethod");
    }

    //@AfterMethod
    //public  void main2()
    {
        System.out.println("Amethod");
    }


    @org.testng.annotations.DataProvider
    public  Object[][] getdata()
    {
        //1st combination -> username & password of credit card
        //2nd combination -> username & password of   credit history
        //3rd combination  -> username & password of debit card
        Object[][] data = new Object[3][2];

        //1st set
        data[0][0] = "frist set username";
        data[0][1] = "frist set of password";

        //2nd set
        data[1][0] = "second set username";
        data[1][1] = "second set of password";

        //3rd set
        data[2][0] = "third set username";
        data[2][1] = "third set of password";

        return data;

    }
}
