import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code = "practical4.class" width = "400" height= "400" ></applet>

public class practical4 extends Applet implements MouseMotionListener
{
static int x,y;
public void init()
{
addMouseMotionListener(this);
}
public void paint(Graphics g)
{
g.drawString("X = " + x + ", Y = " + y , 15,15);
g.fillRect( x, y, 10, 10 );
}
public void mouseMoved(MouseEvent e)
{
x=e.getX();
y=e.getY();
repaint();
}
public void mouseDragged(MouseEvent e)
{
x=e.getX();
y=e.getY();
repaint();
}
}
