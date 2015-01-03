import javax.swing.JOptionPane;

public class TestMax {
//main method
	public static void main(String [] args){
		int i = 5;
		int j = 2;
		int k = max(i,j);
		JOptionPane.showMessageDialog(null, "The maximum between "
				+ i + " and " + j + " is " + k);
	}
	//return the max between two numbers
	public static int max(int num1, int num2){
		int result;
		
		if (num1 > num2)
			result = num1;
		else 
			result = num2;
		
		return result;
	}
}
