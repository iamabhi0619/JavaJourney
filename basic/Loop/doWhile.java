// You are using Java
import java.util.*;
class main{
    public static void doWhile(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy = num;
        int n = 0;
        int sum = 0;
        do{
            n++;
            sum += num%10;
            num = num/10;
        }while(num!=0);
        if(n == sum){
            System.out.println("The number of digits in "+copy+" matches the sum of its digits.");
        }else{
            System.out.println("The number of digits in "+copy+" does not match the sum of its digits.");
        }
    }
}