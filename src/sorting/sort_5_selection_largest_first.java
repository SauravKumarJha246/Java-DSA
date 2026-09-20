package sorting;

public class sort_5_selection_largest_first {
    public static void main(String[] args){
        int[] arr = {5,3,8,2,1};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minindex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[minindex]){
                    minindex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
