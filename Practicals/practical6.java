import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code = "practical6.class" width = "500" height= "300" ></applet>

public class practical6 extends Applet implements MouseListener
{
	static String msg;
public void init()
{
addMouseListener(this);
}
public void paint(Graphics g)
{
g.drawString(msg,10,10);
}
public void mousePressed(MouseEvent me)
{
msg="Mouse Pressed";
repaint();
}
public void mouseReleased(MouseEvent me)
{
msg="Mouse Released";
repaint();
}
public void mouseExited(MouseEvent me)
{
}
public void mouseEntered(MouseEvent me)
{
}
public void mouseClicked(MouseEvent me)
{
}
}
