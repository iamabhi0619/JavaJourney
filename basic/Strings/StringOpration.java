import java.util.Scanner;


class StringOps {
    String manipulate(String s){
        return new StringBuilder(s).reverse().toString();
    }
    String manipulate(String s1, String s2){
        return s1+s2;
    }
    String manipulate(String[] str){
       if(str.length == 1){
           return manipulate(str[0]);
       }else if(str.length == 2){
           return manipulate(str[0], str[1]);
       }else{
           return "Invalid input";
       }
    }
 }
public class StringOpration {
    public static void main(String[] args) {
        StringOps seetha = new StringOps();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] input_data = input.split(" ");
        String result = seetha.manipulate(input_data);
        System.out.println(result);
    }
}
