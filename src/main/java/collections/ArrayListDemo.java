package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Suman");
        list.add("Pritam");
        list.add("Ankit");
        list.add("Ankit");
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());

        for (String res : list) {
            if (res.equalsIgnoreCase("suman")) ;
        }


        /* Functional interface - SAM(single abstract method); */
        Predicate<String> nameFilter = (res) -> res.equalsIgnoreCase("suman");

        List<String> list2 = list.stream().filter(nameFilter).collect(Collectors.toList());
        System.out.println(list2);

        //list.stream().map();


    }
}

