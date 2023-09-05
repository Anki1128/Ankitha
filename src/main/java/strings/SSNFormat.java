package strings;

public class SSNFormat {
    public static void main(String[] args) {
        long number = 152798780;

        if (isValidNumber(number)) {
            String ssn = formatSSN(number);
            System.out.println("SSN: " + ssn);
        } else {
            System.out.println("Invalid input. Please enter a 9-digit number.");
        }
    }

    public static boolean isValidNumber(long number) {
        String numStr = String.valueOf(number);
        return numStr.length() == 9;
    }

    public static String formatSSN(long number) {
        String numStr = String.valueOf(number);
        return numStr.substring(0, 3) + "-" + numStr.substring(3, 5) + "-" + numStr.substring(5);
    }

}
