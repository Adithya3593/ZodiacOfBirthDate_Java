import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Terminate extends JFrame implements ActionListener {
	
	static int count = 0;
	private static JPanel panel;
	private static JLabel label;
	private static JButton button;
	
	Terminate(){
		panel = new JPanel();
		label = new JLabel("Invalid Date Format for 3 times. Please click OK to exit");
		button = new JButton("Click Ok");
		setVisible(true);
		setTitle("!!! Welcome !!!");
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.add(label);
		panel.add(button);
		add(panel);
		button.addActionListener(this);
	}
	
	public static void checkTermination(){
		count++;
		if(count == 3){
			new Terminate();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("System Exit");
		System.exit(1);
	}

}
