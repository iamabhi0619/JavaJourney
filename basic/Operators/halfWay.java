import java.util.Scanner;

public class halfWay {
    // You are using Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean flag = (n2 - n1) == (n3 - n2);

        System.out.println(flag);
        if (flag)
            System.out.println("The second integer is halfway between the first and third integers.");
        else
            System.out.println("The second integer is not halfway between the first and third integers.");

    }
}
