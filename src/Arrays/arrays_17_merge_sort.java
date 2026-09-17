package Arrays;

public class arrays_17_merge_sort {

    public static void main(String[] args) {

        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 7, 8};

        int[] c = new int[a.length + b.length];

        merge(c, a, b);

        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }

    public static void merge(int[] c, int[] a, int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare both arrays
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of a
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }
}