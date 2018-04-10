package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		//oof
		Robot BillJobs = new Robot();
		int x = 0;
		BillJobs.miniaturize();
		BillJobs.setSpeed(200);
		BillJobs.setPenWidth(20);
		BillJobs.penDown();
		BillJobs.sparkle();
		
		BillJobs.turn(90);
		BillJobs.move(50);
		BillJobs.move(-50);
		BillJobs.turn(-90);
		BillJobs.move(50);
		BillJobs.turn(90);
		BillJobs.move(25);
		BillJobs.move(-25);
		BillJobs.turn(-90);
		BillJobs.move(50);
		BillJobs.turn(90);
		BillJobs.move(50);
		BillJobs.penUp();
		BillJobs.move(50);
		BillJobs.penDown();
		BillJobs.turn(-90);
		BillJobs.move(-100);
		BillJobs.move(100);
		BillJobs.turn(90);
		for(int i = 0; i < 79; i++) {
			BillJobs.turn(2);
			BillJobs.move(1);
			
		}
		BillJobs.turn(-90);
		BillJobs.move(50);
		
		
		
		
	}
}
