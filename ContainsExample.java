package collections;

import java.util.ArrayList;

public class ContainsExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        System.out.println("Number ArrayList: " + numbers);


        System.out.print("Is 3 present in the arraylist: ");
        System.out.println(numbers.contains(3));

        System.out.print("Is 1 present in the arraylist: ");
        System.out.println(numbers.contains(1));

    }
}
