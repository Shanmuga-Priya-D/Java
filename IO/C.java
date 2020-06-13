import java.io.*;
class C
{
public static void main(String[] args)throws IOException
{
	char c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter character");
c=(char)br.read();
if(c>='a'&&c<='z'||c>='A'&&c<='Z')
	System.out.println("it is a alphabet");
else if(c>='0'&&c<='9')
	System.out.println("it is a number");
else
	System.out.println("it is a special character");
}
}
	
