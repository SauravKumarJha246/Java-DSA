package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class arrays_8_shallow_copy_deep_copy {
    public static void main(String[] args){
        int a = 4;
        int [] arr = {10,20,30,40};

        int [] x = arr;  // shallow copy
        x[0] = 35;
        System.out.println(x[0]);

        int [] y = Arrays.copyOf(arr,arr.length);   // deep copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }

}
