
import java.util.Arrays;

class Box<T> {
    private T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class Introduction {

    // Generic method
    public static <T> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        Box<String> str = new Box<>();
        str.setItem("Abhishek");
        System.out.println(str.getItem());

        String[] str2 = { "All", "Good" };
        swap(str2, 0, 1);
        System.out.println(Arrays.toString(str2));
    }
}
