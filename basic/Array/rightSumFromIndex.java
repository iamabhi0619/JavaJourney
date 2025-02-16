import java.util.Scanner;

public class rightSumFromIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }
            if (arr[i] > rightSum) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
