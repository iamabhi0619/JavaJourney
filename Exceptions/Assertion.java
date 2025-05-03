
import java.util.Scanner;

public class Assertion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your Score= ");
            int marks = sc.nextInt();
            assert marks >= 0 && marks <= 100 : "Marks must be between 0 and 100";
            System.out.println("Score accepted");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
