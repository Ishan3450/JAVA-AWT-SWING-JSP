import java.applet.Applet;
import java.awt.*;

// <applet code="statusBar.class" height=500 width=500> </applet>


public class statusBar extends Applet{
	Button btn1,btn2;

	public void init(){
		btn1 = new Button("Show for Button 1");
		btn2 = new Button("Show for Button 2");

		add(btn1);
		add(btn2);
	}

	public boolean action(Event ev,Object obj){
		if(ev.target.equals(btn1)){
			showStatus("Button 1 Pressed");
		}else{
			showStatus("Button 2 Pressed");
		}

		return true;
	}
}
