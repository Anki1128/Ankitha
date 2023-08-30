package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        Collections.sort(numbers);
        System.out.println(numbers);

        LinkedList<Integer> linkedList = new LinkedList<>();

        numbers.add(20);
        numbers.add(40);

        System.out.println(linkedList);


        System.out.println("\n iteration #1: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        numbers.remove(numbers.size() - 1);
        numbers.remove(0);

        System.out.println("\n iteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }
    }
}
