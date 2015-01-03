import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;

public class Oncall {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("oncall.txt");
		FileInputStream pel = new FileInputStream("PelA.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(pel));
		String[] extA = new String[7];
		String[] pelA = new String[2];
		int[] crewNumber = new int[7];
		for (int j = 0; j < extA.length; j++) {
			extA[j] = br.readLine();
			crewNumber[j] = j;
		}
		pelA[0] = br2.readLine();
		pelA[1] = br2.readLine();

		in.close();
		pel.close();

		File file = new File("oncall.txt");
		PrintWriter output = new PrintWriter(file);

		for (int i = 0; i < extA.length; i++) {
			output.println(extA[i]);
		}
		output.close();
		File file2 = new File("oncall2.txt");
		PrintWriter output2 = new PrintWriter(file2);
		OncallDateLoop loop1 = new OncallDateLoop();
		loop1.dateLoop(output2, file2, extA, pelA, crewNumber);
		output2.close();
	}
}