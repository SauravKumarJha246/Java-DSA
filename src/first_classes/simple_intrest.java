package first_classes;

import java.util.Scanner;

public class simple_intrest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter profit: ");
        double p = sc.nextDouble();
        System.out.print("enter rate: ");
        double r = sc.nextDouble();
        System.out.print("enter time: ");
        double t = sc.nextDouble();
        double SI = p*r*t/100.0 ;
        System.out.print("simple interest is: ");
        System.out.println(SI);

    }
}
