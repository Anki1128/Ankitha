package collections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
//        capitalCities.put("USA", "Washington DC");
//        capitalCities.put("India", "New Delhi");
//
//        System.out.println("capitalCities");

        System.out.println(capitalCities.get("England"));


    }
}
