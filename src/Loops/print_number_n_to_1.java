package Loops;

import java.util.Scanner;

public class print_number_n_to_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre input : ");
        int n = sc.nextInt();
        for (int i=n; i>=1 ; i--){
            System.out.print(i+" ");
        }

    }
}
