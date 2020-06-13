import java.awt.*;
import java.awt.event.*;

class UserFrame extends Frame implements ItemListener
{
	Label l1,l2;
	List l;
	Choice ch;
	
	String utech="";
	String uprofession="";
	
	
	UserFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("List-Choice example");
		this.setLayout(new FlowLayout());
		this.setBackground(Color.green);
				this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		l1=new Label("Technologies");
		l2=new Label("Profession");
		l=new List(4,true);
        l.add("c");
		l.add("c++");
		l.add("java");
     	l.add("oracle");
		l.add(".net");
		l.add("Hadoop");
		
		
		l.addItemListener(this);
		
		ch=new Choice();
		ch.add("Student");
		ch.add("Business");
		ch.add("Teacher");
		ch.add("s/w Engineer");
		
		ch.addItemListener(this);
		
		Font f=new Font("arial",Font.BOLD,25);
		l1.setFont(f);
		l2.setFont(f);
		l.setFont(f);
		ch.setFont(f);

		
		
		
		this.add(l1);  this.add(l);
		this.add(l2);  this.add(ch);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String[] items=l.getSelectedItems();
		
		for(String str: items)
		{
			utech=utech+str+"";
		}
		uprofession=ch.getSelectedItem();
		repaint();
	}
	
	   public void paint(Graphics g)
	   {
	     Font f=new Font("arial",Font.BOLD,20);
		 g.setFont(f);
	
		 g.drawString("User Technologies :"+utech,50,300);
		  g.drawString(" User Profession :"+uprofession,50,350);
		  utech="";
	    }
}
class Listboxevents
{
	public static void main(String[] args)
	{
		UserFrame uf=new UserFrame();
	}
}