import java.applet.Applet;
import java.awt.*;

// <applet code="arithmeticOperations2.class" width=400 height=400> </applet>

public class arithmeticOperations2 extends Applet{

	// initializing of the fields
	TextField tf1 = new TextField(15);
	TextField tf2 = new TextField(15);

	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox sum = new Checkbox("Sum",cbg,true);
	Checkbox sub = new Checkbox("Sub",cbg,false);
	Checkbox mul = new Checkbox("Multiply",cbg,false);
	Checkbox div = new Checkbox("Division",cbg,false);
	Checkbox min = new Checkbox("Minimum",cbg,false);
	Checkbox max = new Checkbox("Maximum",cbg,false);

	// Button operate = new Button("Caluclate");

	Label lblAns = new Label();

	int v1,v2,ans;
	double divAns;

	public void init(){
		add(tf1);
		add(tf2);

		add(sum);
		add(sub);
		add(mul);
		add(div);
		add(min);
		add(max);

		// add(operate);

		add(lblAns);
	}

	public boolean action(Event ev,Object obj){
		v1 = Integer.parseInt(tf1.getText());
		v2 = Integer.parseInt(tf2.getText());
		double doubleV2 = Double.parseDouble(tf2.getText());

		if(sum.getState()){
			ans = v1 + v2;
			lblAns.setText(Integer.toString(ans));

		} else if(sub.getState()){
			ans = v1 - v2;
			lblAns.setText(Integer.toString(ans));
		} else if(mul.getState()){
			ans = v1 * v2;
			lblAns.setText(Integer.toString(ans));
		} else if(div.getState()){
			divAns = v1 / doubleV2;
			lblAns.setText(Double.toString(divAns));
		} else if(min.getState()){
			int min ;

			if(v1 < v2){
				min = v1;
			} else{
				min = v2;
			}

			lblAns.setText(Integer.toString(min));
		} else if(max.getState()){
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