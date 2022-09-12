import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code = "practical5.class" width = "500" height= "300" ></applet>

public class practical5 extends Applet implements ActionListener
{
Button b;
public void init()
{
b=new Button("Start");
b.addActionListener(this);
add(b);
}
public void actionPerformed(ActionEvent ae)
{
String label=b.getLabel();
if(label.compareTo("Start")==0)
{
b.setLabel("Stop");
}
else
{
b.setLabel("Start");
}
}
}
