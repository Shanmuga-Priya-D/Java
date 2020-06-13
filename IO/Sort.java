import java.io.*;
class Sort
{
	public static void main(String[] args)throws IOException
	{
	int n;int i,j;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	    String str[]=new String[10];
        System.out.println("enter names ");
		for(i=0;i<10;i++)
		{
			str[i]=null;
		}
         for(i=0;i<10;i++)
		 {
			 
			 str[i]=br.readLine();
			 
		 }
    String temp;
	System.out.println("sorting...");
	for(i=0;i<=10;i++)
	{
		for(j=i+1;j<10;j++)
		{
			if(str[i].compareTo(str[j])>=0)
			{
			temp=str[i];
			str[i]=str[j];
			str[j]=temp;
			}
		}
	}
	System.out.println("after sorting");
	         for(i=0;i<10;i++)
		 {
			 
			 System.out.println(str[i]);
	
		 }
	

}
}