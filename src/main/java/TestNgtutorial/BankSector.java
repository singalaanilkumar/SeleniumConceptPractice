package TestNgtutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BankSector {

    @Parameters({"burl" , "key"})
    @Test
    public void bankloan(String bname , String Kname)
    {
        System.out.println("bankloan");
        System.out.println(bname);
        System.out.println(Kname);
    }
}
