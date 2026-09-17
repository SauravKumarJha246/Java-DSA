package Loops;
    import java.util.Scanner;
public class Ap_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number of terms : ");
         int n = sc.nextInt();
         int a = 99 , d = -4;
         for(int i=1;i>0;i++){
             System.out.print(a +" ");
             a-=d;

         }
    }
}
