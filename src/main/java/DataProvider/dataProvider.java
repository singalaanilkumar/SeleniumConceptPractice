package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
    @Test(dataProvider = "nametest")
    public void testname(String fristname , String Lastname, int age)
    {
        System.out.println( fristname + " " + Lastname + " " + age );
    }

    @DataProvider(name = "nametest")
    public Object[][] getData()
    {
        Object[][] data= {{"anil","kumar",24},{"arun","kumar", 23},{"anand" , "kumar", 25}};
        return data;
    }
}
