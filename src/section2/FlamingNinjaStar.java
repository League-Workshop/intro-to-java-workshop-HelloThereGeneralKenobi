package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 90;		//the size of the black part of the star
		int flameSize = 60;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
		Robot owo = new Robot();
		owo.hide();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		//owo.setX(0);
		//owo.setY(0);
		// *15. Make some adjustments to see what other kinds of shapes you can make.
		
		// 12. Set the robot speed to 10
		owo.setSpeed(200);
		
		owo.penDown();
		// 13. Use a for loop to repeat all of the code below 25 times
		for(int i = 0; i < 99; i++ ) {
			// 2. Turn the robot 1/8 of a circle
			owo.turn(80);
			// 3. Move the robot 64 pixels
			owo.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			owo.turn(-40);
			owo.setPenColor(Color.YELLOW);
			// 5. Move the robot the distance in the variable flameSize
			owo.move(flameSize);
			// 6. Turn the robot 170 degrees
			owo.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			owo.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
			owo.turn(64);
			owo.setPenColor(Color.BLACK);
			// 9. Move the robot the distance in the variable baseSize
			owo.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		}
	}

}


