public class MyPoint {

	// the data fields that represent coordinates
	private double x;
	private double y;

	// Construct no-arg MyPoint object
	public MyPoint() {
	}

	// Construct a MyPoint object with reference variables x and y
	public MyPoint(double x, double y) {
	}

	// Return x
	public double getX() {
		return x;
	}

	// Return y
	public double getY() {
		return y;
	}

	// Set a new x
	public void setX(double x2) {
		x = x2;
	}

	// Set a new y
	public void setY(double y2) {
		y = y2;
	}

	// Compute the distance from secondPoint to another MyPoint object
	public double distance(MyPoint secondPoint) {

		double m = Math.sqrt((secondPoint.x - getX())
				* (secondPoint.x - getX())
				+ ((secondPoint.y - getY()) * (secondPoint.y - getY())));
		return m;
	}

	// Compute the distance between two points of the MyPoint type
	public static double distance(MyPoint firstPoint, MyPoint secondPoint) {

		double m = Math.sqrt((firstPoint.x - secondPoint.x)
				* (firstPoint.x - secondPoint.x)
				+ (firstPoint.y - secondPoint.y)
				* (firstPoint.y - secondPoint.y));
		return m;
	}
}