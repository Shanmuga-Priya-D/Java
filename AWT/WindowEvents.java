import java.awt.*;
import java.awt.event.*;
class Windows implements WindowListener
{


public void windowOpened(WindowEvent we)
{
	System.out.println("windows opened");
}
public void windowClosed(WindowEvent we)
{
	System.out.println("windows closed");
}
public void windowClosing(WindowEvent we)
{
	System.exit(0);
	System.out.println("windows closing");
}
public void windowIconified(WindowEvent we)
{
	System.out.println("windows Iconified");
}
public void windowDeiconified(WindowEvent we)
{
	System.out.println("windows deiconified");
}
public void windowActivated(WindowEvent we)
{
	System.out.println("windows activated");
}
public void windowDeactivated(WindowEvent we)
{
	System.out.println("windows deactivated");
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
class WindowEvents
{
	public static void main(String[] args)
	{
		Myframe mf=new Myframe();
	}
}