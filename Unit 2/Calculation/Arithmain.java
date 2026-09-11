import java.util.Scanner;
import addition.add;
import subtraction.sub;
import division.div;
import multiplication.multi;
import modulation.mod;

public class Arithmain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int n2 = sc.nextInt();

        add a = new add();
        a.caladd(n1, n2);
        a.dispadd();

        sub s = new sub();
        s.calsub(n1, n2);
        s.dispsub();

        multi m = new multi();
        m.calmulti(n1, n2);
        m.dispmulti();

        div d = new div();
        d.caldiv(n1, n2);
        d.dispdiv();

        mod z = new mod();
        z.calmod(n1, n2);
        z.dispmod();

        sc.close();
    }
}