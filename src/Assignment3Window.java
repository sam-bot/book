import javax.swing.JOptionPane;

public class Assignment3Window {
	public static void main(String[] args) {
		/*
		 * Name: Sam Renick Date: 2-7-12 Module 3 Assignment Description:
		 * Randomly generates two integer number n1 and n2, then asks the user
		 * to calculate the value of n1*n2. If the answer is correct, the
		 * program prints one of four nice comments, which is chosen randomly.
		 * If the answer is wrong, the program prints one of four mean comments,
		 * also chosen randomly. Key Features: The program receives input from a
		 * dialog box. It generates random integers using the Math.random()
		 * method. The program evaluates the input answer against the calculated
		 * answer and calls one of two methods to provide a comment to the user.
		 * The called methods, printGoodComment and printBadComment, use switch
		 * statements to select and display a comment based on a randomly
		 * generated integer.
		 */

		// Generates two random integers for use in question
		int n1 = (int) (Math.random() * 101);
		int n2 = (int) (Math.random() * 101);

		// Presents integers to user and requests input for the product of the
		// two
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Whatis the value of " + n1 + (" * ") + n2));

		// establishes correct answer
		int correctAnswer = n1 * n2;

		// checks to see if input answer matches correct answer, calls
		// printGoodComment or printBadComment
		if (answer == (n1 * n2))
			printGoodComment(answer, correctAnswer);
		else
			printBadComment(answer, correctAnswer);
	}

	public static void printGoodComment(int userAnswer, int correctAnswer) {

		// generates a random integer that determines which comment will be
		// displayed
		int comment = (int) (Math.random() * 4);

		// displays a comment based on the integer generated above
		switch (comment) {
		case 0:
			JOptionPane.showMessageDialog(null, "good job");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "excellent");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "terrific");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "nice");
			System.exit(0);
		}
	}

	public static void printBadComment(int userAnswer, int correctAnswer) {

		// generates a random integer that determines which comment will be
		// displayed
		int comment = (int) (Math.random() * 3);

		// displays a comment based on the integer generated above
		switch (comment) {
		case 0:
			JOptionPane.showMessageDialog(null, "sorry, try next time");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "oops, you need more work");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "hmm, it is not correct");
			System.exit(0);
		}
	}
}
