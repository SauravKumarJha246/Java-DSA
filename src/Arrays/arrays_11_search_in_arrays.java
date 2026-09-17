package Arrays;
import java.util.Scanner;
public class arrays_11_search_in_arrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("element of array: ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("entre element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        // linear search
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }


    }

}
