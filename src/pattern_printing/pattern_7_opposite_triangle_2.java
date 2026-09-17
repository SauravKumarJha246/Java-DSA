package pattern_printing;

import java.util.Scanner;

public class pattern_7_opposite_triangle_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int a = n;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=a ; j++){
                System.out.print("*" +" ");
            }
            a--;
            System.out.println();
        }
    }
}