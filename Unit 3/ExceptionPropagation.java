// Exception Propagation

public class  ExceptionPropagation{
    public static void main(String[] args) {
        try
            {
                Method1();
            }
            catch(ArithmeticException e)
            {
                System.out.println("Exception caught in main:" + e);
            }
    }
    public static  void Method1()
    {
        Method2();
    }
    public static void Method2()
    {
        Method3();
    }
    public static void Method3()
    {
        int result = 10/0;
    }
}