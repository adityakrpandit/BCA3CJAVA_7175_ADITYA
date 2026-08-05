// program pattern_7....

import java.util.Scanner;

public class pattern_07{
	public static void main(String [] args){
		
		int num = 1;
		int i,j;
		
		for(i=1;i<=5;i++){
			
			for(j=1;j<=i;j++){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
