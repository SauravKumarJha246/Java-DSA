package Arrays;
import java.util.Scanner;
public class arrays_10_odd_index_even_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // for processing an array
        for(int i=0 ; i<n ; i++){
            if (i%2==0){
                arr[i] += 10;
            }
            else{
                arr[i] *= 2;
            }
        }

        // for output
        System.out.print("modified arrays: ");
        for(int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
