
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Birthdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter DOB in YYYY-MM-DD");
        String d = sc.nextLine();
        LocalDate dob = LocalDate.parse(d);
        Period age = Period.between(dob, LocalDate.now());
        System.out.println(age.getYears());
        System.out.println("Is your Birthdate a leap year:- " + dob.isLeapYear());

        sc.close();
    }
}
