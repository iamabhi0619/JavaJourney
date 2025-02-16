import java.util.Scanner;

class EncoderDecoder {
    public String encode(String[] messages) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < messages.length; i++) {
            sb.append(messages[i]);
            if (i < messages.length - 1) {
                sb.append("#");
            }
        }
        return sb.toString();
    }

    public String[] decode(String encodedMessage) {
        return encodedMessage.split("#");
    }
}

public class EncodeDecode {
    public static void main(String[] args) {
        EncoderDecoder encoderDecoder = new EncoderDecoder();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] messages = userInput.split(" ");
        String encoded = encoderDecoder.encode(messages);
        System.out.println("Encoded: " + encoded);
        String[] decoded = encoderDecoder.decode(encoded);
        System.out.println("Decoded: ");
        for (String message : decoded) {
            System.out.println(message);
        }

        scanner.close();
    }
}
