// necessary imports for applet
import java.applet.Applet;
import java.awt.*;

// <applet code="arithmeticOperations.class" width=400 height=400> </applet>

public class arithmeticOperations extends Applet{

	// initializing of the fields
	TextField tf1 = new TextField(15); // here 15 stands for width of the textfield
	TextField tf2 = new TextField(15);

	// initializing of the buttons
	Button btnsum = new Button("Sum");
	Button btnSub = new Button("Subtract");
	Button btnMul = new Button("Multiply");
	Button btnDiv = new Button("Division");
	Button btnMin = new Button("Minimum");
	Button btnMax = new Button("Maximum");

	// label for displaying the answer
	Label lblAns = new Label();
	
	// vars for arithmetic operations
	int v1,v2,ans;
	double divAns;

	public void init(){
		// adding all the components into the applet window

		// text fields
		add(tf1);
		add(tf2);

		// buttons
		add(btnsum);
		add(btnSub);
		add(btnMul);
		add(btnDiv);
		add(btnMin);
		add(btnMax);

		// label
		add(lblAns);
	}

	public boolean action(Event ev,Object obj){
		v1 = Integer.parseInt(tf1.getText());
		v2 = Integer.parseInt(tf2.getText());
		double doubleV2 = Double.parseDouble(tf2.getText());

		if(ev.target.equals(btnsum)){
			ans = v1 + v2;
			lblAns.setText(Integer.toString(ans));

		} else if(ev.target.equals(btnSub)){
			ans = v1 - v2;
			lblAns.setText(Integer.toString(ans));
		} else if(ev.target.equals(btnMul)){
			ans = v1 * v2;
			lblAns.setText(Integer.toString(ans));
		} else if(ev.target.equals(btnDiv)){
			divAns = v1 / doubleV2;
			lblAns.setText(Double.toString(divAns));
		} else if(ev.target.equals(btnMin)){
			int min ;

			if(v1 < v2){
				min = v1;
			} else{
				min = v2;
			}

			lblAns.setText(Integer.toString(min));
		} else if(ev.target.equals(btnMax)){
			int max;

			if(v1 > v2){
				max = v1;
			}else{
				max = v2;
			}

			lblAns.setText(Integer.toString(max));
		}

		return true;
	}

}