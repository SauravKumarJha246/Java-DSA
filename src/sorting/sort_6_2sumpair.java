package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort_6_2sumpair {
    static void main(String[] args) {
        int[] arr = {4, 2, 0, 7, 6, 1};
        int target = 12;
        boolean result = twosum(arr, target);
        System.out.println("two sum: " + result);
    }
    static boolean twosum(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if(arr[i]+arr[j]==target) return true;
            else if (arr[i]+arr[j]>target) j--;
            else i++;
        }
        return false;
    }
}


