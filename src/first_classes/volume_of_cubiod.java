package first_classes;

import java.util.Scanner;

public class volume_of_cubiod {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length:");
        double l = sc.nextDouble();
        System.out.print("enter bredth:");
        double b = sc.nextDouble();
        System.out.print("enter height:");
        double h = sc.nextDouble();
        double volume = l*b*h;
        System.out.print("volume is :");
        System.out.println(volume);
    }
}
