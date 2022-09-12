import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// <applet code="testPractice.class" width=500 height=500></applet>

public class testPractice extends Applet {
	public void paint(Graphics g){
		g.drawRect(100,100,300,50);

		for(int i = 1; i<=300; i++){
			g.setColor(Color.RED);
			g.drawLine(100+i,100,100+i,150);
			try{
				Thread.sleep(100);
			}catch(Exception e){}
		}
	}
}