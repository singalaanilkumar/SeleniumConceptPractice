package thisKeyword;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

    public void dothis()
    {
        System.out.println("im here");
    }

    @BeforeMethod
    public void beforeRun()
    {
        System.out.println("run me first");
    }

    @AfterMethod
    public void AfterRun()
    {
        System.out.println("run me last");
    }

}
