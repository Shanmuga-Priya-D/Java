//same program by lambda expression 
import java.awt.*;
import java.awt.event.*;
class LoginFrame extends Frame 
{
Label l1,l2;
TextField tf1,tf2;
Button b;
String status="";


       LoginFrame()
     {

		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("login frame");
		this.setLayout(new FlowLayout());
		this.setBackground(Color.blue);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		l1=new Label("user name");
		l2=new Label("password");
        tf1=new TextField(20);
		tf2=new TextField(20);
		tf2.setEchoChar('*');
		
		
		b=new Button("Login");
		b.addActionListener(ae->{//lambda expression 
			String uname=tf1.getText();
		 String upwd=tf2.getText();
		 
		 if(uname.equals("priya")&& upwd.equals("priya"))
		 {
			 status="Success";
		 }
		 else
		 {
			 status="failure";
		 }
		 repaint();//to refresh the frame, paint method will be called internally,new  data will be updated.

		  });
		
		
		Font f=new Font("arial",Font.BOLD,25);
		l1.setFont(f);
		l2.setFont(f);
		tf1.setFont(f);
		tf2.setFont(f);
		b.setFont(f);
		
		
		this.add(l1);this.add(tf1);
		this.add(l2);this.add(tf2);
        this.add(b);
     }
	 
		 
     public void paint(Graphics g)
	 {
		 Font f=new Font("arial",Font.BOLD,35);
		 g.setFont(f);
		 this.setForeground(Color.red);
		 g.drawString("login status:"+status,50,300);
	 }
}
class Textevents1
{
	public static void main (String[] args)
	{
		LoginFrame lo=new LoginFrame();
	}
}	
