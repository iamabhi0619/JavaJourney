

// Problem Statement



// Alex needs a program to determine which of the two points is closer to the origin and to identify the orientation of the line segment connecting these two points. The orientation is determined based on the coordinates of the two points. 



// The program should:

// Calculate the distance of each point from the origin (0, 0).
// Determine which point is closer to the origin.
// Identify the orientation of the line segment between the two points based on their coordinates:
// Vertical: If the x-coordinates of both points are the same.
// Horizontal: If the y-coordinates of both points are the same.
// Oblique: If neither the x-coordinates nor the y-coordinates of the two points are the same.


// Assist Alex in the program.



// Formula:

//  distance1 = Math.sqrt(x1 * x1 + y1 * y1)

//  distance2 = Math.sqrt(x2 * x2 + y2 * y2)


import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double d1 = Math.sqrt(x1 * x1 + y1 * y1);
        double d2 = Math.sqrt(x2 * x2 + y2 * y2);

        System.out.print("Closer Distance: ");
        System.out.printf("%.1f\n", d1 < d2 ? d1 : d2);
        System.out.print("Orientation: ");
        if (x1 == x2)
            System.out.print("Vertical");
        else if (y1 == y2)
            System.out.print("Horizontal");
        else
            System.out.print("Oblique");

    }
}
