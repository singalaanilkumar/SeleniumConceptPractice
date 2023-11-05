package JavaStreams;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUniqueNumber {
    @Test
    public void print()
    {
       List<Integer> values = Arrays.asList(3,2,1,2,4,7,3,9,8,7,9,8);
       //print unique number from this array
        //values.stream().distinct().forEach(s->System.out.println(s));

        //sort this array
        //values.stream().sorted().distinct().forEach(s->System.out.println(s));

        //sort array and print 3rd index
        List<Integer> index=values.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(index);
        System.out.println(index.get(2));


    }
}
