package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot bb8 = new Robot();

	void go() {
		bb8.penDown();
		bb8.setPenWidth(5);
		bb8.setSpeed(50);
		for(int i=0;i<4; i++) {
			bb8.setRandomPenColor();
			drawSquare();
			bb8.turn(90);	
		}
		
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i=0;i<4; i++) {
			bb8.move(100);
			bb8.turn(90);
			}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



