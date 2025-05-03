
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a line of text:");
            String line = br.readLine();
            System.out.println("You entered: " + line.toUpperCase());

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
