package Method;

public class argument_parameter_2 {
    public static void max(int a, int b, int c){
        if (a>=b && a>=c) System.out.println(a);
        else if (b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
    }

    static void main(String[] args) {
        max(7,-4,9);
    }
}
