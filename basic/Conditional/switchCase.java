import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ch = sc.nextInt();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        switch (ch){
            case 1:
                double slope = (y2-y1)/(x2-x1);
                System.out.println("Slope: "+slope);
                break;
            case 2:
                double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
                System.out.printf("Distance: %.2f",distance);
                break;
            case 3:
                double mx = (x1+x2)/2;
                double my = (y1+y2)/2;
                System.out.printf("Midpoint: ("+mx+", "+my+")");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
     }
}
