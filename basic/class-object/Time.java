import java.util.Scanner;


// You are using Java
class SecondsToTime {
    //type your code here
    int second;
    SecondsToTime(int s){
        second = s;
    }
    public void displayTime(){
        int hrs = (second / 3600);
        int min = ((second % 3600) /60);
        int sec = ((second % 3600)%60);
        System.out.printf("%02d:%02d:%02d",hrs,min,sec);
    }
 }
public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        scanner.close();

        SecondsToTime timeConverter = new SecondsToTime(totalSeconds);
        timeConverter.displayTime();
    }
}
