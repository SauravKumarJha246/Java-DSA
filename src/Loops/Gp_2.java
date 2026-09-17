package Loops;
import java.util.Scanner;                                    //  1
public class Gp_2 {                                          //  n
    static void main(String[] args){                         //  2
        Scanner sc = new Scanner(System.in);                 //  n-1
        System.out.print("entre number of terms : ");        //  3
                                                             //  n-2
        int n = sc.nextInt();
        for (int i=1 , j=n ; i<=j ; i++ , j-- ){
            System.out.println(i );
            System.out.println(j);
        }


    }
}
