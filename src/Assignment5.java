public class Assignment5 {
	/* Main Method* */
	public static void main(String[] args) {
		/*
		 * Name: Sam Renick Date: 2-21-12 Module 5 Assignment Description:
		 * Creates two MyPoint objects that represent coordinates on a graph.
		 * Calls the distance method to compute the distance between the two
		 * points. Prints the results to the console. Key Features: Employs
		 * private data fields in the MyPoint class to protect the class data.
		 * Uses accessor and mutator methods to read and modify the private data
		 * fields x and y. Utilizes two distance methods: an instance method
		 * that is only accessible through a MyPoint object, and a static method
		 * that may be called without creating a MyPoint object.
		 */

		// Create two MyPoint objects
		MyPoint firstPoint = new MyPoint();
		MyPoint secondPoint = new MyPoint();

		// Set the coordinates for the second object
		secondPoint.setX(10);
		secondPoint.setY(30.5);

		// Compute the distance between the objects and display the result
		System.out.println("The distance between the first point and "
				+ "the second point is "
				+ MyPoint.distance(firstPoint, secondPoint)
				+ " using the static distance method.");

		System.out.println("The distance between the first point and "
				+ "the second point is " + firstPoint.distance(secondPoint)
				+ " using the instance distance method.");
		;

	}

}