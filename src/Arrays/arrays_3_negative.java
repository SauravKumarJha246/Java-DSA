package Arrays;
import java.util.Scanner;
public class arrays_3_negative {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("entre array size : ");
        int n = sc.nextInt();

        //for input

        int[] arr = new int[n];
        System.out.print("entre array element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //for output

        for(int i =0;i<n;i++)
           if (arr[i]<0) System.out.print(arr[i] +" ");
    }
}
