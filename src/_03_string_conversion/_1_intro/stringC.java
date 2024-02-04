package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class stringC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quantity = JOptionPane.showInputDialog("Enter a number");
		int num = Integer.parseInt(quantity);
		System.out.println(num*2);
	}

}
