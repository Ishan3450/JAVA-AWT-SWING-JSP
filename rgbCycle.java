import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// <applet code="rgbCycle.class" height=500 width=500 > </applet>

public class rgbCycle extends Applet implements ActionListener{

	Button changeColor;
	Canvas c;

	public void init(){
		changeColor = new Button("Change to Green");
		c.setSize(30,30);
		c.setBackground(Color.RED);
		changeColor.addActionListener(this);
		setBackground(Color.RED);
		add(changeColor);
		add(c);


	}

	public void actionPerformed(ActionEvent av){
		if(changeColor.getBackground() == Color.RED){
			setBackground(Color.GREEN);
			changeColor.setText("Set to Blue");
		} else if(changeColor.getBackground() == Color.GREEN){
			setBackground(Color.BLUE);
			changeColor.setText("Set to Red");
		}	else{
			setBackground(Color.RED);
		}
	}

}