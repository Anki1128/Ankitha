package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {


        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);
            numbers.add(4);
            numbers.add(1);
            numbers.add(5);

            Set<Integer> uniqueNumbers = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();

            for (Integer number : numbers) {
                if (!uniqueNumbers.add(number)) {

                    duplicates.add(number);
                }
            }

            System.out.println("Duplicates: " + duplicates);
        }
    }


