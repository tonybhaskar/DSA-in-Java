
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // if we can use more memory then
        int[] newArray = new int[arr.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[arr.length - 1 - i];
        }

        // to reverse an array in place
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("using another array");
        Arrays.stream(newArray).forEach(System.out::println);

        System.out.println();
        System.out.println("inplace reverse");
        Arrays.stream(arr).forEach(System.out::println);

    }
}
