public class TestFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Vivan opening database connection....");
            int data = 25 / 5;
            System.out.println("Data calculated:" + data);
        } catch (ArithmeticException e){
            System.out.println("Execption caught.");
        }finally {
            System.out.println("FINNALY BLOCK : Closing Vivan's Database connection gurranted !");
        }
    }
}