import java.io.*;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) throws Exception {

        File inputFile = new File("input.txt");
        if (args.length != 2) {
            System.out.println("Usage: java Assignment6 operand1 operand2");
            System.exit(0);
        }
        // Check if source file exists
        if (!inputFile.exists()) {
            System.out.println("Source file " + args[0] + " not exist");
            System.exit(0);

        }
        Scanner inputReader = new Scanner(inputFile);
       
        PrintWriter outputFile = new PrintWriter("output.txt");
        
        while (inputReader.hasNext()) {
            String s = inputReader.next();
            if (isValid(s)) {

                outputFile.println(s + " is a valid password");
            } else
                outputFile.println(s + " is not a valid password");
        }

        outputFile.close();
    }

    @Override
	public String toString() {
		return "Assignment6 []";
	}

	public static boolean isValid(String s) {

        return true;

    }
}

