import java.applet.Applet;
import java.awt.*;

// <applet code="gridLayout.class" width=500 height=500 > </applet>

public class gridLayout extends Applet{
	Button b1,b2,b3,b4,b5;

	public void init(){
		setLayout(new GridLayout(3,3,4,10));

		b1 = new Button("B1");
		b2 = new Button("B2");
		b3 = new Button("B3");
		b4 = new Button("B4");
		b5 = new Button("B5");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);

	}

}