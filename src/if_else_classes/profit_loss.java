package if_else_classes;

import java.util.Scanner;

public class profit_loss {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter cost price : ");
        double cp = sc.nextDouble();
        System.out.print("enter selling price : ");
        double sp = sc.nextDouble();

//        if ( sp>cp ){
//            System.out.print("profit");
//        }
//        else{
//            System.out.print("loss");
//        }

        if(sp>cp) System.out.print("profit is " + (sp-cp));
        else if (cp>sp) System.out.print("loss is " +(cp-sp));
        else System.out.print("no profit no loss");


//        if(sp>cp) System.out.print("profit % is " + (sp-cp)/(sp+cp)*100);
//        if(cp>sp) System.out.print("loss % is " +(cp-sp)/(sp+cp)*100);
//        if(sp==cp) System.out.print("no profit no loss");

    }
}

