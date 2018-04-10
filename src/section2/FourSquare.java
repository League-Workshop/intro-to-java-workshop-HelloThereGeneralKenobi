package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot BigBoi = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		BigBoi.setSpeed(200);
		// 5. Set the pen width to 5
		BigBoi.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
			BigBoi.setRandomPenColor();
			// 1. Call the drawSquare() method
			BigBoi.penDown();
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			BigBoi.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for(int i = 0; i < 4; i++) {
		BigBoi.turn(90);
		BigBoi.move(100);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



