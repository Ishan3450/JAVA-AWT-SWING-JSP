import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// <applet code="coordinates.class" height=500 width=500> </applet>

public class coordinates extends Applet implements MouseListener,MouseMotionListener{
	String msg = new String(); // or string msg = "";
	int x,y;

	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paint(Graphics g){
		g.fillRect(x,y,10,10);
		msg = "X : " + x + "Y : " + y;
		showStatus(msg);
	}

	public void mouseDragged(MouseEvent e){
		x = e.getX();
		y = e.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent e){
		x = e.getX();
		y = e.getY();
		repaint();
	}

	public void mouseClicked(MouseEvent e){}

	public void mouseEntered(MouseEvent e){}

	public void mouseExited(MouseEvent e){
	}
	public void mousePressed(MouseEvent e){}

	public void mouseReleased(MouseEvent e){}

}