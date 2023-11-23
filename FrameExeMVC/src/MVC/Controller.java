package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private Model model;
	private View view;

	
	Controller(Model model, View view)
	{
		this.model = model;
		this.view = view;
		
		view.btnMultiply.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				model.multiply(Float.parseFloat(view.textInput1.getText()),
							   Float.parseFloat(view.textInput2.getText()) );
				view.lblTotal.setText(model.num+"");
			}
			
		});
		
		view.btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				model.clear();
				view.lblTotal.setText(model.num+"");
			}
		});
	}
	
	
	
	
}
