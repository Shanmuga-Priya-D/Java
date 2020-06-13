import java.io.*;
class F
{
public static void main(String[] args) throws IOException
{
	String c;
	int fact=1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the number");
	c=br.readLine();
	System.out.println("c is"+c);
	Integer n=Integer.parseInt(c);
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial is "+fact);
}
}
	