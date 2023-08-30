package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class FindDuplicates {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);
            numbers.add(4);
            numbers.add(1);
            numbers.add(5);


            Map<Integer, Long> occurrences = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));


            List<Integer> duplicates = occurrences.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

            System.out.println("Duplicates: " +duplicates);
        }
    }


