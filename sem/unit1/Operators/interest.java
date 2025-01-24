import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();
        float SI = (principal * rate * time)/100;
        float total = principal + SI;
        System.out.printf("Simple Interest: %.2f\n",SI);
        System.out.printf("Total Amount: %.2f",total);
    }
}
