import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// <applet code="colorPicker.class" height=500 width=500> </applet>

public class colorPicker extends Applet implements MouseMotionListener{
	String msg = "";
	int red,green,blue;
	Canvas c = new Canvas();

	public void init(){
		addMouseMotionListener(this);
	}

	public void paint(Graphics g){
		msg = "Red : " + red + "Green : " + green + "Blue : " + blue;
		showStatus(msg);

		c.setSize(50,50);

		Color color = new Color(red,green,blue);
		c.setBackground(color);
	}


	public void mouseDragged(MouseEvent e){
		red = e.getX();
		green = e.getY();
		blue = e.getX() - e.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent e){
		red = e.getX();
		green = e.getY();
		blue = e.getX();
		repaint();		
	}

}
