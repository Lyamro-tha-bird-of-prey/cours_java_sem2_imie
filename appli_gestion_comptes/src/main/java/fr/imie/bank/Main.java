package main.java.fr.imie.bank;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strdat = sc.nextLine();
		LocalDate dat = DateUtils.toDate(strdat);
		System.out.println(DateUtils.toString(dat));
		sc.close();
	}

}
