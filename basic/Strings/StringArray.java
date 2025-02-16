import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       char[] ch = str.toCharArray();
       System.out.println(Arrays.toString(ch));
    }
}
