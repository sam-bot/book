import java.io.BufferedReader;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;

public class OnCall2012 {
	public static void main(String[] args) throws Exception {
		// Create a reference to the text file which contains
		// a list of operator names
		FileInputStream a = new FileInputStream("extruderA.txt");
		FileInputStream b = new FileInputStream("extruderB.txt");
		FileInputStream c = new FileInputStream("extruderC.txt");
		FileInputStream d = new FileInputStream("extruderD.txt");

		// Read names into a String array
		BufferedReader brA = new BufferedReader(new InputStreamReader(a));
		BufferedReader brB = new BufferedReader(new InputStreamReader(b));
		BufferedReader brC = new BufferedReader(new InputStreamReader(c));
		BufferedReader brD = new BufferedReader(new InputStreamReader(d));

		File fileA = new File("extruderA.txt");
		File fileB = new File("extruderB.txt");
		File fileC = new File("extruderC.txt");
		File fileD = new File("extruderD.txt");
		
		String crew = JOptionPane.showInputDialog(null, "Crew: ");
		String[] ext = new String[7];
		switch (crew) {
		case "a":
			for (int j = 0; j < ext.length; j++) {
				ext[j] = brA.readLine();
			}
			break;
		case "b":
			for (int j = 0; j < ext.length; j++) {
				ext[j] = brB.readLine();
			}
			break;
		case "c":
			for (int j = 0; j < ext.length; j++) {
				ext[j] = brC.readLine();
			}
			break;
		case "d":
			for (int j = 0; j < ext.length; j++) {
				ext[j] = brD.readLine();
			}
			// Print the first three names to the console
			for (int i = 0; i < ext.length - 4; i++) {
				System.out.println(ext[i]);
			}


			// Print the first three names to the console
			for (int i = 0; i < ext.length - 4; i++) {
				System.out.println(ext[i]);
			}

			// Cycle the top name to the bottom of the list
			ext = OnCallList.cycleList(ext);

			// Close the file
			a.close();
			b.close();
			c.close();
			d.close();

			// Create another instance of the text file
			// to rewrite the cycled list
			

			PrintWriter output = new PrintWriter(fileA);

			// overwrite the list
			for (int i = 0; i < ext.length; i++) {
				output.println(ext[i]);

			}
			// Close the rewritten file
			output.close();
		}
	}
}
