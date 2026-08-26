// 1. WaJP that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Exprg01 { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter yoour number:  ");
        int num = input.nextInt();

        for  (int i=1; i<=10; i++)
        {
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
    
}
