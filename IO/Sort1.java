import java.io.*;
class Sort1
{       //for numbers
	public static void main(String[] args)throws IOException
	{
	int n;int i,j;
	Integer a[]=new Integer[10];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	    String str[]=new String[10];
        System.out.println("enter numbers ");
		for(i=0;i<10;i++)
		{
			str[i]=null;
		}
		
         for(i=0;i<10;i++)
		 {
			 
			 str[i]=br.readLine();
			 
		 }
		 for(i=0;i<10;i++)
		{
		a[i]=Integer.parseInt(str[i]);	
		}
    int temp;
	System.out.println("sorting...");
	for(i=0;i<=10;i++)
	{
		for(j=i+1;j<10;j++)
		{
			if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	System.out.println("after sorting");
	         for(i=0;i<10;i++)
		 {
			 
			 System.out.println(a[i]);
	
		 }
	

}
}