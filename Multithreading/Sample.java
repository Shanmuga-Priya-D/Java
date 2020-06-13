class Oper extends Thread
{
public void run()
{
System.out.println("Addition");
int a=10,b=5;
int c=a+b;
System.out.println("sum is"+c);
}
public void run(int x)
{
System.out.println("Subtraction");
int a=10,b=5;
int c=a-b;
System.out.println("sub is"+c);
}
public void start(int a)
{
 this.run(a);
}

}
class Sample
{
public static void main(String[] args)
{
Oper o1=new Oper();
Oper o2=new Oper();
o1.start();
o2.start(10);
}
}

