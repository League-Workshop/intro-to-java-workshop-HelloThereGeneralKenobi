package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, RNG);
		
		int StephenHawking = 0;
		int dead = 0;
		
		while( StephenHawking == dead) {
			
			Random RNGesus = new Random();
			int RNG;
			RNG = new Random().nextInt(4);
			
		String awesome = JOptionPane.showInputDialog(null, "What is something awesome?");
		if (RNG == 0) {
			JOptionPane.showMessageDialog(null, awesome + " is awesome!" );
		}
		if (RNG == 1) {
			JOptionPane.showMessageDialog(null, awesome + " is ok" );
		}
		if (RNG == 2) {
			JOptionPane.showMessageDialog(null, awesome + " is bad" );
		}
		if (RNG == 3) {
			JOptionPane.showMessageDialog(null, awesome + " is absolutly disgusting and I never want to see you again." );
		}
	}
		
	}
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer




