class MyThread implements Runnable
{
   String message;
   MyThread(String msg)
     {
     message=msg;
     }
   public void run()
  {
   for(int i=0;i<5;i++)
   {
     try
      {
      System.out.println("run method"+message);
      Thread.sleep(1000);
      }
     catch(InterruptedException e)
     {
     System.out.println("exception in thread");
     }
  }
 }
}
public class MainThread
{
   public static void main(String[] args)
     {
	  MyThread obj1=new MyThread("mythread obj1");
	  MyThread obj2=new MyThread("mythread obj2");
	  
	  
	  Thread t1=new Thread(obj1);
	  Thread t2=new Thread(obj2);
	  
	  t1.start();
	  t2.start();
	  }
}
