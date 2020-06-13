import java.util.*;
import java.io.*;
class Multi
{
   int count;
  void disp(int a[],int len,int c)
  {    count=0;
    for(int i =0;i<len;i++)
{

 if(a[i]==c)
 {
   count++;
 }  
    }
System.out.println("count"+count);
  }
 }
   
   class One extends Thread
   {
    Multi m;
int a[]=new int[10];
int n;

One(Multi m,int a[],int n)
{
      this.m =m;
 this.n=n;
 for(int i =0;i<a.length;i++)
 {
  this.a[i]=a[i];
 }
}

public void run()
{
 m.disp(a,a.length,n);
}

   }
   class Two extends Thread
   {
    Multi m;
int a[]=new int[10];
int n;

Two(Multi m,int a[],int n)
{
      this.m =m;
 this.n=n;
 for(int i =0;i<a.length;i++)
 {
  this.a[i]=a[i];
 }
}

public void run()
{
 m.disp(a,a.length,n);
}

   }
   
   class Three extends Thread
   {
    Multi m;
int a[]=new int[10];
int n;

Three(Multi m,int a[],int n)
{
      this.m =m;
 this.n=n;
 for(int i =0;i<a.length;i++)
 {
  this.a[i]=a[i];
 }
}

public void run()
{
 m.disp(a,a.length,n);
}

   }
   
   
   class Demo
   {
     public static void main(String[] args)throws IOException
{
   String[] str =new String[10];
int [] n=new int[10];

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
  System.out.println("enter the array elements");
 
  for(int i=0;i<10;i++)
  {
    str[i]= br.readLine();
n[i]=Integer.parseInt(str[i]);
  }
  for(int i=0;i<10;i++)
  {
System.out.println("Array elements are"+n[i]);
  }
Multi m= new Multi();
        One o=new One(m,n,1);
//One o1=new One(m,n,2);
//One o2=new One(m,n,3);
 Two t =new Two(m,n,2);
 Three th =new Three(m,n,3);
o.start();
t.start();
th.start();
 }
   }


