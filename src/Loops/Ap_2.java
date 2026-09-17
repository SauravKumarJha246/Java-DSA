package Loops;

  import java.util.Scanner;

public class Ap_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number of terms : ");
        int n = sc.nextInt();
        // 4,10,16,22....
        int a = 4 , d= 6;
        for(int i=1; i<=n ; i++){
            System.out.print(a +" ");
            a+=d;
        }
    }
}
