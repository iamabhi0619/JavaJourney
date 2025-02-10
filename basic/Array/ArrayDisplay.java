
public class ArrayDisplay {

    public static int span(int arr[]) {
        int max = arr[0];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

        }
        return Math.abs(max - min);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5,6,8,-1,4,9,8,-4,10};
        display(arr);
        System.out.println(span(arr));
    }
}
