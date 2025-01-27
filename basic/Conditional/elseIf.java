// Maria is building a program to classify triangles based on side lengths. The program should take three integer inputs and identify if the triangle is equilateral, isosceles, scalene, or right-angled. Help Maria create this classification program.

// Note: Equilateral - all sides equal; Isosceles - two sides equal; Scalene - all sides different. The square of one side equals the sum of the squares of the other two sides, for a triangle to be right-angled.

import java.util.Scanner;

public class elseIf {
    // You are using Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.print("The triangle is ");
        if (n1 == n2 && n1 == n3)
            System.out.println("equilateral");
        else if (n1 == n2 || n1 == n2 || n2 == n3)
            System.out.println("isosceles");
        else
            System.out.println("scalene");
        boolean flag = n1 * n1 == n2 * n2 + n3 * n3 || n2 * n2 == n1 * n1 + n3 * n3 || n3 * n3 == n2 * n2 + n1 * n1;
        if (flag)
            System.out.println("The triangle is also right-angled");
    }
}
