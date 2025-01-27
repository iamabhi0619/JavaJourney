// You are using Java
import java.util.*;
class ticket
{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        String concert_name = sc.nextLine();
        int seat_number = sc.nextInt();
        float ticket_price = sc.nextFloat();
        boolean ticket_availability = sc.nextBoolean();
        
        //printing the ticket
        
        System.out.println("Concert Name: "+concert_name);
        System.out.println("Seat Number: "+seat_number);
        System.out.printf("Ticket Price: %.2f\n",ticket_price);
        System.out.println("Available: "+ticket_availability);
    }
}