package Arrays;

public class arrays_15_for_each_loop {
    static void main(String[] args) {
        int[] arr = {5, 6, 2, 5, 9};
        // use for traverse
        for(int ele : arr){
            System.out.println(ele+" ");
        }

        for(int i=0;i<arr.length;i++){
            arr[i] *= 2;
            System.out.print(arr[i]+" ");
        }

    }
}
