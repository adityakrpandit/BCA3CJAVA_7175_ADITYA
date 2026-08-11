//write a java program of addition subtraction multiplication division and modulus using inheritence?

import java.util.Scanner;
class calculate{
    int a,b;

    void add(){
        System.out.println("add = " + (a+b));
    }
    void sub(){
        System.out.println("sub= " + (a-b));
    }
    void multiply(){
        System.out.println("multiply = " + (a*b));
    }
    void divide(){
        System.out.println("divide = "+ (a/b));
    }
    void modulus(){
        System.out.println("modulus= " + (a%b));
    }
}

class input extends calculate{
 
 Scanner scn = new Scanner(System.in);

void getdata(){
 System.out.println("enter the value of a:");
  a = scn.nextInt();

 System.out.println("enter the value of b:");
  b = scn.nextInt();

 }


}

public class prg04{

    public static void main(String args[]){

        input ui = new input();

        ui.getdata();
        ui.add();
        ui.sub();
        ui.multiply();
        ui.divide();
        ui.modulus();
    }
}