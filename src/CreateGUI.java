import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateGUI extends JFrame implements ActionListener{
	
	//static int count = 0;
		
	private static JTextField dob = new JTextField(25);
	private static JButton button;
	private static JLabel label;
	private static JPanel panel;
	
	CreateGUI(){
		button = new JButton("Click Ok");
	    label = new JLabel("Please Enter Date Of Birth in MM/DD/YYYY Format:");
		panel = new JPanel();
		
		setTitle("!!! Welcome !!!");
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		panel.setLayout(new GridLayout(3,1));
		panel.add(label);
		panel.add(dob);
		panel.add(button);
		add(panel);
		
		dob.addActionListener(this);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		 String inputDate = dob.getText().trim();
		 System.out.println("Date Entered : "+ inputDate);
		 try {
			new DateFormatCheck(inputDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	

	
	public static void main(String args[]){
		CreateGUI gui = new CreateGUI();
		gui.setVisible(true);
	}
}