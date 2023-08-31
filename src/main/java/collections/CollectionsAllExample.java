package collections;

import java.util.*;

public class CollectionsAllExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "one");
        System.out.println("Original List:- "+list);
        boolean b = Collections.replaceAll(list, "one", "three");
        System.out.println("Boolean: "+b);
        System.out.println("Value after replace:- "+list);
    }
}
