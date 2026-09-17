package Arrays;

public class arrays_12_product_of_arrays {
    static void main(String[] args) {
        int[] arr = {2,3,4,10};
        int product = 1;
        for(int i=0 ; i<arr.length ; i++){
            product *= arr[i];
        }
        System.out.print(product);
    }
}
