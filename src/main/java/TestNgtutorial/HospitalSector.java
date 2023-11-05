package TestNgtutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HospitalSector {

    @Parameters({"url"})
    @Test
    public void hospitalloan(String hname)
    {
        System.out.println("Hloan");
        System.out.println(hname);
    }


    @Test(groups = {"smoke"})
    public void requiemnttestcase3()
    {
        System.out.println("required 3 testcase");
    }
}
