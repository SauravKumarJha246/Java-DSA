package Loops;

import java.util.Scanner;

public class composite_number {  // more than 2 factor : 1 and n itself factor now we have to find one factor in 2 and n-1
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int n = sc.nextInt();
        for (int i = 2; i<=n-1;i++){
            if (n%i==0){
                System.out.println("composite number" );
                break;
            }
            else System.out.println("not composite number");
            break;

        }
    }
}
