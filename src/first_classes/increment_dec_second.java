package first_classes;

public class increment_dec_second {
    static void main() {
        int x = 10;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        int y = x++;
        System.out.println(x+" "+y);
    }
}
