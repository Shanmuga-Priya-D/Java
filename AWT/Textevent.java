import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class LoginFrame extends Frame implements ActionListener
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
		b.addActionListener(this);
		
		
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
	 
	 public void actionPerformed(ActionEvent ae)//"jdbc:oracle:thin@localhost:1521:xe"
	 {
		 String uname=tf1.getText();
		 String upwd=tf2.getText();
		 try
		 {
			 Connection conn = DriveManager.getConnection"(http://127.0.0.1:8080/apex/f?p=4500:1003:2196094797161203::NO:::","SYSTEM","system");
			 String sql="select * from login where username ="+tf1.getText()+"and password"+tf2.getText();
			 PreparedStatement ps= conn.prepareStatement(sql);
			 ResultSet rs =ps.executeQuery();
			 if(rs.next())
			 {
				 JOptionPane.showMessageDialog("login success");
			 }
			 else
			 {
				 JOptionPane.showMessageDialog("login unsuccess");
			 }
		 }
		 catch(Exception e){}
		 
		
}
class Textevent
{
	public static void main (String[] args)
	{
		LoginFrame lo=new LoginFrame();
	}
}	

