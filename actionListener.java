import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//<applet code="actionListener.class" width = 500 height = 500> </applet>

public class actionListener extends Applet implements ActionListener{
	TextField tf1 = new TextField(15);

	Button btn1 = new Button("Copy");
	Button btn2 = new Button("Copy Twice");

	Label lbl = new Label();

	public void init(){
		add(tf1);
		add(btn1);
		add(btn2);
		add(lbl);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae){
		String msg = tf1.getText();

		if(ae.getSource() == btn1){
			lbl.setText(msg);

		}else{
			String cTwice = msg + " " + msg;
			lbl.setText(cTwice);
		}
	}


}