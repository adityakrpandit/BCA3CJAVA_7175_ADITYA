//WaJP that takes three numbers from the user and prints the smaller and bigger number.

import java.util.Scanner;

public class Exprg07{
    public static void main(String args [])
    
     {
        Scanner input = new Scanner (System.in);

        System.out.print("please enter your 1st Number: ");
        int num1 = input.nextInt();

        System.out.print("please enter your 2nd Number: ");
        int num2 = input.nextInt();

        if(num1>num2){
             System.out.print(num1 + "is the biggest Number: ");
        }
        else if(num1==num2){
             System.out.print(num1 + "Equal to "+num2);
        }
        else
        
        {
             System.out.print(num2 + " is the biggest Number: ");
        }
    }
}