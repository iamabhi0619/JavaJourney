
import java.util.Scanner;

class VelocityCalculator {

    public static int calculateVelocity(int d, int t) {
        return d / t;
    }

    public static double calculateVelocity(double d, double t) {
        return d / t;
    }
}

public class Distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInt = scanner.nextInt();
        int timeInt = scanner.nextInt();

        double distanceDouble = scanner.nextDouble();
        double timeDouble = scanner.nextDouble();
        int velocityInt = VelocityCalculator.calculateVelocity(distanceInt, timeInt);
        double velocityDouble = VelocityCalculator.calculateVelocity(distanceDouble, timeDouble);

        System.out.println("Velocity with integer inputs: " + velocityInt + " m/s");
        System.out.printf("Velocity with double inputs: %.2f m/s", velocityDouble);
        scanner.close();
    }
}
