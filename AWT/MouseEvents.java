import java.awt.*;
import java.awt.event.*;
class Mouse implements MouseListener
{
         public void mouseClicked(MouseEvent me)
             {
                   System.out.println("Mouse clicked ["+me.getX()+","+me.getY()+"]");
             }

         public void mousePressed(MouseEvent me)
             {
                  System.out.println("Mouse Pressed ["+me.getX()+","+me.getY()+"]");
             }

         public void mouseReleased(MouseEvent me)
            {
                  System.out.println("Mouse Released ["+me.getX()+","+me.getY()+"]");
            }
          public void mouseEntered(MouseEvent me)
             {
                   System.out.println("Mouse entered["+me.getX()+","+me.getY()+"]");
             }
          public void mouseExited(MouseEvent me)
             {
                    System.out.println("Mouse exited ["+me.getX()+","+me.getY()+"]");
             }
}
class Myframe extends Frame
{
	Myframe()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("mouse class events");
		this.setBackground(Color.blue);
		this.addMouseListener(new Mouse());
	}
}
class MouseEvents
{
public static void main(String[] args)
{
Myframe mf=new Myframe();
}
}