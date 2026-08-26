// WaJP to swap two variables with and without 'temp' variable.

import java.util.Scanner;
public class Exprg03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Pleser enter Value of A: ");
        int a = input.nextInt();

        System.out.print("Plese enter your of B: ");
        int b = input.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swip This Value: ");
        System.out.println(a + " Value of A");
        System.out.println(b + " Value of B");
    }
    
}
