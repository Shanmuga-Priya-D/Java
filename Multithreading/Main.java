class Test implements Runnable
{
  public void run()
  {
   for(int i=0;i<5;i++)
    {
     System.out.println("i"+i);
    }
  }
}
class Main
{
  public static void main(String[] args)
  {
  Test t=new Test();
  Thread t1=new Thread(t);
  Thread t2=new Thread();

  System.out.println("Start");

   t1.start();//no error
   t2.start();//no error

   System.out.println("run");
   t1.run();//no error 
   t2.run();//no error
  
  // t.start();//error
    t.run(); //no error
 
   System.out.println("end");
  }
}  

