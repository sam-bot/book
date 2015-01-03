public class OnCallList {

	private java.util.Date date;
	private String[] pel;
	private String[] ext;

	OnCallList() {
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate() {
	}

	public String[] getPel() {
		return pel;
	}

	public void setPel() {
	}

	public String[] getExt() {
		return ext;
	}

	public void setExt() {
	}

	public static String[] cycleList(String[] ext) {
		String temp = ext[0];

		for (int i = 1; i < ext.length; i++) {
			ext[i - 1] = ext[i];
		}
		ext[ext.length - 1] = temp;
		return ext;
	}

	public static int[] cycleNumberList(int[] crewNumber) {
		int temp2 = crewNumber[0];
		for (int j = 1; j < crewNumber.length; j++) {
			crewNumber[j - j] = crewNumber[j];
		}
		crewNumber[crewNumber.length - 1] = temp2;
		return crewNumber;
	}
}
