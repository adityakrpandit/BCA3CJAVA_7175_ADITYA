// SET Thread Name and Priority 


class MyThread extends Thread {

    @Override 
    public void run() {
        System.out.println("Thread is Running with name:" + Thread.currentThread().getName());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());

    }
}

public class SetGetThread {

    public static void main(String[] args) {
        
        Thread myThread = new Thread(new MyThread());

        myThread.setName("MyThreadNm");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();

        System.out.println("Main thread name:" + Thread.currentThread().getName());
        System.out.println("Main thread Priority: " + Thread.currentThread().getPriority());
    }
}