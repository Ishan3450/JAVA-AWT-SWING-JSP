import java.awt.*;
import java.awt.event.*;
public class practical7 implements ActionListener
{
Frame f;
Button b;
public practical7()
{
f = new Frame("Practical - 7") ;
b= new Button("Click");
b.setBackground(Color.RED);
f.setBackground(Color.RED);
b.addActionListener(this);
f.setLayout(new FlowLayout());
f.add(b);
f.setSize(300,300);
f.setVisible(true);
}
public static void main(String[] args)
{
practical7 t = new practical7();
}
public void actionPerformed(ActionEvent ae)
{
if(f.getBackground() == Color.blue)
{
b.setBackground(Color.RED);
f.setBackground(Color.RED);
}
else if(f.getBackground() == Color.RED)
{
b.setBackground(Color.GREEN);
f.setBackground(Color.GREEN);
}else if (f.getBackground()==Color.green)
{
f.setBackground(Color.BLUE);
b.setBackground(Color.BLUE);
}
}
}