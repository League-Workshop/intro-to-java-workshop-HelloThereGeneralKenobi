package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog(null, "What's your name man?");
		JOptionPane.showMessageDialog(null, Name + " is bad ");
	}
}
