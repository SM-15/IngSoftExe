package MVC;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame
{
	public JTextField textInput1;
	public JTextField textInput2;
	public JLabel lblNewLabel = new JLabel("Input");
	public JButton btnClear = new JButton("Clear");
    public JButton btnMultiply = new JButton("Multiply");
    public JLabel lblNewLabel_1 = new JLabel("Total");
    public JLabel lblTotal = new JLabel("New label");
	
	public View() {
		
		setSize(800,600);
		getContentPane().setLayout(null);
		
		lblNewLabel.setBounds(10, 20, 45, 13);
		getContentPane().add(lblNewLabel);
		
		textInput1 = new JTextField();
		textInput1.setBounds(43, 41, 96, 19);
		getContentPane().add(textInput1);
		textInput1.setColumns(10);
		
		textInput2 = new JTextField();
		textInput2.setBounds(43, 17, 96, 19);
		getContentPane().add(textInput2);
		textInput2.setColumns(10);
		
		btnMultiply.setBounds(149, 16, 85, 21);
		getContentPane().add(btnMultiply);
		
		lblNewLabel_1.setBounds(244, 20, 45, 13);
		getContentPane().add(lblNewLabel_1);
		
		lblTotal.setBounds(279, 20, 96, 13);
		getContentPane().add(lblTotal);
			
		
		btnClear.setBounds(366, 16, 60, 21);
		getContentPane().add(btnClear);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
	


}
