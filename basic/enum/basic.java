import java.util.Scanner;

public class basic {

    enum Color {
        RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

        private String hexCode; // Variable to store hex code

        private Color(String hexcode) {
            this.hexCode = hexcode;
        }

        public String getHexCode() {
            return hexCode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Color.RED.getHexCode());
        sc.close();
    }

}