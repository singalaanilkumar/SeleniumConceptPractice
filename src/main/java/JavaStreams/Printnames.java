package JavaStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Stream;

public class Printnames {
    @Test
    public void printname()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ramesh");
        names.add("anil");
        names.add("praveen");
        names.add("arun");
        names.add("akash");
        //print all the arraylist names
       // names.stream().filter(s->s.length()>1).forEach(s->System.out.println(s));

        // print only above 4 charater's name
       // names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

        //print only frist name it above 4 charater's
        //names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s)); // limit ,count is  terminal operator
        //terminal operator execute only internal operator return true


        //print name which have last letter as 'a' with uppercase
         Stream.of("anil","aruna","rama","youra","kumar").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    }
}
