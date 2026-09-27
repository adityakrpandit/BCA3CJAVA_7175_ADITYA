public class Throw
{
    static void checkVotingEligibility(int age,String studentName)
    {
        if(age<18)
        {
            throw new ArithmeticException(studentName + " is not eligible to vote (age must be 18+)");

        }
        else
        {
            System.out.println(studentName + " is eligible to vote!");
        }
    }

 public static void main(String[] args) 
    {
        try
        {
            System.out.println("Checking registration for Aditya...");
            checkVotingEligibility(16,"Aditya");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught explicit exception: " + e.getMessage());
        }
    }
}
