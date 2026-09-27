public class MultipleCatch {
    public static void main(String[] args) {
        
        try {
            int[] AdityaScores = new int[3];
            AdityaScores[0] = 95;
            AdityaScores[1] = 90;
            AdityaScores[2] = 85;

            AdityaScores[5] = 100;
        } catch (ArithmeticException e) {
           System.out.println("Error occured.");     
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index error: Aditya Accessed an invailed index !");
        } catch(Exception e){
            System.out.println("Genral Exception Handler:" + e);
        }
    }
}
