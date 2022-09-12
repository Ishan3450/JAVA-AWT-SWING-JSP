import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="practical8.class" height=500 width=500></applet>

public class practical8 extends Applet implements ItemListener
{
Checkbox c1;
Checkbox c2;
Checkbox c3;
Canvas c;
int red=0,blue=0,green=0;
public void init()
{
c1=new Checkbox("Red");
c1.addItemListener(this);
c2=new Checkbox("Green");
c2.addItemListener(this);
c3=new Checkbox("Blue");
c3.addItemListener(this);
c=new Canvas();
c.setSize(30,30);
c.setBackground(Color.BLACK);
setLayout(new FlowLayout());
add(c1);
add(c2);
add(c3);
add(c);
}
public void itemStateChanged(ItemEvent ie)
{
if(c1.getState())
red=255;
else
red=0;
if(c2.getState())
green=255;
else
green=0;
if(c3.getState())
blue=255;
else
blue=0;
Color clr=new Color(red,green,blue);
c.setBackground(clr);
}
}