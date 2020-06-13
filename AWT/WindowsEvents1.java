import java.awt.*;
import java.awt.event.*;
class Windows extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
	System.out.println("windows closing");
    System.exit(0);
}
}
class Myframe extends Frame
{
	Myframe()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("window class events");
		this.setBackground(Color.green);
		this.addWindowListener(new Windows());
	}
}
class WindowsEvents1
{
	public static void main(String[] args)
	{
		Myframe mf=new Myframe();
	}
}