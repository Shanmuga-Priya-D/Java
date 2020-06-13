import java.awt.*;
import java.awt.event.*;

class UserFrame extends Frame implements ActionListener
{
	String item="";
	UserFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Menu example");
		this.setLayout(new FlowLayout());
		this.setBackground(Color.green);
				this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		MenuBar mb=new MenuBar();
		this.setMenuBar(mb);
		
		Menu m=new Menu("File");
		mb.add(m);
		
		MenuItem mi1=new MenuItem("New");
		MenuItem mi2=new MenuItem("Open");
		MenuItem mi3=new MenuItem("Save");
		MenuItem mi4=new MenuItem("Save As");
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		
		m.add(mi1);
		m.add(mi2);
		m.add(mi3);
		m.add(mi4);
	}
	public void actionPerformed(ActionEvent ae)
	{
		item=ae.getActionCommand();
        repaint();
	}
   	   public void paint(Graphics g)
	   {
	     Font f=new Font("arial",Font.BOLD,20);
		 g.setFont(f);
	
		 g.drawString("Select Item :"+item,50,300);
		 
	    }	
}
class Menuevents
{
	public static void main(String[] args)
	{
		UserFrame uf=new UserFrame();
	}
}

		