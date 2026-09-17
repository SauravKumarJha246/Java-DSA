package Loops;
import java.util.Scanner;

public class Gp_1 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number of terms : ");
        int n = sc.nextInt();
        int a = 1 ;
        int r = 2 ;  // 1,2,4,8......uo to n terms
        for (int i = 1 ; i<=n ; i++){
            System.out.print(a + " ");
            a*=r;
        }
    }
}
