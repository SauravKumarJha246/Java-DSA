package Arrays;
import java.util.Scanner;
public class arrays_4_sum_of_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("entre array element : ");
        for(int i=0 ; i< n ; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum +=arr[i];
        }
        System.out.print(sum +" ");
    }
}
