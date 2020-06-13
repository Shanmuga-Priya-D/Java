import java.awt.*;
import java.awt.event.*;

//using anonymous class
class Myframe extends Frame
{
	Myframe()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("window class events");
		this.setBackground(Color.green);
		this.addWindowListener(new WindowAdapter()
		{
	         public void windowClosing(WindowEvent we)
                {
	             System.out.println("windows closing");
                 System.exit(0);
                 }
		});
	}
}
class WindowsEvents2
{
	public static void main(String[] args)
	{
		Myframe mf=new Myframe();
	}
}