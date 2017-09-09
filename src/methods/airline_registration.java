package methods;

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class airline_registration {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			String fir = JOptionPane.showInputDialog("Give me your name.");
			String fff = JOptionPane.showInputDialog("Give me your last name.");
			String www = JOptionPane.showInputDialog("where are you traveling to?");
			String sss = JOptionPane.showInputDialog("please give me your birthdate.");
			String ddd = JOptionPane.showInputDialog("what is your gender?");
			/**
			 * Extra Difficult Challenge: have the program repeat until plane is full (10
			 * passenger plan) and print out the number of passengers after each boarding
			 * pass.
			 */
			JOptionPane.showMessageDialog(null, "your first and last name is " + fff + "," + fir + " You are going to "+www+" you were born in " +sss+" your gender is "+ddd+" you are number "+i);

		}
	}
}