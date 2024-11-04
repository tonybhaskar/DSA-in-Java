
import java.util.Arrays;

public class ArraysCode {

    public static void main(String[] args) {
        int[] arr; // this is called declaration

        arr = new int[5]; // this is called initialization
        // where 5 is the size of the array 

        // now we can assign values to the array
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        // we can access values using index
        System.out.println(arr[0]);

        // we can update the values
        arr[0] = 100;
        System.out.println(arr[0]);

        /* 
            but we can add more values than the size and also we can delete but we can make them as zeros which is default value for the int and null which is default value for String type arrays and false which is default value for the boolean array
         */
        // print array items
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
            another option is by using Arrays final class
            which provides various method to handle arrays 
            like
            sorting, searching etc
        
            and here the toString returns the contents of the array in string form
         */
        System.out.println(Arrays.toString(arr));
    }
}
