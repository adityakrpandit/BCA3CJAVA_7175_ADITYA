//- WaJP to get a number from the user and print whether it is positive or negative.


import java.util.Scanner;

public class Exprg06{
    public static void main(String args [])
    
     {
        Scanner input = new Scanner (System.in);

        System.out.print("please enter your Number: ");
        int num = input.nextInt();


        if(num>0){
             System.out.print(" positive ");
        } 
        else
        {
             System.out.print("Negative");
        }
    }
}