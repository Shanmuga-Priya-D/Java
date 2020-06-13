import java.io.*;
class C1
{
public static void main(String[] args)throws IOException
{
	char c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter character");
c=(char)br.read();
if(c>=65&&c<=90||c>=97&&c<=122)//upper case 65-90 lower case 97-122
	System.out.println("it is a alphabet");
else if(c>=48&&c<=57)//number 48-57
	System.out.println("it is a number");
else if(c>=9&&c<=47||c<=58&&c>=126)
	System.out.println("it is a special character");//special character 9-47 and 58-126 
}
}
	
