package main.java.fr.imie.bank;

import java.util.Scanner;

import main.java.fr.imie.bank.model.PersonDaoCsvImpl;

public class TestDao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inid = sc.nextLine();
		int id = Integer.parseInt(inid);
		PersonDaoCsvImpl per = new PersonDaoCsvImpl();
		System.out.println(per.findById(id));
		
		sc.close();
	}

}
