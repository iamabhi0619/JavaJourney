
import java.io.FileWriter;
import java.io.IOException;

public class Task {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("greeting.txt");
        fr.write("Welcome to Java I/O!");
        fr.close();
        System.out.println("File write Successful.!");
    }
}
