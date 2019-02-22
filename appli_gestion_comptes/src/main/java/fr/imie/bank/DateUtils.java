package main.java.fr.imie.bank;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	public static final DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static LocalDate toDate(String text) {
		LocalDate sTd = LocalDate.parse(text, fr);
		//sTd.format(fr);
		return sTd;
	}

	public static String toString(LocalDate date) {
		String dTs = date.format(fr);
		return dTs;
	}

}
