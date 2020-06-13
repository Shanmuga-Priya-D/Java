import java.awt.*;
import java.awt.event.*;

class UserFrame extends Frame implements ItemListener
{
	Label l1,l2;
	Checkbox cb1,cb2,cb3,cb4,cb5;
	String uqual="";
	String ugender="";
	
	UserFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("user frame");
		this.setLayout(new FlowLayout());
		this.setBackground(Color.green);
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		l1=new Label("qualification");
		l2=new Label("user gender");
		
		cb1=new Checkbox("Bsc",null,false);
		cb2=new Checkbox("MCA",null,false);
		cb3=new Checkbox("PhD",null,false);
		
		CheckboxGroup cg=new CheckboxGroup();
		cb4=new Checkbox("male",cg,false);
		cb5=new Checkbox("female",cg,false);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		
		this.add(l1);  this.add(cb1); this.add(cb2); this.add(cb3); 
		this.add(l2);  this.add(cb4); this.add(cb5);
	    Font f=new Font("arial",Font.BOLD,15);
		l1.setFont(f);
		l2.setFont(f);

		cb1.setFont(f);
		cb2.setFont(f);
		cb3.setFont(f);
		cb4.setFont(f);
		cb5.setFont(f);
		
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(cb1.getState()==true)
		{
			uqual=uqual+cb1.getLabel()+",";
		}
		if(cb2.getState()==true)
		{
			uqual=uqual+cb2.getLabel()+",";
		}
		if(cb3.getState()==true)
		{
			uqual=uqual+cb3.getLabel()+",";
		}
		if(cb4.getState()==true)
		{
			ugender=cb4.getLabel();
		}
		if(cb5.getState()==true)
		{
			ugender=cb5.getLabel();
		}
		repaint();
	}
	
	
		public void paint(Graphics g)
	   {
	     Font f=new Font("arial",Font.BOLD,20);
		 g.setFont(f);
	
		 g.drawString("qualifications :"+uqual,50,300);
		  g.drawString(" user gender:"+ugender,50,350);
		  uqual="";
	    }
}
class Checkboxevents
{
	public static void main(String[] args)
	{
		UserFrame uf=new UserFrame();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	