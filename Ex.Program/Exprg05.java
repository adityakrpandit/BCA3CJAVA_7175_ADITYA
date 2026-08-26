// WaJP to print numbers between 1 and 100 divisible by 3, 5 and both.

public class Exprg05{
    public static void main(String args[])
    
    {
    System.out.println("This Number Is Divisible by 3 ");


        for(int i=1; i<100; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }

        System.out.println("This Number Is Divisible by 5: ");

        for(int i=1; i<100; i++){
            if(i%5==0){
            System.out.println(i);
            }
        }


        System.out.println("This Number Is Divisible by 3 and 5: ");

        for(int i=1; i<100; i++){
            if(i%5==0 && i%3==0){
            System.out.println(i);
            }

            
        }
    }
}