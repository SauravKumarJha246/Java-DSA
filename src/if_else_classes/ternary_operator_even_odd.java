package if_else_classes;

import java.util.Scanner;

public class ternary_operator_even_odd {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number : ");
        int x = sc.nextInt();

//        if (x%2==0) System.out.println("even number");
//        else System.out.println("odd number");

        System.out.println((x%2==0) ? "even" : "odd");
    }
}
