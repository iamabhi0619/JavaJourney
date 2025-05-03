
import java.time.LocalDate;

public class LocalDateExample {
    
    // public static void main(String[] args) {
    // LocalDate date1 = LocalDate.now();
    // LocalDate dob = LocalDate.of(2004, 2, 6);
    // System.out.println(date1);
    // System.out.println("Date of Birth: " + dob);
    // System.out.println(dob.getDayOfWeek());
    // LocalDate date = LocalDate.parse("2004-01-01");
    // System.out.println(date);
    // System.out.println(date.plusDays(31));
    // System.out.println(date.plusMonths(2));
    // System.out.println(date.minusDays(1));
    // System.out.println(date.isLeapYear());
    // System.out.println(date.isAfter(date1));
    // System.out.println(date.isBefore(date1));
    // System.out.println(date.isEqual(date1));
    // }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today date:- " + today);
        LocalDate newDate = today.plusDays(45);
        System.out.println("New date:- " + newDate);
        System.out.println((newDate.isLeapYear()) ? "Leap Year" : "Not a Leap Year");
        System.out.println(newDate.getDayOfWeek());
    }
}
