import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class menuDemo extends Applet implements ActionListener{
	Frame f;
	Label lbl;

	public menuDemo(){
		f = new Frame("Menubar Demo");
		lbl = new Label("Select any option from the menu");

		// adding menubar
		MenuBar mb = new MenuBar();

		// adding menu
		Menu m = new Menu("File");

		//adding menu items
		MenuItem m1 = new MenuItem("New");
		MenuItem m2 = new MenuItem("Save");
		MenuItem m3 = new MenuItem("Open");
		MenuItem m4 = new MenuItem("Delete");

		// adding action listener to the menu items
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);

		// action command is like setting particular command on the click of the menu item
		m4.setActionCommand("File Deleteddd");
		m4.addActionListener(this);

		// adding all the menu items one by one to the menu m
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);

		// adding the whole menu m to the menubar mn
		mb.add(m);

		// setting the menubar for the frame f
		f.setMenuBar(mb);
		f.add(lbl);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent av){

		if(av.getSource() instanceof MenuItem){
			lbl.setText(av.getActionCommand());
		}
	}
	public static void main(String args[]){
		menuDemo md = new menuDemo();
	}

}

