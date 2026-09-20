package sorting;

public class sort_2_bubble_sort {

    public static void main(String[] args){
        int[] arr = {5,-2,6,0,2,1,-3,2,4,-20,20};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i=0 ; i<n-1 ; i++){
            int swap = 0;
            for(int j=0; j<n-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
