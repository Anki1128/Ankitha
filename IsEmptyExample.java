package collections;

import java.util.ArrayList;

public class IsEmptyExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Newly Created ArrayList: " + names);


        boolean result = names.isEmpty(); //True
        System.out.println("Is the ArrayList empty? " + result);

        names.add("Ankitha");
        names.add("Desineni");
        System.out.println("Updated ArrayList: " + names);


        result = names.isEmpty();  // False
        System.out.println("Is the ArrayList empty? " + result);
    }
}

