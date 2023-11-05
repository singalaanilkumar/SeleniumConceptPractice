package JavaStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {


    // sorting in array:- using sorting it helps go print Array elements in ascending order
   @Test
    public  void  sortingWithStream()
    {
        // print names which have  frist letter  as "a"  with uppercase and sorted
        Stream.of("anil","aruna","rama","youra","kumar").filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    }

}
