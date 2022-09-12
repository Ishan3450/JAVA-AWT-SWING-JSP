import java.awt.*;
import java.awt.event.*;
public class practical9 implements ActionListener
{
Frame f;
Label l;
public practical9()
{
f = new Frame("Practical - 9") ;
l= new Label("Select Menu.");
MenuBar mb = new MenuBar();
Menu mn = new Menu("File");
MenuItem mi1 = new MenuItem("New");
mi1.addActionListener(this);
MenuItem mi2 = new MenuItem("Open");
mi2.addActionListener(this);
MenuItem mi3 = new MenuItem("Save");
mi3.addActionListener(this);
MenuItem mi4 = new MenuItem("Exit");
mi4.addActionListener(this);
mn.add(mi1);
mn.add(mi2);
mn.add(mi3);
mn.add(mi4);
mb.add(mn);
f.setMenuBar(mb);
f.setLayout(new FlowLayout());
f.add(l);
f.setSize(300,300);
f.setVisible(true);
}
public static void main(String[ ] args)
{
practical9 f = new practical9();
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() instanceof MenuItem)
{
l.setText(ae.getActionCommand());
}
}
}