package if_else_classes;

import java.util.Scanner;

public class check_multiple_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int x = sc.nextInt();
        if (x%3 == 0 && x% 5== 0) {
            System.out.println("number is divisible by 3 and 5");
        }
//        else if (x%3 != 0 && x%5 != 0 ) {
//            System.out.println("number is not divisible by 3 and 5");
//        }
        else if (x%3==0) {
            System.out.println("divisible by 3");
        }
        else if (x%5==0) {
            System.out.println("divisible by 5");
        }
        else {
            System.out.println("not divisible by both");
        }

    }
}
