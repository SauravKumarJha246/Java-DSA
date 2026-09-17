package Method;
import java.util.Scanner;
public class permutation_combnation {
    public static int fact (int x) {
        int f = 1;
        for(int i =1 ; i<=x ; i++){
            f *= i ;
        }
        return f;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre n : ");
        int n = sc.nextInt();
        System.out.print("entre r : ");
        int r = sc.nextInt();

        System.out.print("combination is : ");
        int ncr = fact(n)/fact(r)*fact(n-r);
        System.out.println(ncr);

        System.out.print("permutation is : ");
        int npr = fact(n)/fact(n-r);
        System.out.print(npr);

    }

}
