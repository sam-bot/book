import javax.swing.*;
import java.awt.FlowLayout;

public class OnCallInterface extends JFrame {
	public OnCallInterface() {
		String[] crew = { "A", "B", "C", "D" };
		String[] dayOfTheWeek = { "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday", "Sunday" };
		String[] shift = {"Days", "Nights"};
		// Create a GUI template for use in program
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

		// Add interface components
		add(new JComboBox(crew));
		add(new JLabel("Date"));
		add(new JTextField(6));
		add(new JComboBox(dayOfTheWeek));
		add(new JComboBox(shift));
	}
	public static void main(String[] args){
		OnCallInterface frame = new OnCallInterface();
		frame.setTitle("On Call List");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
		}
}
