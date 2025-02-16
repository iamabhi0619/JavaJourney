import java.util.*;
class NextMeetingDay {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        public Day nextDay() {
            return values()[(this.ordinal() + 1) % values().length];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim().toUpperCase();
        sc.close();
        try {
            Day currentDay = Day.valueOf(input);
            System.out.println(currentDay.nextDay());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input");
        }
    }
}