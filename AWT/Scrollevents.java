import java.awt.*;
import java.awt.event.*;

class UserFrame extends Frame implements AdjustmentListener
{
	Scrollbar sb;
	int position;
	
	UserFrame()
  {
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Scrollbar example");
		this.setLayout(new BorderLayout());
		this.setBackground(Color.green);
				this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		sb=new Scrollbar(Scrollbar.VERTICAL);
		sb.addAdjustmentListener(this);
		
		this.add(BorderLayout.EAST,sb);
		
  }
  public void adjustmentValueChanged(AdjustmentEvent ae)
  {
	  position=sb.getValue();
	  repaint();
	 
  }
   public void paint(Graphics g)
	   {
	     Font f=new Font("arial",Font.BOLD,20);
		 g.setFont(f);
	
		 g.drawString("Position:"+position,50,300);
		 
	    }	
}
class Scrollevents
{
	public static void main(String[] args)
	{
		UserFrame uf=new UserFrame();
	}
}