//Maya is given a two-digit number and needs to find the sum of its digits. She wants to know if the sum is less than 10 or not. Your task is to write a program to calculate and print the sum of the digits and provide a message based on the result.

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>100){
            System.out.println("Not a valid two-digit number.");
            return;
        }
        int sum = (num/10)+(num%10);
        System.out.println("Digit Sum: "+sum);
        if(sum<10)
        System.out.println("The sum of the digits is less than 10.");
        else
        System.out.println("The sum of the digits is not less than 10.");
    }
}
