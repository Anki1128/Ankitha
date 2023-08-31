package collections;

public class StringReversal {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Desineni, Ankitha";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
