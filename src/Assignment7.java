public class Assignment7 {
	public static void main(String[] args) {
		MyInteger n1 = new MyInteger(5);
		System.out.println("n1 is even? " + n1.isEven());
		System.out.println("n1 is even? " + MyInteger.isEven(n1));
		System.out.println("6 is even? " + MyInteger.isEven(6));

		char[] chars = { '3', '5', '3', '9' };
		System.out.println(MyInteger.parseInt(chars));

		String s = "3539";
		System.out.println(MyInteger.parseInt(s));

		MyInteger n2 = new MyInteger(24);
		System.out.println("n2 is odd? " + n2.isOdd());
		System.out.println("n2 is odd? " + MyInteger.isOdd(n2));
		System.out.println("45 is odd? " + MyInteger.isOdd(45));
		System.out.println("n1 is equal to n2? " + n1.equals(n2));
		System.out.println("n1 is equal to 5? " + n1.equals(5));
	}
}

class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 != 0;
	}

	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	public static boolean isEven(MyInteger integer) {
		return isEven(integer.getValue());
	}

	public static boolean isOdd(MyInteger integer) {
		return isOdd(integer.getValue());
	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger integer) {
		return equals(integer.getValue());
	}

	public static int parseInt(char[] character) {
		String number = new String(character);
		int value2 = parseInt(number);
		return value2;

	}

	public static int parseInt(String number) {
		int j = Integer.parseInt(number);
		return j;
	}
}
