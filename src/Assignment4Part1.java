public class Assignment4Part1 {
	/* Main Method* */
	public static void main(String[] args) {
		/*
		 * Name: Sam Renick Date: 2-16-12 Module 4 Assignment Part 1
		 * Description: Receives input from the user for two arrays. Calculates
		 * the average of the first array and displays the result on the
		 * console. Adds the two arrays into a sum array and displays the
		 * combined array on the console. Key Features: Utilizes methods to
		 * receive input for arrays, calculate the average of an array, adds the
		 * two arrays into a sum array of the same length, and prints all
		 * results on the console.
		 */

		// invoke inputArray to create two new arrays
		int[] inputArray1 = inputArray(5);
		int[] inputArray2 = inputArray(5);

		// Calculate the average of the first int array
		double j = average(inputArray1);

		// Display the average result on the console window
		System.out.println("The average of the first array is " + j);

		// Calculate the array sum of both input arrays
		int[] sum = add(inputArray1, inputArray2);

		// Display the sum array by invoking the displayArray method
		System.out.print("The sum array is: ");
		displayArray(sum);
	}

	// Receives input to create an array
	public static int[] inputArray(int size) {
		// Create a Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Initialize a new array
		int[] m = new int[size];

		// Prompt the user to input values for the new array
		System.out.println("Enter " + m.length + " values: ");
		for (int i = 0; i < m.length; i++)
			m[i] = input.nextInt();
		return m;
	}

	// Calculates the average of the elements in an array
	public static double average(int[] list) {
		double sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		return sum / list.length;
	}

	// Creates a sum array of two arrays
	public static int[] add(int[] list1, int[] list2) {
		int[] sumArray = new int[list1.length];
		System.arraycopy(list1, 0, sumArray, 0, list1.length);
		for (int i = 0; i < list2.length; i++) {
			sumArray[i] += list2[i];
		}
		return sumArray;
	}

	// Displays the sum array to the console
	public static void displayArray(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}