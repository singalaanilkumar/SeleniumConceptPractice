package JavaStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;
//streams  are introducted  in java8.
public class Streams {

    @Test
    public  void test1()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ramesh");
        names.add("anil");
        names.add("praveen");
        names.add("arun");
        names.add("akash");
        int count =0;
        for (int i=0;i< names.size();i++)
        {
            String actual = names.get(i);
            if(actual.startsWith("a"))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public  void streamsLamda() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ramesh");
        names.add("anil");
        names.add("praveen");
        names.add("arun");
        names.add("akash");
        //there is no life for intermediate operator if there is no terminal operator
        //terminal operator will execute only if internal operator (filter) returns true
        //we can create streams
        //how to use filter in stream API
        Long c = names.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(c);
    }
       @Test
          public  void streamsLamda2()
        {
        long d = Stream.of("ramesh","anil","praveen","arun","akash").filter(s->
        {
            s.startsWith("a");
            return true;//terminal operator will execute only if internal operator (filter) returns true
        }).count(); // limit ,count -> terminal operator
        System.out.println(d);
    }
}
