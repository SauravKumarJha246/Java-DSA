package Arrays;

public class arrays_13_two_sum {
    static void main(String[] args) {
        int[] arr = {5,6,8,10};
        int target = 17;
        boolean result = twosum(arr , target);

        System.out.println("two sum: " + result);
    }
    static boolean twosum (int arr[] ,int target){
        int n = arr.length;
        for(int i=0; i<n ; i++){
            for(int j = i+1 ; j<n;j++){
                if(arr[i]+arr[j]==target) {
                    return true;
                }
            }
        }
        return false;
    }
}
