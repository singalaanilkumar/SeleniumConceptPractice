package thisKeyword;

import org.testng.annotations.Test;
import superKeyword.PS3;

public class PS1 extends PS{

    @Test
    public void testrun()
    {
        PS2 ps2 = new PS2(3);
        int a=3;
        dothis();//parent class
        System.out.println(ps2.increment());
        System.out.println(ps2.decrement());
    }
}
