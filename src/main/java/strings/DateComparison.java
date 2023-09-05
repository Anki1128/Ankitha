package strings;

import java.util.Calendar;

public class DateComparison {
    public static void main(String[] args) {
        String inputDate = "2023-07-17";

        Calendar currentCalendar = Calendar.getInstance();
        Calendar givenCalendar = Calendar.getInstance();


        int currentYear = currentCalendar.get(Calendar.YEAR);
        int currentMonth = currentCalendar.get(Calendar.MONTH);
        int currentDay = currentCalendar.get(Calendar.DAY_OF_MONTH);

        int givenYear = Integer.parseInt(inputDate.substring(0, 4));
        int givenMonth = Integer.parseInt(inputDate.substring(5, 7));
        int givenDay = Integer.parseInt(inputDate.substring(8, 10));

        if (givenYear < currentYear ||
                (givenYear == currentYear && givenMonth < currentMonth) ||
                (givenYear == currentYear && givenMonth == currentMonth && givenDay < currentDay)) {
            System.out.println("The given date is before the current date.");
        } else if (givenYear > currentYear ||
                (givenYear == currentYear && givenMonth > currentMonth) ||
                (givenYear == currentYear && givenMonth == currentMonth && givenDay > currentDay)) {
            System.out.println("The given date is after the current date.");
        } else {
            System.out.println("The given date is the same as the current date.");
        }
    }
}

