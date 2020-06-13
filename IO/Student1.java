import java.io.*;
import java.util.*;
class Student1
{
String regno;
String name;
String address;

public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Student1[] s=new Student1[2];
for(int q=0;q<2;q++)
{
	 s[q] = new Student1();
}
System.out.println("enter student details");
for(int i=0;i<2;i++)
{
System.out.println("enter name");
s[i].name=br.readLine();
System.out.println("enter reg-no");
s[i].regno=br.readLine();
System.out.println("enter address");
s[i].address=br.readLine();
}
for(int j=0;j<2;j++)
{
System.out.println(s[j].name+""+s[j].regno+""+s[j].address);
}
ArrayList<Student1> al=new ArrayList<Student1>();
for(int k=0;k<2;k++)
{
al.add(s[k]);
}
//System.out.println(al);
for(Student1 x:al)
{
System.out.println(x.name);
System.out.println(x.regno);
System.out.println(x.address);
}
}
}
