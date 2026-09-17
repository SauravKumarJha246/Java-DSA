package Arrays;
import java.util.Scanner;
public class arrays_14_second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("element of arrays: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("first maximum: " + max);

        int smax = arr[0];
        for(int i=0 ; i<n;i++){
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
        }
        System.out.print("second maximum: "+ smax);
    }
}
