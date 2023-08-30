package collections;

import java.util.ArrayList;

public class AddAllExample {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        System.out.println("Languages: " + languages);


        ArrayList<String> programmingLang = new ArrayList<>();

        programmingLang.addAll(languages);

        System.out.println("Programming Languages: " + programmingLang);


    }

}
