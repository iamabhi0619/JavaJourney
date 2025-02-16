import java.util.Scanner;


class FilePathEncoderUtility {
    static String encodeFilePath(String path) {
        StringBuilder encodedPath = new StringBuilder();
        
        for (char ch : path.toCharArray()) {
            if (ch == ' ') {
                encodedPath.append("[space]");
            } else {
                encodedPath.append(ch);
            }
        }
        
        return encodedPath.toString();
    }
}

public class FileEncoder {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        String encodedPath = FilePathEncoderUtility.encodeFilePath(filePath);
        System.out.println(encodedPath);
        scanner.close();
    }
}
