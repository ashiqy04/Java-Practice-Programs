import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1997, 3, 10);
		int years = Period.between(birthDate, today).getYears();
		System.out.println(today);
		System.out.println(birthDate);
		System.out.println(years);
	}

}
