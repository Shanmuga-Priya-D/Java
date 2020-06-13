import java.awt.*;
import java.awt.event.*;


class RegistrationFrame extends Frame implements ActionListener
{
    Label l1; Label l2; Label l3; Label l4;
    TextField tf1,tf2,tf3;
    TextArea ta;
    Button b;
	
	String sid="",sname="",squal="",saddr="";
	
	RegistrationFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("registration frame");
		this.setBackground(Color.red);
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		l1=new Label("Student id");
		l2=new Label("student name");
		l3=new Label("student qualification");
		l4=new Label("student address");
		
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		
		ta=new TextArea(5,20);
		
		b=new Button("Registration");
		b.addActionListener(this);

        Font f=new Font("arial",Font.BOLD,15);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		tf1.setFont(f);
		tf2.setFont(f);
		tf3.setFont(f);
		ta.setFont(f);
		b.setFont(f);
		
		b.setFont(f);
		 
	    this.add(l1); this.add(tf1);
		this.add(l2); this.add(tf2);
		this.add(l3); this.add(tf3);
		this.add(l4); this.add(ta);
		this.add(b);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		 sid=tf1.getText();
		 sname=tf2.getText();
		 squal=tf3.getText();
		 saddr=ta.getText();
		
		repaint();
	}
	public void paint(Graphics g)
	{
	     Font f=new Font("arial",Font.BOLD,20);
		 g.setFont(f);
	
		 g.drawString("Student id :"+sid,50,300);
		  g.drawString("Student name :"+sname,50,325);
		   g.drawString("Student qualification  :"+squal,50,350);
		    g.drawString("Student Address:"+saddr,50,375);
	 }
}
class Textareaevents
{
	public static void main(String[] args)
	{
		RegistrationFrame rf=new RegistrationFrame();
	}
}

// same using lambda expression part-5 1:08:01 sec video