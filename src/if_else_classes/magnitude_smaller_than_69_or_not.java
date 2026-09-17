package if_else_classes;

import java.util.Scanner;

public class magnitude_smaller_than_69_or_not {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int x = sc.nextInt();
        if (x>=0 && x<=69) System.out.println(x);
        else if (x<0 && x>=-69) System.out.println(-x);
        else System.out.println("invalid number");


    }

}
