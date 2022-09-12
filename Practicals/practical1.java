import java.applet.Applet;
import java.awt.*;

// <applet code="practical1.class" width=500 height=300></applet>

public class practical1 extends Applet{
	public void paint(Graphics g){
		int r=100,x,y,w,h;
int height=300,width=500;
h=height/2;
w=width/2;
x=w-r;
y=h-r;
g.setColor(Color.red);
g.fillOval(x,y,2*r,2*r);
g.setColor(Color.black);
g.drawOval(x,y,2*r,2*r);
g.drawString("Ishan",w-10,h+5);
	}
}