package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog(null,"Is Lukas bad at programming?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("Yes")) {
			score++;
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog(null,"What is the worst Shrek Movie");
		
		if(answer2.equalsIgnoreCase("Shrek 3")) {
			score++;
		}
		
		String answer3 = JOptionPane.showInputDialog(null,"When did the Emoji Movie come out?");
		
		if(answer3.equalsIgnoreCase("June 28, 2017")) {
			score++;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score was " + score);
	}
}
