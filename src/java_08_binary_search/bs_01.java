package java_08_binary_search;

import java.util.ArrayList;

public class bs_01 {

    static ArrayList<Integer> findFirstLast(int[] arr, int x) {

        ArrayList<Integer> ans = new ArrayList<>();

        // first occurrence
        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                first = mid;
                high = mid - 1;
            }
        }

        //  last occurrence
        low = 0;
        high = arr.length - 1;
        int last = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                last = mid;
                low = mid + 1;
            }
        }

        ans.add(first);
        ans.add(last);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;

        ArrayList<Integer> result = findFirstLast(arr, x);

        System.out.println("First occurrence: " + result.get(0));
        System.out.println("Last occurrence: " + result.get(1));
    }
}