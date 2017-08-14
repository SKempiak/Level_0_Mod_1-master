import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
public static void main(String[] args) {
Random Randy=new Random();
int random=Randy.nextInt(51);
int random1=Randy.nextInt(51);
int random2=Randy.nextInt(51);
int random3=Randy.nextInt(51);
int random4=Randy.nextInt(51);
JOptionPane.showMessageDialog(null,"numbers: "+random+", "+random1+", "+random2+", "+random3+", "+random4);














}
}
