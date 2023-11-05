package JavaStreams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merge {
    @Test
    public  void  sortingWithStreamDifferentLogic()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ramesh");
        names.add("anil");
        names.add("praveen");
        // print names which have  frist letter  as "a"  with uppercase and sorted and concat
        List<String> name2= Arrays.asList("arun","king","snow","camera");
        name2.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        //merging two  different lists
        Stream<String> merge=Stream.concat(names.stream(), name2.stream());
        //merge.sorted().forEach(s->System.out.println(s));
        boolean flag = merge.anyMatch(s->s.equalsIgnoreCase("arun"));
        //boolean flag = merge.anyMatch(s->s.equalsIgnoreCase("ar33un")); -> test failed
        System.out.println(flag);
        Assert.assertTrue(flag);
    }
}
