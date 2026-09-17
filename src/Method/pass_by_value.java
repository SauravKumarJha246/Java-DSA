package Method;

public class pass_by_value {
    public static void saurav(int x){
        x = 10 ;
        System.out.println(x);
    }

    static void main(String[] args) {
        int p = 5;
        System.out.println(p);
        saurav(4);
        System.out.println(p);
    }
}
