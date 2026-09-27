class InvalidStudentMarksException extends Exception
{
    public InvalidStudentMarksException(String message)
    {
        super(message);
    }
}

public class CustomException
{
    static void validateAdityaMarks(double marks) throws InvalidStudentMarksException
    {
        if(marks<0.0||marks>100.0)
        {
             throw new InvalidStudentMarksException("Marks must be between 0 and 100! Input was: " + marks);
        }

        else 
        {
            System.out.println("Aditya's marks validate Successfullly.");
        }

    }

    public static void main(String args[])
    {
         try
         {
            System.out.println("Submitting Exam Score for Aditya...");
            validateAdityaMarks(105.5);

         }
         catch(InvalidStudentMarksException e)
         {
             System.out.println("Custom exception caught:" + e.getMessage());
         }
    }
}