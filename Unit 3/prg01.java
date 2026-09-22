public class prg01 {
    public static void main(String[] args) {
        String studentName = "Aditya";
        System.out.println(studentName +  " started math calculation... ");

        try {
            int totalMarks = 100;
            int subject = 0;
            int result = totalMarks / subject;

            System.out.println("Result : " + result );
        } catch (ArithmeticException e){
            System.out.println("Execption Caught:Division by zero is not allowed for "  + studentName + "!" );

            System.out.println("System Error Detail:" + e.getMessage());
        }
        System.out.println(studentName + "s program continues exuction smoothly");
    }
}
