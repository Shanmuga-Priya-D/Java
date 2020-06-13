class Prior extends Thread
{
public void run()
{
System.out.println("run method");
String name=Thread.currentThread().getName();
int prio=Thread.currentThread().getPriority();

System.out.println("thread name is"+name);
System.out.println("thread priority is"+prio);
}
public static void main(String args[])throws InterruptedException
{
Prior p1=new Prior();
Prior p2=new Prior();
Prior p3=new Prior();
  
p1.setPriority(Thread.MAX_PRIORITY);
p1.setPriority(Thread.MIN_PRIORITY);
p3.setPriority(Thread.NORM_PRIORITY);


p1.start();
p2.start();
p3.start();

}
}