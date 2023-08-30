package collections;

import java.util.ArrayList;

public class ReplaceAllExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("english");
        languages.add("maths");
        languages.add("telugu");
        languages.add("science");
        System.out.println("ArrayList: " + languages);

        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}
