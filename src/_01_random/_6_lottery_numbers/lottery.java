package _01_random._6_lottery_numbers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class lottery implements ActionListener {

	public static void main(String[] args) {
	
			new _01_random._6_lottery_numbers.lottery().setup();
	}
	
	   void setup() {
		JFrame frame=new JFrame();
		JPanel panel= new JPanel();
		JLabel label;
		JButton boise = new JButton();
		boise.addActionListener(this);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JOptionPane.showMessageDialog(null,"heres the numbers");
		
		for (int i=0; i<6; i++) {
			Random ran = new Random();
		int selection = ran.nextInt(100);
	        String tan = String.valueOf(selection);
	        label=new JLabel();
		label.setText(tan);
		panel.add(label);
		
	}
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
