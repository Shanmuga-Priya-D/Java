import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class A2  implements ActionListener
{
  JFrame f1= new JFrame();
  JRadioButton b1;
  JRadioButton b2;
  JRadioButton b3;
  JRadioButton b4;
 
  A2()
  {
   JLabel l = new JLabel("WELCOME TO BANKING SYSTEM");
   l.setBounds(100,20,200,30);
  
   b1 = new JRadioButton("INDIAN");
   b1.setBounds(100,100,100,30);
  
   b2 = new JRadioButton("SBI");
   b2.setBounds(100,150,100,30);
   
   b3= new JRadioButton("CUB");
   b3.setBounds(100,200,100,30);
   
   b4 = new JRadioButton("IOB");
   b4.setBounds(100,250,100,30);
  
   ButtonGroup bg = new ButtonGroup();
  
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
 
   bg.add(b1);
   bg.add(b2);
   bg.add(b3);
   bg.add(b4);
  
   f1.add(b1);
   f1.add(b2);
   f1.add(b3);
   f1.add(b4);
   f1.add(l);
  
  
   f1.setSize(400,400);
   f1.setLayout(null);
   f1.setTitle("BANKING SYSTEM");
   f1.setBackground(Color.red);
   f1.setVisible(true);
  }

    public void actionPerformed(ActionEvent e)
     {
       if(b1.isSelected())
        {
         B b = new B();
        }
     }
    public static void main(String[] args) throws SQLException
    {
     A2  a2=new A2();
    }
}


  class B implements ActionListener
  {
    JTextField tf1,tf2,tf3,tf4,tf5;
    JFrame f2=new JFrame();
    JComboBox cb;
    JButton bs;
	  
   B()
   {
	   JLabel l2= new JLabel("WELCOME TO INDIAN BANK");
       l2.setBounds(700,5,250,30);
	   
	   JLabel l3 = new JLabel("DATE");
	   l3.setBounds(50,50,40,30);
	   
	   tf1=new JTextField(10);
	   tf1.setBounds(125,50,100,30);
	   
	   
	   JLabel l4 = new JLabel("USERNAME");
	   l4.setBounds(250,50,70,30);
	     
	   tf2=new JTextField(10);
	   tf2.setBounds(325,50,100,30);
	   
	   
	   JLabel l5= new JLabel("PURPOSE");
	   l5.setBounds(450,50,250,30);
	   
	   String pur[]={"DEPOSIT","WITHDRAWAL"};
	   cb=new JComboBox(pur);
	   cb.setBounds(525,50,150,30);
	   
	   
	   JLabel l7 = new JLabel("DESCRIPTION");
	   l7.setBounds(700,50,150,30);
	   
	   tf3 = new JTextField(10);
	   tf3.setBounds(790,50,150,30);
	   
	  
	    JLabel l6 = new JLabel("AMOUNT");
	   l6.setBounds(960,50,100,30);
	   
	   tf4 = new JTextField(10);
	   tf4.setBounds(1050,50,150,30);
	   
	   bs=new JButton("Submit");
	   bs.setBounds(500,100,100,50);
	   
	   JLabel l8=new JLabel("YOUR BALANCE IS");
	   l8.setBounds(500,300,150,50);
	   
	   tf5=new JTextField(20);
	   tf5.setBounds(700,300,150,50);
	   
	   bs.addActionListener(this);
	      
	   f2.add(l2);
	   f2.add(tf1);
	   f2.add(l3);
	   f2.add(l4);
	   f2.add(tf2);
	   f2.add(l5);
	   f2.add(cb);
	   f2.add(l6);
	   f2.add(tf3);
	   f2.add(l7);
	   f2.add(tf4);
	   f2.add(bs);
	   f2.add(l8);
	   f2.add(tf5);
	   
       f2.setSize(800,800);   
       f2.setLayout(null);  
       f2.setVisible(true);  
       f2.setTitle("INDIAN");
   
   }

  public void insert()
  {
	  try 
	  {
		  
	   Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
       Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system"); 
	   Statement stmt = conn.createStatement();
	   System.out.println(tf1.getText());
	   System.out.println(tf2.getText());
	   System.out.println(cb.getSelectedItem());
       System.out.println(tf3.getText());
       System.out.println(tf4.getText());
	   stmt.executeUpdate("insert into ACCO(dates,username,purpose,description,amount) values('"+tf1.getText()+"','"+tf2.getText()+"','"+cb.getSelectedItem()+"','"+tf3.getText()+"','"+tf4.getText()+"')");		
	   JOptionPane.showConfirmDialog(f2,"data inserted successfully","Result",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
		{
		        double b=show();
			stmt.executeUpdate("insert into ACCO(balance) values('"+b+"')");
		}
		stmt.close();
                conn.close();
	  }
	  catch(Exception e){}
  }

   public double show()throws Exception
  { 
    String amt="";
    double bal=1000.00;
    if(cb.getSelectedItem()=="DEPOSIT")
    {
     amt=tf4.getText();
     double d_amt=Double.parseDouble(amt);
     bal=bal+d_amt;
     String dep_amt = Double.toString(bal);
     tf5.setText(dep_amt);
     JOptionPane.showMessageDialog(f2,"deposited successfully"); 
     return bal;
    }
    else if(cb.getSelectedItem()=="WITHDRAWAL")
    {
      amt=tf4.getText();
      double wamt=Double.parseDouble(amt);
      if(wamt>bal)
      JOptionPane.showMessageDialog(f2,"SORRY,your balance is too low");
      else
      {
	    bal=bal-wamt;
	    String with_amt = Double.toString(bal);
	    tf5.setText(with_amt);
        JOptionPane.showMessageDialog(f2,"withdrawn successfully"); 
      }
	 return bal;
    }
	return 0;
  
  }
 /*public void retrieve()
  {
	  try
	  {
	   Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
           Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system"); 
	   Statement stmt = conn.createStatement();
	   ResultSet rs=stmt.executeQuery("Select * from ACCO");
	 
	    while(rs.next())
            {
	     System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getDouble(4)+""+rs.getDouble(5));
            }
	  }
	  catch(Exception e){}
	  
  }*/
   public void actionPerformed(ActionEvent ae)
   {
	 
	    System.out.println(tf1.getText());
	    System.out.println(tf2.getText());
	    System.out.println(cb.getSelectedItem());
	    System.out.println(tf3.getText());
        System.out.println(tf4.getText());
	   
	 insert();
      // retrieve();
 
   }

  }

  