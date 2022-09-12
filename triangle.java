import java.applet.Applet;
import java.awt.*;

// <applet code="triangle" width=800 height=800> </applet>

public class triangle extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.red);

		g.drawLine(100,100,200,40);

		g.setColor(Color.blue);
		g.drawLine(200,40,300,100);

		g.setColor(Color.green);
		g.drawLine(100,100,300,100);

	}
}