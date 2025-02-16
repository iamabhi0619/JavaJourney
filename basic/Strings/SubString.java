
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        // Type your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.nextLine();
        if (str.contains(sub)) {
            System.out.println("Found Substring: " + sub);
        } else {
            System.out.println("Substring not found");
        }
    }
}
