package Arrays;

import java.util.Scanner;

public class arrays_5_product_of_element_of_arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("entre array element : ");
        for(int i=0 ; i< n ; i++) {
            arr[i] = sc.nextInt();
        }
        int pro = 1;
        for(int i =0 ; i<n ;i++){
            pro *=arr[i];
        }
        System.out.print(pro +" ");
    }
}

