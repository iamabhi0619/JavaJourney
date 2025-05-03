
import java.io.FileInputStream;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("outputStream.txt");
        int byteData;
        while ((byteData = fis.read()) != -1) {
            System.out.print((char) byteData);
        }
        fis.close();
    }
}
