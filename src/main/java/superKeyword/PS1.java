package superKeyword;

import org.testng.annotations.Test;

public class PS1 extends PS {

    @Test
    public void testrun()
    {
        PS2 ps2 = new PS2(3);
        int a=3;
        dothis();//parent class
        System.out.println(ps2.increment());
        System.out.println(ps2.decrement());
        System.out.println(ps2.multiplyTwo());
        System.out.println(ps2.multiplyThree());

    }
}
