package collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsDemo {


    public static void main(String[] args) {

        List<String>  list = Stream.of("suman","laxmi").map(e->e.toUpperCase()).collect(Collectors.toList());

        System.out.println(list);


        List<List<String>> l = Arrays.asList(Arrays.asList("suman","Ankitha"),Arrays.asList("Laxmi","ramya")).stream().collect(Collectors.toList());

        List<String> flatmap = l.stream().flatMap(e->e.stream().map(n->n.toUpperCase())).collect(Collectors.toList());

        System.out.println(flatmap);










    }
}
