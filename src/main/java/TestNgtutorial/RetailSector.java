package TestNgtutorial;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RetailSector {
    @Test
    public void myretailloan1()
    {
        System.out.println("rloan1");
    }
    @Test
    public void myretailloan2()
    {
        System.out.println("rloan2");
    }
    @Test
    public void myretailloan3()
    {
        System.out.println("rloan3");
    }

    @Parameters({"url"})
    @Test
    public void retailloan4( String rname)
    {
        System.out.println("rloan4");
        System.out.println(rname);
    }


    @Test(groups = {"smoke"})
    public void requiemnttestcase2()
    {
        System.out.println("required 2 testcase");
    }
    @BeforeSuite
    public void bsuitename()
    {
        System.out.println("beforesuite print frist ");
    }

    @Test
    public void retailloan6()
    {
        System.out.println("rloan6");
    }

    @Test
    public void retailloan7()
    {
        System.out.println("rloan7");
    }
}
