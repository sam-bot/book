import java.util.Calendar;

public class OncallCycle {
	private int cycleDay = (Calendar.DAY_OF_YEAR + 2) % 16;
	private int cycleWorkWeek = cycleDay / 4;
	private int cycleOfYear = cycleDay / 16;
	private int onCallCycle = cycleOfYear % 7;
	private boolean dayShift = false;
	private boolean nightShift = false;
	private boolean offShift = false;

	public OncallCycle() {
	}

	public int getCycleDay() {
		return cycleDay;
	}

	public int getCycleWeek() {
		return cycleWorkWeek;
	}

	public boolean isDayShift() {
		return dayShift;
	}

	public void setDayShift(boolean dayShift) {
		this.dayShift = dayShift;
	}

	public boolean isNightShift() {
		return nightShift;
	}

	public void setNightShift(boolean nightShift) {
		this.nightShift = nightShift;
	}

	public boolean isOffShift() {
		return offShift;
	}

	public void setOffShift(boolean offShift) {
		this.offShift = offShift;
	}

	public int oncallNumber(int crewNumber) {
		int aNumber = (crewNumber + onCallCycle) % 7;
		return aNumber;
	}

}