
import java.util.Arrays;

public class ArraysTraverse {

    public static void main(String[] args) {
        /*  
        if we want to traverse through the array we have multiple options
         */
        int[] arr = {1, 2, 3, 4, 5, 6};

        //using for loop
        System.out.println("using for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("using for each loop");

        // using for each loop
        for (int element : arr) {
            System.out.println(element);
        }

        System.out.println("using while loop");

        // using while loop
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        System.out.println("using stream api");

        // using stream api
        Arrays.stream(arr).forEach(System.out::println);
    }
}
