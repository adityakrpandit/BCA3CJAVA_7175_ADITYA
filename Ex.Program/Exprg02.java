// WaJP to print the area and perimeter of a rectangle and circle.

import java.util.Scanner;

public class Exprg02 {
    
    public static void main(String[] args) {
        
        Scanner input = new  Scanner(System.in);

        System.out.print("Length of rectangele: ");
        int Length = input.nextInt();

        System.out.print("Width of rectangle: ");
        int Width = input.nextInt();

        int perimeter = 2* (Length*Width);
        int area = Length*Width;

        System.out.println("perimeter of rectangle :" + perimeter);
        System.out.println("Area of rectangle :" + area);

    }
    
}
