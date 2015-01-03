import java.io.File;
import java.io.PrintWriter;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Cycles a loop that iterates through dates within a year
public class OncallDateLoop {
	private LocalDate d;
	private LocalDate d2;

	public OncallDateLoop() {
	}

	public LocalDate getD() {
		return d;
	}

	public void setD() {
	}

	public LocalDate getD2() {
		return d2;
	}

	public void setD2() {
	}

	public void dateLoop(PrintWriter output2, File file2, String[] ext,
			String[] pel, int[] crewNumber) throws Exception {
		LocalDate date = new LocalDate();
		LocalDate d2 = date.plusMonths(1).withDayOfMonth(1);
		DateTimeFormatter fmt = DateTimeFormat.forPattern("EE");
		for (date = new LocalDate(); date.isBefore(d2); date = date.plusDays(1)) {
			ext = OnCallList.cycleList(ext);
			crewNumber = OnCallList.cycleNumberList(crewNumber);
			output2.print("Berry Plastics");
			output2.print("       ");
			output2.println("Film Plant Off Shift Coverage");
			output2.print("Calhoun");
			output2.println();
			output2.println();
			output2.print(date);
			output2.print("     ");
			output2.print("Days");
			output2.print("     ");
			output2.print("Day");
			output2.print("     ");
			output2.print("Nights");
			output2.print("   ");
			output2.println("Night");
			String str = fmt.print(date);
			output2.print(str);
			output2.print("                   ");
			output2.print("Coverage");
			output2.print("          ");
			output2.println("Coverage");
			output2.print("                     ");
			output2.print("----------");
			output2.print("        ");
			output2.println("----------");
			for (int j = 0; j < ext.length - 4; j++) {
				output2.print("                     ");
				output2.println(ext[j]);
			}
			for (int k = 0; k < pel.length; k++) {
				output2.print("                     ");
				output2.println(pel[k]);
			}
			for (int i = 0; i < ext.length - 4; i++) {
				output2.print("                                       ");
				output2.println(ext[i]);
			}
			for (int h = 0; h < pel.length; h++) {
				output2.print("                                       ");
				output2.println(pel[h]);
			}
			output2.println();
		}
	}
}
