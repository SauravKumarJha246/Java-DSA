package sorting;

public class sort_01 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        boolean result = isSorted(arr);
        System.out.println(result);
    }
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}