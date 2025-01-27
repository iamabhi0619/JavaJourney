// Sarah, a student, struggles with math and wants to create a simple calculator. She asks for your help to build a program that rounds decimal numbers to different precision levels. Use a switch-case statement in Java to make it user-friendly. Walk Sarah through the process of rounding a decimal number to the nearest whole number, one decimal place, or two decimal places. Help her gain confidence in her math skills!


// The output is printed based on the choices.

// If the choice is 1, output prints "Rounded to the nearest whole number: "

// If the choice is 2, output prints "Rounded to one decimal place: "

// If the choice is 3, output prints "Rounded to two decimal place: "

import java.util.Scanner;

public class switchNumber {
    // You are using Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Rounded to the nearest whole number: " + Math.round(n) * 1.0);
                break;
            case 2:
                System.out.printf("Rounded to one decimal place: %.1f\n", n);
                break;
            case 3:
                System.out.printf("Rounded to two decimal places: %.2f\n", n);
                break;
            default:
                System.out.printf("Invalid choice.");
        }
    }
}
