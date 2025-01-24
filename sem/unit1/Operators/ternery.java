import java.util.Scanner;

public class ternery {
    // You are using Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean flag = (n1 + n2) == (n1 * n2);
        System.out.println(flag ? "Sum is Multiple of Product" : "Sum is Not Multiple of Product");
    }
}
