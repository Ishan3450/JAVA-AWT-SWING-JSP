import javax.swing.*;

import java.awt.*;

import javax.swing.event.*;

class practical13 extends JFrame implements ListSelectionListener

{

Container cp;

JList jlist;

JLabel lblPrice;

String[] prod={"Laptop","CPU","SSD","RAM","Monitor"};

int[] price={50000,13000,1500,4500,25000};

practical13 ()

{

cp=this.getContentPane();

cp.setLayout(new FlowLayout());

jlist =new JList(prod);

lblPrice=new JLabel("");

jlist.addListSelectionListener(this);

cp.add(jlist);

cp.add(lblPrice);

}

 

public void valueChanged(ListSelectionEvent e)

{

if(jlist.getSelectedIndex()==-1)

{

lblPrice.setText("no items selected");

}

else

{

int index= jlist.getSelectedIndex();

lblPrice.setText("Price: "+price[index]);

}

}

public static void main(String args[])

{

practical13 lstObj= new practical13();

lstObj.setSize(400,400);

lstObj.setVisible(true);

lstObj.setDefaultCloseOperation(EXIT_ON_CLOSE);

}

}