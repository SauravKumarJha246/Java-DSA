package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class arrays_9_sort_of_arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("entre element of arrays: ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
