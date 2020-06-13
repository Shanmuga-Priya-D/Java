import java.io.*;
class CountChar
{
int c;
  int count(char a,char[] ch,int l)
       {
		   c=0;
        for(int i=0;i<l;i++)
          {
            if(a==ch[i])
               {
                  c++;
               }
          }
		  return c;
	   }

}
class A extends Thread
{
	CountChar t;
	char c='a';
	int length;
	char[] ch=new char[20];
	A(CountChar t,char[] ch,int l)
	{
		this.t=t;
		length=l;
		for(int i=0;i<l;i++)
		{
			this.ch[i]=ch[i];
		}
	}
	public void run()
	{
		System.out.println("count of A is"+t.count(c,ch,length));
	}
}
class B extends Thread
{
	CountChar t;
	char c='b';
	int length;
	char[] ch=new char[20];
	B(CountChar t,char[] ch,int l)
	{
		this.t=t;
		length=l;
		for(int i=0;i<l;i++)
		{
			this.ch[i]=ch[i];
		}
	}
	public void run()
	{
		System.out.println("count of  B is"+t.count(c,ch,length));
	}
}
class C extends Thread
{
	CountChar t;
	char c='c';
	int length;
	char[] ch=new char[20];
	C(CountChar t,char[] ch,int l)
	{
		this.t=t;
		length=l;
		for(int i=0;i<l;i++)
		{
			this.ch[i]=ch[i];
		}
	}
	public void run()
	{
		System.out.println("count of C is"+t.count(c,ch,length));
	}
}
class Counting
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String s;
		s=br.readLine();
		int l=s.length();
		char[] ch=new char[l];
		 ch=s.toCharArray();
		
		CountChar c=new CountChar();
		A a=new A(c,ch,l);
		B b=new B(c,ch,l);
		C z=new C(c,ch,l);
		a.start();
		b.start();
		z.start();
	}
}