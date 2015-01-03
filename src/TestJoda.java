import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Period;


public class TestJoda {
	public boolean isAfterPayDay(DateTime datetime) {
		  if (datetime.getMonthOfYear() == 2) {   // February is month 2!!
		    return datetime.getDayOfMonth() > 26;
		  }
		  return datetime.getDayOfMonth() > 28;
		}

		public Days daysToNewYear(LocalDate fromDate) {
		  LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
		  return Days.daysBetween(fromDate, newYear);
		}

		public boolean isRentalOverdue(DateTime datetimeRented) {
		  Period rentalPeriod = new Period().withDays(2).withHours(12);
		  return datetimeRented.plus(rentalPeriod).isBeforeNow();
		}

		public String getBirthMonthText(LocalDate dateOfBirth) {
		  return dateOfBirth.monthOfYear().getAsText(Locale.ENGLISH);
		}
		
		public static void main(String[] args){
			DateTime d = new DateTime();
			LocalDate d2 = new LocalDate(2012, 12, 31);
			for (LocalDate date = new LocalDate(2012, 4, 1); date.isBefore(d2); date = date.plusDays(1))
			{
			   System.out.println(date);
			}
		}
}