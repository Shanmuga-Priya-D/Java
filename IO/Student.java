class Student1
{
String name;
float[] marks=new float[5];
float total;
float avgmark;
Student1()
{
	name="ria";
	total=0;
	avgmark=0;
	for(int i=0;i<5;i++)
	{
		marks[i]=10;
	}
}
	
void display()
{
	System.out.println("name is"+name);
	for(int i=0;i<5;i++)
	{
		System.out.println("mark"+i+"is"+marks[i]);
	}
	System.out.println("total is"+total);
	System.out.println("average mark is"+avgmark);
}
void tot()
{

	for(int i=0;i<5;i++)
	{
		total=total+marks[i];
	}
	System.out.println("total is"+total);
	avgmark=total/5;
	System.out.println("average is"+avgmark);
}
}
class StudentDemo
{
	Student1 s1;
	Student1 s2;
	StudentDemo(Student1 s1,Student1 s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	void call()
	{
	s1.tot();
	s1.display();
	
	
	s2.tot();
	s2.display();
	}
		
		
}
class Student
{
	public static void main(String[] args)
	{
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		StudentDemo sd=new StudentDemo(s1,s2);
	    sd.call();
	}
}
	
		
	