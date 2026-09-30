// Join Two Threads Which Perform loop Operations.........

class LoopThread extends Thread{
    private int iterations;

    public  LoopThread(int iterations){
        this.iterations = iterations;
    }
    @Override 
    public  void run(){
        for ( int i =0; i < iterations; i++) {
            try{
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch( InterruptedException ex){
                System.out.println("Exception has been Caught" + ex);
            }
            System.out.println(i);
            System.out.println(" ");
        }
    }
}
public class Threadloop {
    public static void main(String[] args) {
        
        LoopThread t1 = new LoopThread(5);
        LoopThread t2 = new LoopThread(5);

        t1.start();

        try {
            System.out.println("Current Thread : " + Thread.currentThread().getName());
            t1.join();
        } catch (InterruptedException ex){
            System.out.println("Exception has been Caught " + ex);
        }

        t2.start();

        try {
            System.out.println("Current Thread : " + Thread.currentThread().getName());
            t2.join();
        } catch (InterruptedException ex){
            System.out.println("Exception has been Caught " + ex);
        }
        
    }
}
