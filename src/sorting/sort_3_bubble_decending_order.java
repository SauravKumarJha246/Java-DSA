package sorting;

public class sort_3_bubble_decending_order {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        swapped = true;
                    }
                }
            if (!swapped) {
                break;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

