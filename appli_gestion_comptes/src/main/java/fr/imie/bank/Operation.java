package main.java.fr.imie.bank;

import java.time.LocalDate;
import java.util.Scanner;

import main.java.fr.imie.bank.model.Person;
import main.java.fr.imie.bank.model.PersonDaoCsvImpl;

public class Operation {
	public static void displayOptions() {
		System.out.println("Opérations possibles:");
		System.out.println("pour créer un utilisateur, tapez 1");
		System.out.println("pour créer un compte, tapez 2");
		System.out.println("pour associer un compte à un utilisateur, tapez 3");
		System.out.println("pour supprimer un utilisateur, tapez 4");
		System.out.println("pour supprimer un compte, tapez 5");
		System.out.println("pour arrêter de faire des opérations, tapez 6");
	}
	
	public static void createUser() {
		System.out.println("création d'un utilisateur");
		
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
	
    public static void createAccount() {
    	System.out.println("création d'un compte");
	}

    public static void associateAccount() {
    	System.out.println("association d'un compte à un utilisateur");
    }

    public static void deleteUser() {
    	System.out.println("suppression d'un utilisateur");
    }

    public static void deleteAccount() {
    	System.out.println("suppression d'un compte");
    }
    
    public static void closeConsole(boolean bool) {
    	System.out.println("fermeture de la console");
    	bool = true;
    }
}
