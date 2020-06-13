import  AgeException.*;
import java.util.Scanner;
class TestMain
{
Scanner sc=new Scanner(System.in);
String name;
int regno;
int age;

void get()
{
System.out.println("enter name regno age");
name=sc.nextLine();
regno=sc.nextInt();
age=sc.nextInt();
}

 void display()
	{
       try	  
        {
        if((age<=17)||(age>=25))
          {
          throw new AgeLimitCrossedException();
          }
        else
          {
           System.out.println("name is"+name);
           System.out.println("reg no is"+regno);
           System.out.println("age is"+age);
          }
		}
		catch(AgeLimitCrossedException e)
		{
			System.out.println("invalid age");
		}
	}

}
public class Main  extends TestMain
{
	
public static void main(String[] args)
   {

TestMain[] t=new TestMain[2];
  for(int k=0;k<2;k++)
  {
	  t[k]=new TestMain();
 
  }
    
    for(int i=0;i<2;i++)
     {
     t[i].get();
     }
     for(int j=0;j<2;j++)
	 {
		 System.out.println("details of"+(j+1)+"student");
		 t[j].display();
	 }
   }
}
		
   
