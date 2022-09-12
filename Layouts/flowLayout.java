import java.applet.Applet;
import java.awt.*;

// <applet code="flowLayout.class" width=500 height=500 > </applet>

public class flowLayout extends Applet{
	TextField tf1,tf2;
	Button b1,b2,b3,b4,b5;

	public void init(){
		tf1 = new TextField(10);
		tf2 = new TextField(10);

		b1 = new Button("B1");
		b2 = new Button("B2");
		b3 = new Button("B3");
		b4 = new Button("B4");
		b5 = new Button("B5");

		add(tf1);
		add(tf2);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);

		setLayout(new FlowLayout());
	}

}