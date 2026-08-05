 // program pattern_1

import java.util.Scanner;

public class pattern_01{

    public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Value");
		int a = scn.nextInt();

    int i,j;
    for(i=0;i<=a;i++){
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
