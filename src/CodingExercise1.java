import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot frankie = new Robot("mini");
		frankie.setSpeed(100);
		frankie.penDown();
		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane.showInputDialog("what color would you like");
		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)
		if (color.equals("red")) {
			frankie.setPenColor(255, 0, 0);
		} else if (color.equals("blue")) {
			frankie.setPenColor(0, 0, 255);
		}
		// 2. set the pen width to 10
		frankie.setPenWidth(10);
		// 1. make the Robot draw a shape
		for (int i = 0; i < 4; i++) {

			frankie.move(100);
			frankie.turn(90);
		}
	}
}
