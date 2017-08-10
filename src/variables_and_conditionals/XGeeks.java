package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String samson="super gamer";
String ollie="invisiblity";       
String june="writing recipes";		
String chris="super speed";
String micheal="super quiet";
String sofia="inability to deside";
String andrew="to speak";	
		// 2. Ask the user to enter a name. Store their answer in a variable.
String lol=JOptionPane.showInputDialog("type in a name plz");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if(lol.equals("samson")){
JOptionPane.showMessageDialog(null, "samson's superpower is "+samson);}
if(lol.equals("ollie")){
JOptionPane.showMessageDialog(null, "ollie's superpower is "+ollie);}
if(lol.equals("june")){
JOptionPane.showMessageDialog(null, "june's super power is "+june);}
if(lol.equals("chris")){
JOptionPane.showMessageDialog(null, "chris's super power is "+chris);}
if(lol.equals("micheal")){
JOptionPane.showMessageDialog(null, "micheals superpower is "+micheal);}
if(lol.equals("sofia")){
JOptionPane.showMessageDialog(null, "sofia's super power is "+sofia);}
if(lol.equals("andrew")){
JOptionPane.showMessageDialog(null,"andrew's superpower is "+andrew);}
	}
}