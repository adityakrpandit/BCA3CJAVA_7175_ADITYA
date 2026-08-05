// program pattern_2

import java.util.Scanner;

public class pattern_2{

    public static void main(String args[]){
		

    int i,j;
    for(i=1;i<=5;i++){
		
        for(int space=1; space<=5-i;space++){
            System.out.print("  ");
        }
		
		for(j=1;j<=i;j++){
            System.out.print(" *");
		}
        System.out.println("");
    }
    }
}
