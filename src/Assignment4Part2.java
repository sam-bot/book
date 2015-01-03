public class Assignment4Part2 {
	/* Main Method* */
	public static void main(String[] args) {
		/*
		 * Name: Sam Renick Date: 2-16-12 Module 4 Assignment Part 2
		 * Description: Computes weekly hours for employees. Stores each
		 * employee's hours in a two-dimensional array. Displays employees and
		 * total hours of each in decreasing order. Key Features: Utilizes three
		 * methods which are called by the main method to sum hours, sort in
		 * descending order, and display results to the console. Hours are added
		 * using nested for loops to generate a one dimensional array. Employees
		 * and hours are sorted using a selection sort method which is reversed
		 * from standard format to display results in descending order instead
		 * of ascending order. Final method displays the results as two
		 * one-dimensional arrays.
		 */

		// Initialize a two dimensional array
		int[][] weeklyHours = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}};

		// Create a Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Create an array to track employees through sort
		int[] employeeIndex = new int[weeklyHours.length];

		// Sum the total hours worked for each employee
		int[] sum = hourSum(weeklyHours);

		// Sort hours and employees via selection sort
		int[] sort = employeeSort(sum, employeeIndex);

		// Display results
		displayHours(sort, employeeIndex);
		String m = input.nextLine();
	}

	/* Method totals rows in a two dimensional array* */
	public static int[] hourSum(int[][] employeeHours) {
		int[] totalHours = new int[employeeHours.length];
		for (int rows = 0; rows < employeeHours.length; rows++) {
			for (int columns = 0; columns < employeeHours[0].length; columns++) {
				totalHours[rows] += employeeHours[rows][columns];
			}
		}
		return totalHours;
	}

	/* Method sorts two one-dimensional arrays in descending order* */
	public static int[] employeeSort(int[] totalHours, int[] employeeIndex) {
		// For-loop initializes index which keeps track of employees
		for (int i = 0; i < employeeIndex.length; i++)
			employeeIndex[i] = i;

		// Nested for-loops sort array via selections sort in descending order
		for (int i = 0; i < totalHours.length - 1; i++) {
			int current = totalHours[i];
			int currentIndex = i;
			for (int j = i + 1; j < totalHours.length; j++) {
				if (current < totalHours[j]) {
					current = totalHours[j];
					currentIndex = j;
				}
			}
			// If statement swaps values in array if new maximum is found
			if (currentIndex != i) {
				totalHours[currentIndex] = totalHours[i];
				totalHours[i] = current;

				int temp = employeeIndex[i];
				employeeIndex[i] = employeeIndex[currentIndex];
				employeeIndex[currentIndex] = temp;
			}
		}
		return totalHours;
	}

	/* Method displays two one dimensional arrays to the console* */
	public static void displayHours(int[] totalHours, int[] employeeIndex) {
		// For-loop prints Employee, original index number, and total hours
		for (int i = 0; i < totalHours.length; i++) {
			System.out.println("Employee" + +employeeIndex[i] + ":" + " "
					+ totalHours[i] + " " + "hours");
		}
		System.out.println("Press any key to continue . . .");
	}
}

