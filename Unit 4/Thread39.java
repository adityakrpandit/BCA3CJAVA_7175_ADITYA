class a implements Runnable
  {
    public void run()
   {
     for(int i=1;i<=5;i++)
     {
       System.out.println("From thread a:" + i);
     }
    System.out.println("Exit from thread a");
   }
  }
class b implements Runnable
  {
    public void run()
   {
     for(int j=1;j<=5;j++)
     {
       System.out.println("From thread b:" + j);
     }
    System.out.println("Exit from thread b");
   }
  }
class c implements Runnable
  {
    public void run()
   {
     for(int k=1;k<=5;k++)
     {
       System.out.println("From thread c:" + k);
     }
    System.out.println("Exit from thread c");
   }
  }
class Thread39
  {
    public static void main(String args[])
    { 
      a a1=new a();
      b b1=new b();
      c c1=new c();
      Thread ta =new Thread(a1);
      System.out.println("Thread A started");
      ta.start();
      Thread tb =new Thread(b1);
      System.out.println("Thread B started");
      tb.start();
      Thread tc =new Thread(c1);
      System.out.println("Thread C started");
      tc.start();
    }
  }
    