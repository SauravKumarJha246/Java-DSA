package Method;
import java.util.Scanner;
public class swap_of_two_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre number 1 : ");
        int a = sc.nextInt();
        System.out.print("entre number 2 : ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" "+ b);

    }
}
