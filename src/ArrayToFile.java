import java.io.*;

public class ArrayToFile {

	public ArrayToFile() {
	}

	public void save(String fileName) throws FileNotFoundException {
		BufferedWriter writer = null;
		try {

			writer = new BufferedWriter(new FileWriter(fileName));
			for (int i = 0; i < fileName.length(); i++) {
				
				writer.newLine();
				writer.flush();
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (writer != null) {
		
			}
		}
	}
}
