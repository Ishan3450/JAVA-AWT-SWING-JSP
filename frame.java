import java.applet.Applet;
import java.awt.*;

// <applet code="frame.class" height=500 width=500> </applet>

public class frame extends Applet{
	Frame f;
	Button b;

	public void init(){
		f = new Frame("Frame Window");
		b = new Button("Show Window");		

		add(b);
	}

	public boolean action(Event ev, Object obj){
		
		if(f.isShowing()){
			f.hide();
			b.setLabel("Show Window");
		} else{
			f.show();
			f.resize(200,100);
			b.setLabel("Hide Window");
		}

		return true;
	}
}