package TestNgtutorial;


import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgAnnotation {
    Logger log = Logger.getLogger(TestNgAnnotation.class);
    @Test
    public void test() {

        System.out.println("multiple testcases run in a single class using testng");
        log.info("multiple testcases run in a single class using testng");
    }

    @Test
    public void test1() {
        System.out.println("using testng without java static method we are able to run multtiple testcase scenario's");
        log.info("using testng without java static method we are able to run multtiple testcase scenario's");
    }

    @Test
    public void test2() {
        System.out.println("method name test2");
        log.info("method name test2");
      //  Assert.assertTrue(false);
    }

    @AfterSuite
    public void Asuite() {
        System.out.println("aftersuite print last");
        log.info("aftersuite print last");
    }

    @BeforeTest
    public void btest() {
        System.out.println("btest");
        log.info("btest");
    }

    @AfterTest
    public void Atest1() {
        System.out.println("atest");
        log.info("atest");
    }

    @BeforeClass
    public void Bclass() {
        System.out.println("bclass");
        log.info("bclass");
    }

    @Test
    public void depend() {
        System.out.println("depend 1");
        log.info("depend 1");
    }

    @Test
    public void depend2() {
        System.out.println("depend 2");
        log.info("depend 2");
    }

    @Test(enabled = false)
    public void failureTestcase() {
        System.out.println("skiped the testcase because it has a issue");
        log.info("skiped the testcase because it has a issue");
    }

    @Test(dependsOnMethods = {"depend","depend2"})
    public void notrmal() {
        System.out.println("depends on depend 1,2 after it execute ");
        log.info("depends on depend 1,2 after it execute ");
    }

    @Test(timeOut=4000)
    public void timeout() {
        System.out.println("using timeout it wait the given time after throw erroe");
        log.info("using timeout it wait the given time after throw erroe");
    }

    @AfterClass
    public void Aclass() {
        System.out.println("aclass");
        log.info("aclass");
    }


    @Test(groups = {"smoke"})
    public void requiemnttestcase()
    {
        System.out.println("required 1 testcase");
        log.info("required 1 testcase");
    }

    @BeforeMethod
    public void bmethod() {
        System.out.println("bmethod");
        log.info("bmethod");
    }

    @AfterMethod
    public void Amethod() {
        System.out.println("amethod");
        log.info("amethod");
    }
}
