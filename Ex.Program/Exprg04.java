// WaJP to accept a number and check whether the number is even or odd. Prints 0 if number is odd else 1 if number is.

import java.util.Scanner;

public class Exprg04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Number =: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " This number is Even");
        } 
        else {
            System.out.println(num + " This number is Odd");
        }

        input.close();
    }
}
