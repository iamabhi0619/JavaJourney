package basic.Static;

import java.util.Scanner;

public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t_movie = sc.nextInt();
        int t_break = sc.nextInt();
        int a_break = (t_movie - 1) / t_break;
        int time = (t_movie * 45) + (a_break * 15);
        System.out.println(time + " minutes");
    }
}
