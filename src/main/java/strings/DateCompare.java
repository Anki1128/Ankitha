package strings;

import java.time.LocalDate;

public class DateCompare {
    public static void main(String[] args) {
        String inputDate = "2023-08-17";

        LocalDate currentDate = LocalDate.now();
        LocalDate givenDate = LocalDate.parse(inputDate);

        if (givenDate.isBefore(currentDate)) {
            System.out.println("The given date is before the current date.");
        } else if (givenDate.isAfter(currentDate)) {
            System.out.println("The given date is after the current date.");
        } else {
            System.out.println("The given date is the same as the current date.");
        }
    }
}
