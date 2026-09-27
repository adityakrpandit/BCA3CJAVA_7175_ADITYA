// Exception Chaining

class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}

class ExceptionChaining
{
    void method1() throws MyException
    {
        throw new MyException("Exception from method1");
    }

    void method2() throws MyException
    {
        try
        {
            method1();
        }
        catch (MyException e)
        {
            throw new MyException("Exception from method2");
        }
    }
    void method3()
    {
        try
        {
            method2();
        }
        catch (MyException e)
        {
            System.out.println("Caught exception in method3:" + e.getMessage());
            if (e.getCause() != null)
            {
                System.out.println("Chained exception:"  + e.getCause().getMessage());
            }
        }
    }
}
public class ExceptionChain {
    public static void main(String[] args) {

        ExceptionChaining ec =new  ExceptionChaining();
        ec.method3();
    }
}