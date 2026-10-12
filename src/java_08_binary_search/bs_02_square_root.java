package java_08_binary_search;
import java.util.Scanner;
public class bs_02_square_root {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre n : ");
        int n = sc.nextInt();
        int low=1,high=n;
        int ans = 0;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(mid*mid>n) high=mid-1;
            else if(mid*mid<n){
                ans=mid;
                low=mid+1;
            }
            else{
                ans=mid;
                break;
            }
        }
        System.out.print("square root: "+ ans);

    }
}
