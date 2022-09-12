import java.applet.Applet;
import java.awt.*;

// <applet code="prog1.class" width=1000 height=1000></applet>
public class prog1 extends Applet{
	public void paint(Graphics g){
		// in drawstring the thir parameter is the position of the string
		g.drawString("Hello World of Java in Applet",50,50);

		// in drawline the first 2 parameters are the starting positon of the line and the last two parameters are the ending of the line
		/*
			1st --> x axis
			2nd --> y axis
			3rd -->	x axis 
			4th --> y axis
		*/
		g.drawLine(0,0,50,50);
		g.setColor(Color.red);
		g.drawLine(50,50,100,100);

		// in drawrect the first 2 are the starting points and the 3rd is the width and 4th is height parameters
		g.drawRect(100,100,100,100);

		// same parameters as drawract but differences is it is filled rectangle
		g.fillRect(100,100,100,100);

		g.setColor(Color.blue);

		// Same paramerets as drawrect
		g.drawOval(200,200,100,100);

		g.fillOval(200,200,100,100);


	}
}