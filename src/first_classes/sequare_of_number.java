package first_classes;

import java.util.Scanner;

public class sequare_of_number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        double n = sc.nextDouble();
        double sequare = n*n;
        System.out.print("sequare is : " +sequare);
//        System.out.println(sequare);

    }
}
