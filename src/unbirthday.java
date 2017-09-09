import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
String sds=JOptionPane.showInputDialog("when is your birthday");
if (sds.equals("9/9")) {
	JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!!!");
}else {JOptionPane.showMessageDialog(null, "happy UNbirthday");}


}
}

