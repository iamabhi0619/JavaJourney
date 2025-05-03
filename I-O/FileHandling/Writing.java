
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("outputStream.txt");
        String data = "Abhishek Kumar";
        fos.write(data.getBytes());
        fos.close();
        System.out.println("Data written using OutputStream.");
    }
}
