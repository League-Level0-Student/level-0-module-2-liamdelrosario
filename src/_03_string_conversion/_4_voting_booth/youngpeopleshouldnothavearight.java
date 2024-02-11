package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class youngpeopleshouldnothavearight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String badApple = JOptionPane.showInputDialog("What is your age");
		int vote=Integer.parseInt(badApple);
		if(vote>=18) {
			JOptionPane.showMessageDialog(null,"guess your are a cool person you proven yourself to your country but your kind out of touch with the youth");
		} else if(vote<18) {
			JOptionPane.showMessageDialog(null, "You are to young leave when your older or go fight in a war or something");
		
	}
	}
	}
