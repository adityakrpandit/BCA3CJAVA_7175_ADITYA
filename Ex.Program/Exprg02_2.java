// WaJP to print the area and perimeter of a rectangle and circle.

import java.util.Scanner;
public class Exprg02_2 {
    
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);

        System.out.print("Radius of circle: ");
        float r = input.nextFloat();

        double pi = 3.14;
        double perimeter = 2 * pi * r;
        double area = pi * r * r;

        System.out.println("perimeter of circle: " + perimeter );
        System.out.println("Area of circle: " + area);
    }
}
