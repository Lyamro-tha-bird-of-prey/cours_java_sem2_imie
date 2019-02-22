package main.java.fr.imie.bank;

import java.time.LocalDate;
import java.util.Scanner;

import main.java.fr.imie.bank.model.Person;
import main.java.fr.imie.bank.model.PersonDaoCsvImpl;

public class MainConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PersonDaoCsvImpl perdat = new PersonDaoCsvImpl();
		
		System.out.println("entrer les informations de l'utilisateur:");
		Person user = new Person();
		
		System.out.println("entrer le prénom");
		String firstN = sc.nextLine();
		user.setFirstName(firstN);
		
		System.out.println("entrer le nom");
		String lastN = sc.nextLine();
		user.setLastName(lastN);
		
		System.out.println("entrer un email");
		String em = sc.nextLine();
		user.setEmail(em);
		
		System.out.println("entrer une date de naissance");
		String strd = sc.nextLine();
		LocalDate dn = DateUtils.toDate(strd);
		
		user.setBirthDate(dn);
		
		System.out.println("utilisateur créé");
		perdat.save(user);
		System.out.println(user.toString());
		
		sc.close();
		
		
		
	}

}
