//WRITE A JAVA PROGRAM TO PERFORM DIFFERENT ARITHMETIC OPERATION WITHOUT COMMAND LINE ARGS

import java.util.Scanner;

public class prg4{
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your firstNumber: ");
        int a = input.nextInt();

	System.out.print("Enter your secondNumber: ");
        int b = input.nextInt();

	 System.out.println(a+b);
 	 System.out.println(a-b);
	 System.out.println(a*b);
         System.out.println(a/b);
	
     
	}
}