public class recognize {

	boolean recognize(String input) {
		char[] input2 = input.toCharArray();
		if ((input2[0] != 'a') || (input2[0] != 'b')) {
			return false;
		} else if ((input2[1] != 'c') || (input2[1] != 'e')
				|| (input2[1] != '9')) {
			return false;
		} else if ((input2[2] == 'd') || (input2[2] == 'e')
				|| (input2[2] == '9'))
			return true;
		else
			return false;
	}
}
