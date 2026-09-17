package Arrays;

public class arrays_7_min_element {
    public static void main(String[] args){
        int[] arr = {4,2,-4,9,5,90};
        int min = arr[0] ;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<min) min = arr[i];
        }
        System.out.println(min);

    }
}
