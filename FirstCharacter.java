package collections;

import java.util.HashSet;
import java.util.Optional;

public class FirstCharacter {

        public static Optional<Character> findFirstRepeatedCharacter(String input) {
            HashSet<Character> seenCharacters = new HashSet<>();

            return input.chars().mapToObj(c -> (char) c).filter(c -> !seenCharacters.add(c)).findFirst();
        }

        public static void main(String[] args) {
            String input = "ankithadesineni";
            Optional<Character> firstRepeated = findFirstRepeatedCharacter(input);

            if (firstRepeated.isPresent()) {
                System.out.println("First Repeated Character: " + firstRepeated.get());
            } else {
                System.out.println("No repeated characters found.");
            }
        }
    }

