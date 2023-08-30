package string;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            throwKeyword();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            throwsKeyword();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    private static void throwKeyword() {
        throw new RuntimeException("This is a RuntimeException");
    }

    public static void throwsKeyword() throws ArithmeticException {
        throw new ArithmeticException("This is a ArithmeticException");
    }
}




