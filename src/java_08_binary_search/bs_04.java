package java_08_binary_search;

import java.util.Scanner;
public class bs_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Only one element
        if (n == 1) {
            System.out.print(arr[0]);
            return;
        }

        // Single element at first position
        if (arr[0] != arr[1]) {
            System.out.print(arr[0]);
            return;
        }

        // Single element at last position
        if (arr[n - 1] != arr[n - 2]) {
            System.out.print(arr[n - 1]);
            return;
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // mid itself is the single element
            if (arr[mid] != arr[mid - 1] &&
                    arr[mid] != arr[mid + 1]) {

                System.out.print(arr[mid]);
                return;
            }

            // Pair starts at even index
            if (mid % 2 == 0) {

                if (arr[mid] == arr[mid + 1]) {
                    // Correct pairing -> single is on right
                    low = mid + 2;
                } else {
                    // Pairing broken -> single is on left
                    high = mid - 1;
                }

            }

            // Pair starts at odd index
            else {

                if (arr[mid] == arr[mid - 1]) {
                    // Correct pairing -> single is on right
                    low = mid + 1;
                } else {
                    // Pairing broken -> single is on left
                    high = mid - 1;
                }
            }
        }
    }
}