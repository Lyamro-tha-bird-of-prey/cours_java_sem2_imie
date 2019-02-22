package main.java.fr.imie.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import main.java.fr.imie.bank.model.Person;
import main.java.fr.imie.bank.model.PersonDaoCsvImpl;

public class SaveToDao {

	public static void main(String[] args) {
		
	    ArrayList<Person> perdat = new ArrayList<Person>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("prénom");
		String prenom = sc.nextLine();
		System.out.println("nom");
		String nom = sc.nextLine();
		System.out.println("mail");
		String mail = sc.nextLine();
		System.out.println("date");
		String sdate = sc.nextLine();
		LocalDate date = DateUtils.toDate(sdate);
		Person user = new Person(prenom, nom, mail, date);
		
		perdat.add(user);
		
		PersonDaoCsvImpl db = new PersonDaoCsvImpl();
		
		System.out.println("sauver l'user ? y/n");
		String resp = sc.nextLine();
		if (resp == "y") {
			db.save(user);
			perdat.add(user);
			System.out.println("sauvé");
		} else {
			perdat.add(user);
			System.out.println("pas sauvé");
		}
		
		System.out.println("sauver tous les users ? y/n");
		String resps = sc.nextLine();
		if (resps == "y") {
			db.saveAll(perdat);
			System.out.println("sauvés");
		} else {
			System.out.println("pas sauvés");
		}
		
		sc.close();
		
	}

}
