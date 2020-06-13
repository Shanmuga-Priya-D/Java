import java.awt.*;
import java.awt.event.*;
class Key implements KeyListener
{
	public void keyPressed(KeyEvent ke)
	{
		System.out.println("key pressed :"+ke.getKeyChar());
	}
	public void keyReleased(KeyEvent ke)
	{
		System.out.println("key Released :"+ke.getKeyChar());
	}
	public void keyTyped(KeyEvent ke)
	{
		System.out.println("key typed :"+ke.getKeyChar());
	}
}
class Myframe extends Frame
{
	Myframe()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("key class events");
		this.setBackground(Color.yellow);
		this.addKeyListener(new Key());
	}
}
class KeyEvents
{
public static void main(String[] args)
{
Myframe mf=new Myframe();
}
}